nombres=[]
faltas=[]

for k in range(3):
    faltas.append([])
    nom=input("Introduce el nombre del empleado:")
    nombres.append(nom)
    cant=int(input("Introduce la cantidad de dias que ha faltado:"))
    for x in range(cant):
        fal=int(input("Introduce los dias que ha faltado:"))
        faltas[k].append(fal)
        
print("---------A---------")
for k in range(3):
    print(nombres[k])
    for x in range(len(faltas[k])):
        print(faltas[k][x])
    
print("---------B---------")
for k in range(3):
    print(nombres[k])
    print(len(faltas[k]))
        

print("---------C---------CORREGIDO")
men=len(faltas[0])#Definimos la cantidad de valores de faltas[0]
for x in range(1,3):#del 1 al 3 porque 0 lo hemos definido
    if len(faltas[x])<men:#aquí comparamos por ejemplo 1 con 0
        men=len(faltas[x])#si es asi lo asignamos
#en el for de arriba usamos len porque NECESITAMOS QUÉ EMPLEADO HA FALTADO MENOS
print("Empleado o empleados que faltaron menos")
for x in range(3):
    if len(faltas[x])==men:#si la cantidad de faltas que hay en faltas[x]es men
        print(nombres[x])
