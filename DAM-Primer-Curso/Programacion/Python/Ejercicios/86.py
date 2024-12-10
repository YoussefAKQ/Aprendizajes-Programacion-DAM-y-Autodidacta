"""
En un curso de 4 alumnos se registraron las notas de sus exámenes y se
deben procesar de acuerdo a lo siguiente:

a)Introducir nombre y nota de cada alumno (almacenar los datos en dos listas
paralelas)

b)Realizar un listado que muestre los nombres, notas y condición del alumno. En
la condición colocar "Muy buena" si la nota es mayor o igual a 8, "Buena" si
la nota está entre 4 y 7, y colocar "Insuficiente" si la nota es inferior a 4.

c)Imprimir cuantos alumnos tienen la condición "Muy buena"
"""

contador=0
x=0

lista1=[]
lista2=[]
for x in range(4):
    nombre=input("Introduce el nombre:")
    lista1.append(nombre)
    nota=float(input("Introduce la nota:"))
    lista2.append(nota)
    
for x in range(4):
    print(lista1[x])
    print(lista2[x])
    if lista2[x]>=8:
        print("Muy buena")
        contador=contador+1
    else:
        if lista2[x]>=4:
            print("Buena")
        else:
            print("Insuficiente")
    
print("La cantidad de alumnos que tienen la condición 'Muy buena' son:")
print(contador)
