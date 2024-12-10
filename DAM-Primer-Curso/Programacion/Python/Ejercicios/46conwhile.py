x=1
cantidad=0
n=int(input("Cuantos valores introduces:"))
while x<=n:
    x=x+1
    valor=int(input("Introduce el valor:"))
    if valor>=1000:
        cantidad=cantidad+1
print("La cantidad de valores introducidos mayores o iguales a 1000 son:")
print(cantidad)
