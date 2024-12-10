cantidad=0
x=1
n=int(input("Introduce la cantidad de piezas"))
while x<=n:
    x=x+1
    largo=float(input("Introduce la medida de las piezas"))
    if largo>=1.2 and largo<=1.3:
        cantidad=cantidad+1
print("La cantidad de piezas aptas son")
print(cantidad)
