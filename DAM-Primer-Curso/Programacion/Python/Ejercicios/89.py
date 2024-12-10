sueldos=[]
for x in range(5):
    valor=int(input("Introduce el sueldo:"))
    sueldos.append(valor)

print("Lista sin ordenar")
print(sueldos)

for k in range(4):
    for x in range(4):
        if sueldos[x]>sueldos[x+1]:
            aux=sueldos[x]
            sueldos[x]=sueldos[x+1]
            sueldos[x+1]=aux

print("Lista ordenada")
print(sueldos)




"""Primero definimos la lista y un bucle para introducir los datos en la lista
con un input y append, printeamos la lista. Después ponemos for k in range(4)
para que VAYA RESTANDO y no repita la lista que ya ha sido ordenada, después
ponemos un bucle for x in range(4) que es la cantidad de sueldos
que se va a repetir, luego un if para comprobar si sueldo x es mayor que
el sueldo x+1, si es así determinamos aux a x, después x de sueldo lo sumamos
+1 y luego sumamos 1 a x y lo sustituimos por aux"""

"""está mal explicado, esto sería si hubiese un menos k en for x in range(4)"""
