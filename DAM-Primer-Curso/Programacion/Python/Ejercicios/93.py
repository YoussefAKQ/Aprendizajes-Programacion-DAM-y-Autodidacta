











alumnos=[]
notas=[]
for x in range(5):
    nom=input("Introduce el nombre del alumno:")
    alumnos.append(nom)
    no=int(input("Introduce la nota del alumno:"))
    alumnos.append(no)

for k in range(4):
    for x in range(4-k):
        if notas[x]<notas[x+1]:
            aux=notas[x]
            notas[x]=notas[x+1]
            notas[x+1]=aux
            aux2=alumnos[x]
            alumnos[x]=alumnos[x+1]
            alumnos[x+1]=aux2
            
print("Lista de alumnos y sus notas ordenadas de mayor a menor")
for x in range(5):
    print(alumnos[x],notas[x])
