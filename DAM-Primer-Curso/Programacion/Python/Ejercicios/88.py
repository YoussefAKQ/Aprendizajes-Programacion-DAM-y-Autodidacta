sueldos=[]
for x in range(5):
    valor=int(input("Introduce sueldo:"))
    sueldos.append(valor)
print("Lista sin ordenar")
print(sueldos)

#for x in range(4):
    for x in range(4):
        if sueldos[x]>sueldos[x+1]: #si el sueldo 0 es mayor que el sueldo 1
            aux=sueldos[x] #definimos aux como sueldos[x]
            sueldos[x]=sueldos[x+1] #Ahora sueldo 0 es sueldo 1
            sueldos[x+1]=aux #sueldo 0+1=1 +1 = 2, sueldo 2=aux
print("Lista con el último elemento ordenado")
print(sueldos)








"""Primero definimos la lista de sueldos y con un bucle hacemos que el usuario
introduzca los elementos, printeamos la lista sin ordenar.Después con un
bucle for x in range 4 podemos ordenar un valor de la lista, y para ordenar
toda la lista metemos ese bucle dentro de otro bucle las veces que elementos
haya, ahora está quitado porque el ejercicio solo es ordenar el primero"""
