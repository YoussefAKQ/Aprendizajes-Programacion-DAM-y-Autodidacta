
def cargar_lista():
    lista=[]
    cantpalabras=int(input("Introduce la cantidad de palabras que quieres en la lista"))
    for x in range(cantpalabras):
        palabras=input("Introduce la palabra: ")
        lista.append(palabras)
    return lista

def mostrar_grandes(lista):
    for elemento in lista:
        if len(elemento)>5:
            print("La palabra",elemento,"tiene más de 5 caracteres.")

#bloque principal
lista=cargar_lista()
mostrar_grandes(lista)
