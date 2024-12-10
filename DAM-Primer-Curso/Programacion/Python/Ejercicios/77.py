lista=[]
suma=0
for x in range(5):
    sueldo=float(input("Introduce el sueldo:"))
    lista.append(sueldo)
    suma=suma+sueldo
promedio=suma/5
print("La lista de sueldos:")
print(lista)
print("El sueldo promedio es:")
print(promedio)







"""Primero ponemos lista sin elementos para posteriormente poner un append
para que así sea el usuario el que introduzca los elementos, luego un
for en rango 5 ya que eso es lo que nos pide el ejercicio, 5, sabemos
la cantidad de valores, luego pedimos el sueldo, en este caso un float,
y ponemos el append tras lista y detrás sueldo para que sea que es lo
que tiene que agregar. Tras eso almacenamos el sueldo en un contador
para posteriormente sacar el promedio de sueldos, hacemos el promedio y fin"""
