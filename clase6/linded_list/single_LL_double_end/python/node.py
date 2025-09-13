class Node:
    def __init__(self, data=0):
        self.data = data
        self.next = None

    def __str__(self):
        return f"[{self.data}]"

if __name__ == "__main__":
    # Example usage
    node1 = Node(5)
    print(node1)  # Output: [5]
    node2 = Node()
    print(node2)  # Output: [0]

