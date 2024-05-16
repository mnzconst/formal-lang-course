from typing import Set

from networkx import MultiDiGraph
from pyformlang.regular_expression import Regex
from pyformlang.finite_automaton import *


def regex_to_dfa(regex: str) -> DeterministicFiniteAutomaton:
    return Regex(regex).to_epsilon_nfa().to_deterministic().minimize()


def graph_to_nfa(
    graph: MultiDiGraph, start_states: Set[int], final_states: Set[int]
) -> NondeterministicFiniteAutomaton:
    nfa = NondeterministicFiniteAutomaton()

    if len(start_states) == 0:
        start_states = graph.nodes
    if len(final_states) == 0:
        final_states = graph.nodes

    for state in start_states:
        nfa.add_start_state(State(state))
    for state in final_states:
        nfa.add_final_state(State(state))
    for u, v, label in graph.edges(data="label"):
        nfa.add_transition(u, label, v)

    return nfa.remove_epsilon_transitions()
