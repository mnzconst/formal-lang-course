import networkx as nx
import pyformlang


def cfpq_with_tensor(
  rsm: pyformlang.rsa.RecursiveAutomaton,
  graph: nx.DiGraph,
  final_nodes: set[int] = None,
  start_nodes: set[int] = None,
) -> set[tuple[int, int]]:
  pass


def cfg_to_rsm(cfg: pyformlang.cfg.CFG) -> pyformlang.rsa.RecursiveAutomaton:
  pass


def ebnf_to_rsm(ebnf: str) -> pyformlang.rsa.RecursiveAutomaton:
  pass
