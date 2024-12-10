lista=[]
contador=0
for x in range(5):
    elementos=int(input("Introduce los valores:"))
    lista.append(elementos)

mayor=lista[0]
for x in range(1,5):
    if lista[x]>mayor:
        mayor=lista[x]
        
print("El mayor es:")
print(mayor)

for x in range(5):
    if lista[x]==mayor:
        contador=contador+1

if contador>1:
    print("La cantidad de veces que se repite el mayor es:")
    print(contador)






"""Aquí hay que poner 3 bucles, uno para introducir los valores,otro para
averiguar cual es el mayor, y una vez que sabemos cual es el mayor hacemos
otro bucle para recorrer TODA LA LISTA en busca de mayor para ver
si está más de una vez, luego si con un contador lo apuntamos y si ese
contador ha encontrado más de una vez el mayor lo enseña"""



