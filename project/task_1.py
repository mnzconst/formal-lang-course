import cfpq_data
import networkx as nx


def graph_info(graph_name):
    graph = cfpq_data.graph_from_csv(cfpq_data.download(graph_name))
    return (
        graph.number_of_nodes(),
        graph.number_of_edges(),
        cfpq_data.get_sorted_labels(graph),
    )


def combine_graphs(v_graph_1, v_graph_2, file_name, labels):
    res = cfpq_data.labeled_two_cycles_graph(v_graph_1, v_graph_2, labels=labels)
    nx.nx_pydot.write_dot(res, file_name)
