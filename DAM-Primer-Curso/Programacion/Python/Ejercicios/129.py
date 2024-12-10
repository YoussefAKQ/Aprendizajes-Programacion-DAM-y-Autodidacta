def multiplicar(lista,va):
    for x in range(len(lista)):
        multi=lista[x]*va
        print(multi)

#bloque principal

lista=[3,7,8,10,2]
print("Lista original:",lista)
print("Lista multiplicando cada elemento por 3")
multiplicar(lista,3)
