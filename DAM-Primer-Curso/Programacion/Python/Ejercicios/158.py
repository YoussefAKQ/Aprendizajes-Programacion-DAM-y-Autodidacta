def cargar_productos():
    lista=[]
    for x in range(5):
        producto=input("Introduce el producto: ")
        precio=int(input("Introduce el precio: "))
        lista.append((producto,precio))
    return lista

def imprimir_productos(lista):
    print("Listado de productos y precios")
    for nombre,precio in lista:
        print(nombre,precio)

def productos_caros(lista):
    print("Listado de productos con un precio superior a 10 e inferior a 15:")
    for nombre,precio in lista:
        if precio>10 and precio<15:
            print(nombre,precio)

#bloque principal
lista=cargar_productos()
imprimir_productos(lista)
productos_caros(lista)

