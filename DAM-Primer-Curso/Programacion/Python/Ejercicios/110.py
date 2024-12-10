nombres=[]
sueldos=[]

cuan=int(input("Introduce la cantidad de empleados que hay"))
for x in range(cuan):
    nom=input("Introduce el nombre del empleado:")
    nombres.append(nom)
    sue=int(input("Introduce el sueldo del empleado:"))
    sueldos.append(sue)

print("La cantidad de empleados que hay en la empresa es:",len(nombres))
for x in range(cuan):
    print(nombres[x],sueldos[x])
    
posicion=0
while posicion<len(sueldos):#aqui no podemos usar for porque la lista len varía
    if sueldos[posicion]>10000:#si sueldos posición(0) es mayor que 10k
        sueldos.pop(posicion)#borramos dicha posicion
        nombres.pop(posicion)#borramos dicha posicion
    else:
        posicion=posicion+1#esto es para que recorra todos los valores

print("Listado de empleados que cobran 10000 o menos:")
for x in range(len(nombres)):
    print(nombres[x])
