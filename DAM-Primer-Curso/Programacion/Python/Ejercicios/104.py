padres=[]
hijos=[]
for k in range(3):
    hijos.append([])
    pa=(input("Introduce el nombre del padre:"))
    ma=(input("Introduce el nombre de la madre:"))
    padres.append([pa,ma])
    cant=int(input("Introduce la cantidad de niños que tiene la familia:"))
    for x in range(cant):
        ni=(input("Introduce el nombre del niño:"))
        hijos[k].append(ni)

for x in range(3):
    print(padres[x],hijos[x])


"""Probando"""
