aprobados=0
reprobados=0
for f in range(10):
    nota=int(input("Introduce la nota:"))
    if nota>=7:
        aprobados=aprobados+1
    else:
        reprobados=reprobados+1
print("Cantidad de aprobados")
print(aprobados)
print("Cantidad de reprobados")
print(reprobados)
