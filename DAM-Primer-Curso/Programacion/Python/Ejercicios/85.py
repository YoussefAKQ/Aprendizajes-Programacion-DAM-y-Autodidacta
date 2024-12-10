"""Crear dos listas con los nombres de 5 productos en una y sus respectivos
precios en otra. Definir dos listas paralelas. Mostrar cuantos productos tienen un precio mayor al
un precio mayor al primer producto introducido. (PARA HACER EL FIN DE SEMANA)"""

lista1=[]
lista2=[]

contador=0
x=0
for x in range(5):
    producto=input("Introduce el producto:")
    lista1.append(producto)
    precio=input("Introduce el precio del producto:")
    lista2.append(precio)
print(lista1)
print(lista2)


print("Los productos más caros que el primero son:")
for x in range(5):
    if lista2[x]>lista2[0]:
        contador=contador+1
        print(lista1[x])
print("La cantidad de productos más caros que el primero son:")
print(contador)
    
