ejercicio47.py
n=int(input("Cuantos triángulos procesamos:"))
cantidad=0
for x in range(n):
basetri=int(input("Introduce el valor de la base:"))
altura=int(input("Introduce el valor de la altura:"))
superficie=basetri*altura/2
print("La superficie es")
print(superficie)
if superficie>12:
cantidad=cantidad+1
print("La cantidad de triángulos con superficie superior a 12 es:")
print(cantidad)

