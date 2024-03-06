import scipy as sp

from typing import Iterable
from pyformlang.finite_automaton import *


class FiniteAutomaton:
    matrix = None
    start_states = None
    final_states = None
    states_to_int = None
    nfa = None

    def __init__(
        self,
        fa: NondeterministicFiniteAutomaton = None,
        *,
        matrix=None,
        start_states=None,
        final_states=None,
        states_to_int=None
    ):
        if fa is None:
            self.matrix = matrix
            self.start_states = start_states
            self.final_states = final_states
            self.states_to_int = states_to_int
            self.nfa = to_nfa(self)
        else:
            self.states_to_int = {v: i for i, v in enumerate(fa.states)}
            self.nfa = fa
            self.matrix = to_mat(fa, self.states_to_int)
            self.start_states = fa.start_states
            self.final_states = fa.final_states

    def accepts(self, word: Iterable[Symbol]) -> bool:
        return self.nfa.accepts(word)

    def is_empty(self) -> bool:
        return self.nfa.is_empty()


def to_mat(fa: NondeterministicFiniteAutomaton, states_to_int=None):
    len_states = len(fa.states)
    result = dict()

    for symbol in fa.symbols:
        result[symbol] = sp.sparse.dok_matrix((len_states, len_states), dtype=bool)
        for v, edges in fa.to_dict().items():
            if symbol in edges:
                for u in {edges[symbol]}:
                    result[symbol][states_to_int[v], states_to_int[u]] = True

    return result


def to_nfa(fa: FiniteAutomaton):
    nfa = NondeterministicFiniteAutomaton()

    for symbol in fa.matrix.keys():
        matrix_size = fa.matrix[symbol].shape[0]
        for u in range(matrix_size):
            for v in range(matrix_size):
                if fa.matrix[symbol][u, v]:
                    nfa.add_transition(
                        State(fa.states_to_int[State(u)]),
                        symbol,
                        State(fa.states_to_int[State(v)]),
                    )

    for state in fa.start_states:
        nfa.add_start_state(State(fa.states_to_int[State(state)]))
    for state in fa.final_states:
        nfa.add_final_state(State(fa.states_to_int[State(state)]))

    return nfa


def intersect_automata(fa1: FiniteAutomaton, fa2: FiniteAutomaton) -> FiniteAutomaton:
    matrix = dict()
    start_states = set()
    final_states = set()
    states_to_int = dict()
    symbols = fa1.matrix.keys() & fa2.matrix.keys()

    for symbol in symbols:
        matrix[symbol] = sp.sparse.kron(fa1.matrix[symbol], fa2.matrix[symbol], "csr")

    for u, i in fa1.states_to_int.items():
        for v, j in fa2.states_to_int.items():

            k = len(fa2.states_to_int) * i + j
            states_to_int[k] = k

            if u in fa1.start_states and v in fa2.start_states:
                start_states.add(State(k))

            if u in fa1.final_states and v in fa2.final_states:
                final_states.add(State(k))

    return FiniteAutomaton(
        fa=None,
        matrix=matrix,
        start_states=start_states,
        final_states=final_states,
        states_to_int=states_to_int,
    )
