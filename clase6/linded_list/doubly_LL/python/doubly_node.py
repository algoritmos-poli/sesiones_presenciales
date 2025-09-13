from node import Node

class DoublyNode(Node):
    def __init__(self, data=0):
        super().__init__(data)
        self.prev = None

    def __str__(self):
        return f"[{self.data}]"

if __name__ == "__main__":
    # Example usage
    node1 = DoublyNode(5)
    print(node1)  # Output: [5]
    node2 = DoublyNode()
    print(node2)  # Output: [0]
