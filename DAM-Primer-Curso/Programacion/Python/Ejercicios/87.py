lista1=[]
lista2=[]

lista3=[]

for x in range(4):
    valor1=int(input("Introduce un número entero para la lista 1:"))
    lista1.append(valor1)
    valor2=int(input("Introduce un número entero para la lista 2:"))
    lista2.append(valor2)

for x in range(4):
    suma=lista1[x]+lista2[x]
    lista3.append(suma)

print("La suma de los valores de la lista 1 con los de la lista 2 son:")
print(lista3)


""""Primero definimos las tres listas, después un bucle for x in range para
introducir los valores de las 2 primeras listas, luego otro bucle for x in
range para sumar los valores de la lista 1 y 2 para posteriormente introducirlos
en la lista 3""
