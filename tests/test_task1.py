import pytest
from project.task1 import graph_info, combine_graphs
import networkx as nx
import cfpq_data
import os


@pytest.mark.parametrize(
    "graph_name, expected_output",
    [
        (
            "skos",
            (
                144,
                252,
                [
                    "type",
                    "definition",
                    "isDefinedBy",
                    "label",
                    "subPropertyOf",
                    "comment",
                    "scopeNote",
                    "inverseOf",
                    "range",
                    "domain",
                    "contributor",
                    "disjointWith",
                    "creator",
                    "example",
                    "first",
                    "rest",
                    "description",
                    "seeAlso",
                    "subClassOf",
                    "title",
                    "unionOf",
                ],
            ),
        ),
        ("wc", (332, 269, ["d", "a"])),
    ],
)
def test_graph_info(graph_name, expected_output):
    vertexes, edges, labels = graph_info(graph_name)
    assert vertexes == expected_output[0]
    assert edges == expected_output[1]
    assert labels == expected_output[2]


@pytest.mark.parametrize(
    "v_graph_1, v_graph_2, file_name, labels, expected_graph",
    [
        (10, 20, "./output", ("a", "b"), [31, 32, ["b", "a"]]),
        (42, 17, "./result", ("asc", "qwb"), [60, 61, ["asc", "qwb"]]),
    ],
)
def test_graph_combine(v_graph_1, v_graph_2, file_name, labels, expected_graph):
    combine_graphs(v_graph_1, v_graph_2, file_name, labels)
    res = nx.nx_pydot.read_dot(file_name)
    assert res.number_of_nodes() == expected_graph[0]
    assert res.number_of_edges() == expected_graph[1]
    assert cfpq_data.get_sorted_labels(res) == expected_graph[2]
    os.remove(file_name)
