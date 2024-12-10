def cargar_datos():
    lista=[]
    for x in range(0,5):
        palabras=input("Introduce la palabra: ")
        lista.append(palabras)
    return lista

def intercambiar_letras(palabras):
    aux=palabras[0]
    palabras[0]=palabras[-1]
    palabras[-1]=aux
    print(lista)

#bloque principal
lista=cargar_datos()
intercambiar_letras(lista)
