lista=[]
suma=0
altos=0
bajos=0
for x in range(5):
    altura=float(input("Introduce la altura:"))
    lista.append(altura)
    suma=suma+altura

promedio=suma/5 
for x in range(5):
    if lista[x]>promedio:
        altos=altos+1
    else:
        bajos=bajos+1

print("La lista de alturas es:")
print(lista)
print("El promedio es:")
print(promedio)
print("La cantidad de personas más altas que el promedio son:")
print(altos)
print("La cantidad de personas más bajas que el promedio son:")
print(bajos)







"""Primero se crea un bucle para introducir todos los valores en la lista
y luego creamos otro bucle para que por esa misma lista que hemos creado
pase en busca de las alturas para así poder sumar los contadores de altos
y bajos, lo hiciste bien menos el segundo bucle que lo pusiste sin el
f x in range."""
