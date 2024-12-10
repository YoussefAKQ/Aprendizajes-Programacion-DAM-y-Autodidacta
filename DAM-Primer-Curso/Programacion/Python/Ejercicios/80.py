lista=[] #Definimos la lista
for x in range(5): 
    valor=int(input("Introduce valor:"))
    lista.append(valor)

mayor=lista[0] #Asignamos a mayor el primer elemento de la lista
for x in range(1,5): #Aquí empezamos del 1 porque el 0 es mayor
    if lista[x]>mayor: #Aquí vemos si el elemento es mayor que mayor 
        mayor=lista[x] #Aquí en todo caso de que el elemento sea mayor se sustituye por mayor
print("Lista completa")
print(lista)
print("Mayor de la lista")
print(mayor)



