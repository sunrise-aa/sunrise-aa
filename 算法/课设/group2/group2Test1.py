import networkx as nx
import matplotlib.pyplot as plt

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
manual_graph = nx.Graph()

# 添加节点
nodes = ['A', 'B', 'C', 'D', 'E']
manual_graph.add_nodes_from(nodes)

# 添加边及权重
edges_with_weights = [('A', 'B', 4), ('A', 'C', 2), ('B', 'C', 5), ('B', 'D', 10), ('C', 'D', 1), ('C', 'E', 7), ('D', 'E', 3)]
manual_graph.add_weighted_edges_from(edges_with_weights)


print("随机生成的图:")
original_positions = nx.spring_layout(manual_graph)  # 记录原始节点位置
visualize_graph_fixed_positions(manual_graph, original_positions, "随机图")

minimum_spanning_tree = kruskal(manual_graph)

print("\nKruskal算法生成的最小生成树:")
for edge in minimum_spanning_tree.edges(data=True):
    print(edge)
visualize_graph_fixed_positions(minimum_spanning_tree, original_positions, "最小生成树")