class Node(object):
    def __init__(self, data, next = None):
        """Instantiates a Node with default next of None"""
        self.data = data
        self.next = next

    def __str__(self):
        return f"[{self.data}]"
    
class LikedList():
    def __init__(self):
        self.head = None        
        self.__sizeof__ = 0

    def add(self, data):
        if not self.head:
            self.head = Node(data)
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = Node(data)
        self.__sizeof__ += 1

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

    def contains(self, data):
        current = self.head
        while current:
            if current.data == data:
                return True
            current = current.next
        return False
    
    def size(self):
        return self.__sizeof__
    
    def __iter__(self):
        current = self.head
        while current:
            yield current.data
            current = current.next

class SetAsLinkedList:
    def __init__(self):
        self._data = LikedList()
    
    def add(self, element):
        # Antes de añadir, verificamos si el elemento ya existe
        if not self._data.contains(element):
            self._data.add(element) 
    
    def remove(self, element):
        # Intentamos eliminar el elemento
        if not self._data.remove(element):
            print(f"Error: El elemento '{element}' no se encuentra en el set.")
            return False
        return True
    
    def __contains__(self, element):
        # El operador 'in' para listas también tiene complejidad O(n)
        return self._data.contains(element)
    
    def union(self, other):
        # Unión de dos sets
        result = SetAsLinkedList()
        for item in self._data:
            result.add(item)
        for item in other._data:
            result.add(item)
        return result
    
    def intersection(self, other):
        # Intersección de dos sets
        result = SetAsLinkedList()
        for item in self._data:
            if item in other._data:
                result.add(item)
        return result
    
    def difference(self, other):
        # Diferencia de dos sets
        result = SetAsLinkedList()
        for item in self._data:
            if item not in other._data:
                result.add(item)
        return result
    
    def simetric_difference (self, other):
        # Diferencia simétrica de dos sets
        result = SetAsLinkedList()
        for item in self._data:
            if item not in other._data:
                result.add(item)
        for item in other._data:
            if item not in self._data:
                result.add(item)
        return result
    
    def size(self):
        return self._data.size()

    def __repr__(self):
        
        if not self._data:
            return "{}"
        else:
            set_str = "{"
            for item in self._data:
                set_str += str(item) + ", "
            set_str = set_str[:-2] + "}"  # Remove last comma and space
            return set_str
            
    

#album_set1 = set(["Thriller", 'AC/DC', 'Back in Black'])
album_set1 = SetAsLinkedList()
album_set1.add("Thriller")
album_set1.add("AC/DC")
album_set1.add("Back in Black")

#album_set2 = set([ "AC/DC", "Back in Black", "The Dark Side of the Moon"])
album_set2 = SetAsLinkedList()
album_set2.add("AC/DC")
album_set2.add("Back in Black")
album_set2.add("The Dark Side of the Moon")

print("Album Set 1:", album_set1)
print("Album Set 2:", album_set2)

# intersection = album_set1 & album_set2
intersection = album_set1.intersection(album_set2)
print("Intersection:", intersection)

# union = album_set1 | album_set2
union = album_set1.union(album_set2)
print("Union:", union)

# difference = album_set1 - album_set2
difference = album_set1.difference(album_set2)
print("Difference (Set1 - Set2):", difference)  
# difference2 = album_set2 - album_set1
difference2 = album_set2.difference(album_set1)     
print("Difference (Set2 - Set1):", difference2)

# symmetric_difference = album_set1 ^ album_set2
symmetric_difference = album_set1.simetric_difference(album_set2)
print("Symmetric Difference:", symmetric_difference)

# Size of sets
print("Size of Album Set 1:", album_set1.size())
print("Size of Album Set 2:", album_set2.size())

# Testing remove method
album_set1.remove("Thriller")
print("Album Set 1 after removing 'Thriller':", album_set1)
album_set1.remove("Non-Existent Album")  
print("Album Set 1 contains 'AC/DC':", "AC/DC" in album_set1)