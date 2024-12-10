def cargar():
    lista=[]
    continua="s"
    while continua=="s":
        valor=int(input("Introduce un valor:"))
        lista.append(valor)
        continua=input("Agrega otro elemento a la lista[s/n]:")
    print(id(lista))
    return lista

def fijar_cero(lista):
    for x in range(len(lista)):
        if lista[x]<10:
            lista[x]=0

def imprimir(lista):
    for elemento in lista:
        print(elemento,"-",sep="",end="")
    print("")
    
    
#bloque principal
lista=cargar()
print("Lista antes de modificar")
imprimir(lista)
fijar_cero(lista)
print("Lista despues de modificar")
imprimir(lista)
print(id(lista))
