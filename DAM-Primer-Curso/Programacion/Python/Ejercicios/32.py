notas=0
x=1
while x<=10:
    x=x+1
    nota=float(input("Introduce la nota:"))
    if nota>=7:
        notas=notas+1
print("La cantidad de notas mayores a 7 son:")
print(notas)
print("La cantidad de notas menores a 7 son:")
resta=10-notas
print(resta)
