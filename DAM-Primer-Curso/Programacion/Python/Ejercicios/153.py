def carga_empleados():
    empleados=[]
    for x in range(5):
        nombre=input("Introduce el nombre del empleado")
        sueldo1=int(input("Introduce el primer sueldo"))
        sueldo2=int(input("Introduce el segundo sueldo"))
        sueldo3=int(input("Introduce el tercer sueldo"))
        empleados.append([nombre,(sueldo1,sueldo2,sueldo3)])
    return empleados

def imprimir_total(lista):
    sumasueldos=[]
    for x in range(5):
        suma=lista[x][1][0]+lista[x][1][1]+lista[x][1][2]
        sumasueldos.append(suma)
        suma=0
    for x in range(5):
        print("El empleado",lista[x][0],"tiene un total de sueldo trimestral de",sumasueldos[x],"euros")
    return(sumasueldos)

def mayor_10k(trimestre,lista):
    may=0
    for x in range(5):
        if trimestre[x]>10000:
            print("El empleado",lista[x][0],"al cobrar",trimestre[x],"cobra más de 10k")
            
#bloque principal
lista=carga_empleados()
trimestre=imprimir_total(lista)
print("--------------------------------------------")
mayor_10k(trimestre,lista)

