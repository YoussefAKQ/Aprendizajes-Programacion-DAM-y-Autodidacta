edadm=0
edadt=0
edadn=0
for x in range (5):
    valores=int(input("Introduce las edades de los 5 estudiantes de turno de mañana:"))
    edadm=edadm+valores
promediom=edadm/5
print("El promedio de edad del turno de mañana es:")
print(promediom)
for x in range (6):
    valores=int(input("Introduce las edades de los 6 estudiantes de turno de tarde:"))
    edadt=edadt+valores
promediot=edadt/6
print("El promedio de edad del turno de tarde es:")
print(promediot)
for x in range (11):
    valores=int(input("Introduce las edades de los 11 estudiantes de turno de noche:"))
    edadn=edadn+valores
promedion=edadn/11
print("El promedio de edad del turno de noche es:")
print(promedion)

if promediom>promediot and promediom>promedion:
    print("El turno con mayor promedio de edad es el turno de mañana")
else:
    if promediot>promediom and promediot>promedion:
        print("El turno con mayor promedio de edad es el turno de tarde")
    else:
        print("El turno con mayor promedio de edad es el turno de noche")

"""Con tres comillas
puedo poner las líneas
de comentario
que quiera ya sean
dos o mil"""
