def cargar():
    lista=[]
    for x in range(5):
        valor=int(input("Introduce el valor:"))
        lista.append(valor)
    return lista

def imprimir(lista):
    for elemento in lista:
        print(elemento)
        
def mayor(lista):
    for elemento in lista:
        may=lista[0]
        if elemento>may:
            may=elemento
    print("El elemento mayor de la lista es",may)

def suma(lista):
    suma=0
    for elemento in lista:
        suma=suma+elemento
    print("La suma es",suma)













#bloque principal
lista=cargar()
imprimir(lista)
mayor(lista)
suma(lista)
