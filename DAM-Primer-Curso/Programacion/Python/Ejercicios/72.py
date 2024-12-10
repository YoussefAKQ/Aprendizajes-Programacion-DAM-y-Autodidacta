lista=[20,50,10,2,221,340,333]
contador=0
x=0
while x<len(lista):
    if lista[x]>100:
        contador=contador+1
    x=x+1
print(lista)
print(contador)




"""Primero definimos la lista, después ponemos 2 contadores, uno para  contar
los mayores a 100 y otro para parar el programa, usamos el while para este
programa y un x>len para que sepa la cantidad de caracteres que hay en
la lista, luego el if lista[x] para que recorra todos los datos en busca
de los mayores a 100, luego un contador para cuando encuentre esos valores
mayores a 100 y otro contador para parar el programa"""
