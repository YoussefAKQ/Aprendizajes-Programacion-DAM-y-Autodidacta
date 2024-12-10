def cargar_empleado():
 nombre=input("Introduce el nombre del empleado:")
 sueldo=float(input("Introduce su sueldo:"))
 return (nombre,sueldo)

def mayor_sueldo(empleado1,empleado2):
 if empleado1[1]>empleado2[1]:
     print(empleado1[0],"tiene mayor sueldo")
 else:
     print(empleado2[0],"tiene mayor sueldo")
 
# bloque principal
empleado1=cargar_empleado()
empleado2=cargar_empleado()
mayor_sueldo(empleado1,empleado2)
