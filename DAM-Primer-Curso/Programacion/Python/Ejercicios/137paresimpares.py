def cargar_lista():
    lista=[]
    for x in range(10):
        valores=int(input("Introduce los valores:"))
        lista.append(valores)
    return lista

def dividir_listas(lis):
    #lis=[1,2,3,4,5,6,7,8,9,10]
    pares=[]
    impares=[]
    for x in range(len(lis)):
        if lis[x]%2==0:#el % significa que resta el siguiente valor por el lis[x] infinitamente, osea que si el lis[x]-2-2-2-2... llega a dar 0 es positivo
            pares.append(lis[x])
        else:
            impares.append(lis[x])
    return [pares,impares]

def imprimir_listas(par,imp):
    print("Los pares son:")
    for x in range(len(par)):
        print(par[x])
    print("Los impares son:")
    for x in range(len(par)):
        print(imp[x])

#bloque principal
lista=cargar_lista()
pares,impares=dividir_listas(lista)
imprimir_listas(pares,impares)

#está bien
