from typing import Set
import networkx as nx
import pyformlang
from pyformlang.cfg import Variable, Terminal
from scipy.sparse import lil_matrix

from project.task6 import cfg_to_weak_normal_form


def cfpq_with_matrix(
    cfg: pyformlang.cfg.CFG,
    graph: nx.DiGraph,
    start_nodes: Set[int] = None,
    final_nodes: Set[int] = None,
) -> set[tuple[int, int]]:
    cfg = cfg_to_weak_normal_form(cfg)
    nonterminals = {prod.head for prod in cfg.productions}
    variable_indices = {var: idx for idx, var in enumerate(nonterminals)}
    num_vertices = graph.number_of_nodes()

    adj_matrices = {
        var: lil_matrix((num_vertices, num_vertices), dtype=bool)
        for var in nonterminals
    }

    for edge in graph.edges(data=True):
        for production in cfg.productions:
            if len(production.body) == 1 and isinstance(production.body[0], Terminal):
                if str(edge[2].get("label", "")) == str(production.body[0]):
                    adj_matrices[production.head][edge[0], edge[1]] = True

    mat_changes = True
    while mat_changes:
        mat_changes = False
        for production in cfg.productions:
            if len(production.body) == 2:
                mat_a, mat_b = production.body
                if mat_a in variable_indices and mat_b in variable_indices:
                    before = adj_matrices[production.head].nnz
                    adj_matrices[production.head] += (
                        adj_matrices[mat_a] * adj_matrices[mat_b]
                    )
                    after = adj_matrices[production.head].nnz
                    if before != after:
                        mat_changes = True

    result = set()
    for variable, matrix in adj_matrices.items():
        if variable == cfg.start_symbol:
            matrix = matrix.tocoo()
            for i, j in zip(matrix.row, matrix.col):
                if (start_nodes is None or i in start_nodes) and (
                    final_nodes is None or j in final_nodes
                ):
                    result.add((i, j))
    return result
