lista=[]
for x in range(5):
    nombre=input("Introduce los nombres:")
    lista.append(nombre)

menor=lista[0]
for x in range(1,5): #aquí empezamos por el 1 porque asignamos a menor el primer valor
    if lista[x]<menor: #aquí comprobamos si por el elemento en el que vamos es menor que menor
        menor=lista[x] #aquí en todo caso que listax sea menor se sustituye por menor

print("La lista:")
print(lista)
print("El menor de la lista es:")
print(menor)
