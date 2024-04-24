from typing import Set
import networkx as nx
import pyformlang
from pyformlang.cfg import Variable
from project.task6 import cfg_to_weak_normal_form


def cfpq_with_matrix(
    cfg: pyformlang.cfg.CFG,
    graph: nx.DiGraph,
    start_nodes: Set[int] = None,
    final_nodes: Set[int] = None,
) -> set[tuple[int, int]]:
    cfg = cfg_to_weak_normal_form(cfg)
    n = len(graph.nodes)
    mat = {}

    for i, j, data in graph.edges(data=True):
        label = data["label"]
        for prod in cfg.productions:
            if (
                len(prod.body) == 1
                and isinstance(prod.body[0], Variable)
                and prod.body[0].value == label
            ):
                if (i, j) not in mat:
                    mat[(i, j)] = set()
                mat[(i, j)].add(prod.head)

    while True:
        mat_changed = False
        new_mat = mat.copy()

        for i in range(n):
            for j in range(n):
                for k in range(n):

                    if (i, k) in mat and (k, j) in mat:
                        for prod in cfg.productions:

                            if len(prod.body) == 2:
                                mat_b, mat_c = prod.body
                                if mat_b in mat[(i, k)] and mat_c in mat[(k, j)]:
                                    if (i, j) not in new_mat:
                                        new_mat[(i, j)] = set()
                                    if prod.head not in new_mat[(i, j)]:
                                        new_mat[(i, j)].add(prod.head)
                                        mat_changes = True
        mat = new_mat
        if not mat_changed:
            break

    result = set()
    for i in range(n):
        for j in range(n):

            if (i, j) in mat:
                if (start_nodes is None or i in start_nodes) and (
                    final_nodes is None or j in final_nodes
                ):
                    result.add((i, j))

    return result
