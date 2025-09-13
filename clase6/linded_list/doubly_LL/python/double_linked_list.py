from doubly_node import DoublyNode

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def add_first(self, value):
        new_node = DoublyNode(value)
        if self.head is None:
            self.head = new_node
            self.tail = new_node
        else:
            new_node.next = self.head
            self.head.prev = new_node
            self.head = new_node
    
    def add_last(self, value):
        new_node = DoublyNode(value)
        if self.tail is None:
            self.head = new_node
            self.tail = new_node
        else:
            new_node.prev = self.tail
            self.tail.next = new_node
            self.tail = new_node
    
    def add_after(self, prev_node, value):
        if prev_node is None:
            return # Previous node cannot be None
        new_node = DoublyNode(value)
        new_node.next = prev_node.next
        new_node.prev = prev_node
        prev_node.next = new_node
        if new_node.next:
            new_node.next.prev = new_node
        else:
            self.tail = new_node  # Update tail if added at the end
    
    def get(self, value):
        current = self.head
        while current:
            if current.data == value:
                return current
            current = current.next
        return None  # Node not found
    
    def is_empty(self):
        return self.head is None
    
    def size(self):
        count = 0
        current = self.head
        while current:
            count += 1
            current = current.next
        return count
    
    def clear(self):
        self.head = None
        self.tail = None
    
    def traverse_forward(self):
        current = self.head
        while current:
            if current.next is None:
                print(current)
            else:
                print(current, end=" <-> ")
            current = current.next
        print()  # For newline after traversal
            
    def traverse_backward(self):
        current = self.tail
        while current:
            if current.prev is None:
                print(current)
            else:
                print(current, end=" <-> ")
            current = current.prev
        print()  # For newline after traversal


    def remove_front(self):
        if self.head is None:
            return  # List is empty
        if self.head == self.tail:
            self.head = None
            self.tail = None
        else:
            self.head = self.head.next
            self.head.prev = None

    def remove_end(self):
        if self.tail is None:
            return  # List is empty
        if self.head == self.tail:
            self.head = None
            self.tail = None
        else:
            self.tail = self.tail.prev
            self.tail.next = None
    
    def remove_node(self, node):
        if node is None or self.head is None:
            return  # Node is None or list is empty
        if node == self.head:
            self.remove_front()
            return
        if node == self.tail:
            self.remove_end()
            return
        node.prev.next = node.next
        node.next.prev = node.prev

    def __str__(self):
        nodes = []
        current = self.head
        while current:
            nodes.append(str(current))
            current = current.next
        return " <-> ".join(nodes) if nodes else "Empty List"
    
if __name__ == "__main__":
    ll = DoublyLinkedList()
    print("Is empty?", ll.is_empty())  # Output: True
    ll.add_first(10)
    ll.add_last(20)
    ll.add_first(5)
    print(ll)  # Output: [5] <-> [10] <-> [20]
    print("Size:", ll.size())  # Output: 3
    ll.traverse_forward()  # Output: [5] <-> [10] <-> [20]
    ll.traverse_backward() # Output: [20] <-> [10] <-> [5]
    
    node_10 = ll.get(10)
    if node_10:
        ll.add_after(node_10, 15)
    print(ll)  # Output: [5] <-> [10] <-> [15] <-> [20]
    
    ll.remove_front()
    print(ll)  # Output: [10] <-> [15] <-> [20]
    
    ll.remove_end()
    print(ll)  # Output: [10] <-> [15]
    
    node_15 = ll.get(15)
    if node_15:
        ll.remove_node(node_15)
    print(ll)  # Output: [10]
    
    ll.clear()
    print("After clearing:", ll)  # Output: Empty List