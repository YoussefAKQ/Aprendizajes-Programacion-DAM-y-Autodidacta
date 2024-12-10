print("Introduce los sueldos de mañana")
listam=[]
for x in range(4):
    sueldom=float(input("Introduce el sueldo:"))
    listam.append(sueldom)

print("Introduce los sueldos de tarde")
listat=[]
for x in range(4):
    sueldot=float(input("Introduce el sueldo:"))
    listat.append(sueldot)

print("La lista de sueldos de por la mañana es:")
print(listam)
print("La lista de sueldos de por la tarde es:")
print(listat)

