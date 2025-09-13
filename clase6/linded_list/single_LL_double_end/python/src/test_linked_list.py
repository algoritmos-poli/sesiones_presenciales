from node import Node
from linked_list import LinkedList

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