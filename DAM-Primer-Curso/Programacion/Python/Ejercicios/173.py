def cargar_datos():
    valores=[]
    for x in range(10):
        valor=int(input("Cargar Valor:"))
        valores.append(valor)
    return valores

def imprimir_datos(lista):
    mitad=(lista)//2
    print(mitad)
    



#bloque principal
lista=cargar_datos()
imprimir_datos(lista)
