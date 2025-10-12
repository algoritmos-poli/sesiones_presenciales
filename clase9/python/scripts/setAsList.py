class SetAsList:
    def __init__(self):
        self._data = []  # Usamos una lista interna para guardar los datos

    def add(self, element):
        # Antes de añadir, verificamos si el elemento ya existe
        if element not in self._data:
            self._data.append(element)

    def remove(self, element):
        # devuelve True si se elimina, False si no se encuentra
        if element in self._data:
            self._data.remove(element)
            return True
        else:
            return False

    def __contains__(self, element):
        # El operador 'in' para listas también tiene complejidad O(n)
        return element in self._data

    def __str__(self):
        # Representación en string del objeto
        return str(self._data)
    
    def union(self, other):
        # Unión de dos sets
        result = SetAsList()
        for item in self._data:
            result.add(item)
        for item in other._data:
            result.add(item)
        return result
    
    def intersection(self, other):
        # Intersección de dos sets
        result = SetAsList()
        for item in self._data:
            if item in other._data:
                result.add(item)
        return result
    
    def difference(self, other):
        # Diferencia de dos sets
        result = SetAsList()
        for item in self._data:
            if item not in other._data:
                result.add(item)
        return result
    
    def size(self):
        return len(self._data)
    
    def simetric_difference(self, other):
        # Diferencia simétrica de dos sets
        result = SetAsList()
        for item in self._data:
            if item not in other._data:
                result.add(item)
        for item in other._data:
            if item not in self._data:
                result.add(item)
        return result
    
    """
    def __repr__(self):
        if not self._data:
            return "{}"
        return "{" + ", ".join(map(str, self._data)) + "}"
    """
    def __repr__(self):
        if not self._data:
            return "{}"
        else:
            for i in range(len(self._data)):
                self._data[i] = str(self._data[i])
        return "{" + ", ".join(self._data) + "}"


# Probando nuestra implementación
#album_set1 = set(["Thriller", 'AC/DC', 'Back in Black'])
album_set1 = SetAsList()
album_set1.add("Thriller")
album_set1.add("AC/DC")
album_set1.add("Back in Black")

#album_set2 = set([ "AC/DC", "Back in Black", "The Dark Side of the Moon"])
album_set2 = SetAsList()
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