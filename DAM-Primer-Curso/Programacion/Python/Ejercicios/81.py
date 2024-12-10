lista=[] #Definimos la lista
for x in range(5): #Asignamos el for para que pida 5 veces un valor
    valor=int(input("Introduce valor:"))
    lista.append(valor) #Agrega a la lista los valores

menor=lista[0] #Asignamos que menor sea el primero de la lista para así poder compararlo
posicion=0 #Con este contador se podrá ver la posición de la lista en la que estamos
for x in range(1,5): #Asignamos in range 1,5 ya que empezamos por el 1 
    if lista[x]<menor:
        menor=lista[x] #Si encuentra un valor menor a lista x lo sustituye
        posicion=x #Aquí asigna la posición en la que está

print("Lista completa")
print(lista)
print("Menor de la lista:")
print(menor)
print("La posición de la lista en la que está es:")
print(posicion)







