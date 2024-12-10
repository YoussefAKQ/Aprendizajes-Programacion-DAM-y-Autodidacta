def cargar():
    lista=[]
    for x in range(10):
        valor=int(input("Introduce un valor:"))
        lista.append(valor)
    return lista

def imprimir(lista):
    for x in range(len(lista)):
        print(lista[x],end=",")


#bloque principal
lista=cargar()
imprimir(lista)
