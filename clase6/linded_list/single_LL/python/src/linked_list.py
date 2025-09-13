from node import Node

class LinkedList:
    def __init__(self):
        self.head = None

    def add_first(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head = new_node

    def add_last(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    def add_after(self, prev_node, value):
        if prev_node is None:
            return # Previous node cannot be None
        new_node = Node(value)
        new_node.next = prev_node.next
        prev_node.next = new_node
       
    def remove(self, value):
        if self.head is None:
            return False

        # If the head node is the one to be removed
        if self.head.data == value:
            self.head = self.head.next
            return True

        current = self.head
        while current.next:
            if current.next.data == value:
                current.next = current.next.next
                return True
            current = current.next
        return False  # Node not found

    def get(self, value):
        current = self.head
        while current:
            if current.data == value:
                return current
            current = current.next
        return None  # Node not found
    
    def clear(self):
        self.head = None
        self.tail = None

    def contains(self, data):
        return self.get(data) is not None
    
    def size(self):
        count = 0
        current = self.head
        while current:
            count += 1
            current = current.next
        return count
    
    def __str__(self):
        nodes = []
        current = self.head
        while current:
            nodes.append(str(current))
            current = current.next
        return " -> ".join(nodes) if nodes else "Empty List"

if __name__ == "__main__":
    ll = LinkedList()
    ll.add_last(10)
    ll.add_first(5)
    ll.add_last(15)
    print(ll)  # Output: [5] -> [10] -> [15]
    ll.add_after(ll.get(10), 12)
    print(ll)  # Output: [5] -> [10] -> [12] -> [15]
    ll.remove(5)
    print(ll)  # Output: [10] -> [12] -> [15]
    print("Size:", ll.size())  # Output: Size: 3
    print("Contains 12:", ll.contains(12))  # Output: Contains 12: True
    ll.clear()
    print(ll)  # Output: Empty List
    