alumnos=[]
notas=[]
for x in range(3):
    alu=input("Introduce el nombre del alumno:")
    alumnos.append(alu)
    no1=float(input("Introduce la primera nota:"))
    no2=float(input("Introduce la segunda nota:"))
    notas.append([no1,no2])

for x in range(3):
    print(alumnos[x],notas[x][0],notas[x][1])
