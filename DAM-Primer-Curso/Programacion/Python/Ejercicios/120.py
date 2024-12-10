def recibe_enteros(lista):
    for x in range(2):
        if lista[x]>lista[x+1]:
            aux=lista[x]
            lista[x]=lista[x+1]
            lista[x+1]=aux
    print(lista)
            

def carga_enteros():
    lista=[]
    valor1=int(input("Introduce el entero"))
    lista.append(valor1)
    valor2=int(input("Introduce el entero"))
    lista.append(valor2)
    valor3=int(input("Introduce el entero"))
    lista.append(valor3)
    recibe_enteros(lista)

carga_enteros()


