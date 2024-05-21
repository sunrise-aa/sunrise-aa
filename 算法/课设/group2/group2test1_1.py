import networkx as nx
import random
import matplotlib.pyplot as plt

from group2Test1 import generate_random_graph


class UnionFind:
    def __init__(self, vertices):
        self.parent = {v: v for v in vertices}
        self.rank = {v: 0 for v in vertices}

    def find(self, vertex):
        if self.parent[vertex] != vertex:
            self.parent[vertex] = self.find(self.parent[vertex])
        return self.parent[vertex]

    def union(self, root1, root2):
        if self.rank[root1] > self.rank[root2]:
            self.parent[root2] = root1
        elif self.rank[root1] < self.rank[root2]:
            self.parent[root1] = root2
        else:
            self.parent[root2] = root1
            self.rank[root1] += 1

        print("UnionFind状态:")
        print("Parent:", self.parent)
        print("Rank  :", self.rank)
        print("----------------------")

def kruskal(graph):
    edges = []
    for v1, v2, data in graph.edges(data=True):
        edges.append((v1, v2, data['weight']))

    edges.sort(key=lambda x: x[2])  # Sort edges by weight
    minimum_spanning_tree = nx.Graph()
    union_find = UnionFind(graph.nodes)

    for v1, v2, weight in edges:
        root1 = union_find.find(v1)
        root2 = union_find.find(v2)

        if root1 != root2:
            minimum_spanning_tree.add_edge(v1, v2, weight=weight)
            union_find.union(root1, root2)

    return minimum_spanning_tree

def visualize_graph_fixed_positions(graph, original_positions, title):
    labels = nx.get_edge_attributes(graph, 'weight')
    nx.draw(graph, pos=original_positions, with_labels=True, font_weight='bold', node_size=700, node_color='skyblue')
    nx.draw_networkx_edge_labels(graph, pos=original_positions, edge_labels=labels)
    plt.title(title)
    plt.show()

# 示例用法
vertices = ['A', 'B', 'C', 'D', 'E']
edges = 6  # 随机生成的边数
random_graph = generate_random_graph(vertices, edges)

print("随机生成的图:")
original_positions = nx.spring_layout(random_graph)  # 记录原始节点位置
visualize_graph_fixed_positions(random_graph, original_positions, "随机图")

minimum_spanning_tree = kruskal(random_graph)

print("\nKruskal算法生成的最小生成树:")
visualize_graph_fixed_positions(minimum_spanning_tree, original_positions, "最小生成树")
