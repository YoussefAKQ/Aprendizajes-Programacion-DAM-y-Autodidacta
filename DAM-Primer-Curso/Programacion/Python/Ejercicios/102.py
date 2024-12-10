#hacemos 3 listas, para nombres,sueldos y la suma de las 3 nóminas
nombres=[]
sueldos=[]
totalsueldos=[]

#aquí abajo introducimos los valores en nombres y sueldos
for x in range(3):
    nom=input("Introduce el nombre del empleado:")
    nombres.append(nom)
    su1=int(input("Introduce el primer sueldo:"))
    su2=int(input("Introduce el segundo sueldo:"))
    su3=int(input("Introduce el tercer sueldo:"))
    sueldos.append([su1, su2, su3])
    
for x in range(3):
    total=sueldos[x][0]+sueldos[x][1]+sueldos[x][2]
    totalsueldos.append(total)
    
for x in range(3): #aquí printeamos la lista que hemos hecho arriba
    print(nombres[x], totalsueldos[x])
    
#aquí abajo definimos valores para poder ordenar
posmayor=0
mayor=totalsueldos[0]

for x in range(1,3): #en este for ordenamos para ver el mayor y empezamos por 1 porque definimos 0 arriba
    if totalsueldos[x]>mayor:
        mayor=totalsueldos[x]
        posmayor=x

print("Empleado con mayores ingresos en los ultimos tres meses")
print(nombres[posmayor])
print("con un ingreso de",mayor)
