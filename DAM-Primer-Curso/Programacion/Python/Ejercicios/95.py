"""Printea cada primer número de cada lista, la segunda lista entera hacia abajo y entera y
todos los valores"""

lista=[[1,2,3],[4,5,6],[7,8,9],[10,11,12]]
print(lista[1])
print("------")
print(lista[1][0])
print("------")
for x in range(len(lista[1])):
    print(lista[1][x])
print("------")
for k in range(len(lista)):
    for x in range(len(lista[k])):
        print(lista[k][x])
print("------")
