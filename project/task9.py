from project.task8 import cfg_to_rsm
from pyformlang.rsa import RecursiveAutomaton
from pyformlang.cfg import CFG
from pyformlang.finite_automaton import State, Symbol
import networkx as nx
from typing import *
from copy import deepcopy
from itertools import product


def cfpq_with_gll(
    cfg_or_rsm: CFG | RecursiveAutomaton,
    graph: nx.DiGraph,
    start_nodes: set[int] = None,
    final_nodes: set[int] = None,
) -> set[tuple[int, int]]:
    pass
