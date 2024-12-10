def cargar_lista():
    lista=[]
    for x in range(10):
        valores=int(input("Introduce los valores:"))
        lista.append(valores)
    return lista

def dividir_listas(lis):
    positivos=[]
    negativos=[]
    for x in range(len(lis)):
        if lis[x]>0:
            positivos.append(lis[x])
        else:
            if lis[x]<0:
                negativos.append(lis[x])
    
    return [positivos,negativos]

def imprimir_listas(pos,neg):
    print("Los positivos son:")
    for x in range(len(pos)):
        print(pos[x])
    print("Los negativos son:")
    for x in range(len(neg)):
        print(neg[x])

#bloque principal
lista=cargar_lista()
positivos,negativos=dividir_listas(lista)
imprimir_listas(positivos,negativos)
