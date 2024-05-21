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

# 示例用法
vertices = ['A', 'B', 'C', 'D', 'E']
union_find = UnionFind(vertices)

# 初始状态
print("初始状态:")
print("Parent:", union_find.parent)
print("Rank  :", union_find.rank)
print("----------------------")

# 合并两组节点
union_find.union('A', 'B')
union_find.union('C', 'D')

# 合并后的状态
print("合并后的状态:")
print("Parent:", union_find.parent)
print("Rank  :", union_find.rank)
union_find.union('A','C')
print("Parent:", union_find.parent)
print(  union_find.find('A')==union_find.find('D'))
