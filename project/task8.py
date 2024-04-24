from typing import Dict, Any

import networkx as nx
import pyformlang
from numpy import kron
from pyformlang.finite_automaton import State, NondeterministicFiniteAutomaton
from scipy.sparse import csr_matrix, block_diag

from project.task2 import graph_to_nfa
from project.task3 import FiniteAutomaton



def cfpq_with_tensor(
        rsm: pyformlang.rsa.RecursiveAutomaton,
        graph: nx.MultiDiGraph,
        final_nodes: set[int] = None,
        start_nodes: set[int] = None,
) -> set[tuple[int, int]]:

    # for production in cfg.productions:
    #     if len(production.body) != 0:
    #         continue
    #
    #     variable = production.head
    #     if variable not in graph_decomposed.matrices:
    #         graph_decomposed.matrices[variable] = csr_matrix(
    #             (graph_decomposed.num_states, graph_decomposed.num_states), dtype=bool
    #         )
    #
    #     for vertice in range(graph_decomposed.num_states):
    #         graph_decomposed.matrices[variable][vertice, vertice] = True

    transitive_closure = csr_matrix(
        (graph_decomposed.num_states, graph_decomposed.num_states), dtype=bool
    )
    matrix_changed = True
    states_by_indices = {
        i: state for state, i in rsm_decomposed.states_with_indices.items()
    }
    while matrix_changed:
        matrix_changed = False

        prev_nnz = transitive_closure.nnz
        transitive_closure = rsm_decomposed.intersect(
            graph_decomposed
        ).transitive_closure()
        matrix_changed |= prev_nnz != transitive_closure.nnz

        for idx_from, idx_to in zip(*transitive_closure.nonzero()):
            state_from = states_by_indices[idx_from // graph_decomposed.num_states]
            variable = state_from.value[0]

            # if variable not in rsm.:
            #     continue

            state_to = states_by_indices[idx_to // graph_decomposed.num_states]
            if (
                    state_from in rsm_decomposed.start_states
                    and state_to in rsm_decomposed.final_states
            ):
                if variable not in graph_decomposed.matrices:
                    graph_decomposed.matrices[variable] = csr_matrix(
                        (graph_decomposed.num_states, graph_decomposed.num_states),
                        dtype=bool,
                    )

                graph_decomposed.matrices[variable][
                    idx_from % graph_decomposed.num_states,
                    idx_to % graph_decomposed.num_states,
                ] = True

    return set(
        (v_from, v_to)
        for variable, matrix in graph_decomposed.matrices.items()
        for v_from, v_to in zip(*matrix.nonzero())
        # if variable in cfg.variables
    )


def cfg_to_rsm(cfg: pyformlang.cfg.CFG) -> pyformlang.rsa.RecursiveAutomaton:
    return pyformlang.rsa.RecursiveAutomaton.from_text(cfg.to_text())


def ebnf_to_rsm(ebnf: str) -> pyformlang.rsa.RecursiveAutomaton:
    return pyformlang.rsa.RecursiveAutomaton.from_text(ebnf)
