pais=[]
media=[]
mediado=[]
for k in range(4):
    media.append([])
    pa=input("Introduce el nombre del país:")
    pais.append(pa)
    for x in range(3):
        me=int(input("Introduce la temperatura mensual del país:"))
        media[k].append(me)

print("Las temperaturas mensuales de cada país son:")
for k in range(4):
    print(pais[k])
    for x in range(3):
        print(media[k][x])
        
for k in range(4):
    suma=0
    suma=media[k][0]+media[k][1]+media[k][2]
    med=suma/3
    mediado.append(med)

print("La media de temperatura trimestral de cada país es:")
for k in range(4):
    print(pais[k],mediado[k])

#esto de abajo no has sabido hacerlo
posmayor=0 #Estamos buscando un valor, no hace falta ordenar la lista
for k in range(1,4):
    if mediado[k]>mediado[posmayor]:#si 1 es mayor que 0 
        posmayor=k #0(la posicion) es posmayor
        #de esta manera podemos ver la posición mayor
print("País con temperatura media trimestral mayor:", pais[posmayor])
       
