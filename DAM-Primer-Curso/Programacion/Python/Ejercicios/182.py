import random

def cargar_lista():
    lista=[]
    for x in range(4):
        num=random.randint(1,3)
        lista.append(num)
    lista.append(1)
    return lista

def sacar_uno(lista):
    print(lista)
    while lista[0]!=1:
        random.shuffle(lista)
        print(lista)
    print("Final")












#bloque principal
lista=cargar_lista()
sacar_uno(lista)
