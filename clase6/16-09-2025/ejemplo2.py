# append
l = [1, 2, 3]
l.append('carro')
l.append([-1,-2]) # Comparar con extend
# extend
l.extend([-1,-2])
# index
i = l.index([-1,-2])
# insert
l.insert(i,'UdeA')
# pop
e = l.pop()
e = l.pop(i + 1)
# remove
l.remove('carro')
# reverse
l2 = [1, 6, 3, 4, 8, 22]
l2.reverse()
# sort
l2.sort()
l2.sort(reverse = True)
# sum
s = sum(l2)
