lista=[[100,7,85,8], [4,8,56,25], [67,89,23,1], [78,56]]

print(lista)
for k in range(len(lista)):
    for x in range(len(lista[k])):
        if lista[k][x]>50:
            lista[k][x]=0
print(lista)



"""Había que hacerlo solo con el primer elemento de la lista pero este estaría
bien si fuesen todos"""
