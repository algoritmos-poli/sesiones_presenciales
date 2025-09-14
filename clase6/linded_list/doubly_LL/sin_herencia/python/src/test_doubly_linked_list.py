from doubly_linked_list import DoublyLinkedList


dll = DoublyLinkedList()
print("Is empty?", dll.is_empty())  # Output: True
dll.add_first(10)
dll.add_last(20)
dll.add_first(5)
print(dll)  # Output: [5] <-> [10] <-> [20]
print("Size:", dll.size())  # Output: 3
dll.traverse_forward()  # Output: [5] <-> [10] <-> [20]
dll.traverse_backward() # Output: [20] <-> [10] <-> [5]
    
node_10 = dll.get(10)
if node_10:
    dll.add_after(node_10, 15)
print(dll)  # Output: [5] <-> [10] <-> [15] <-> [20]
    
dll.remove_front()
print(dll)  # Output: [10] <-> [15] <-> [20]
    
dll.remove_end()
print(dll)  # Output: [10] <-> [15]
    
node_15 = dll.get(15)
if node_15:
    dll.remove_node(node_15)
print(dll)  # Output: [10]

print("Size:", dll.size())  # Output: Size: 1
print("Contains 10:", dll.contains(10))  # Output: Contains 10: True    
dll.clear()
print("After clearing:", dll)  # Output: Empty List
