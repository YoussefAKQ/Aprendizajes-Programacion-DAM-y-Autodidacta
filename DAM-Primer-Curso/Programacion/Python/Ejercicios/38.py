pares=0
impares=0
x=1
n=int(input("Introduce la cantidad de valores:"))
while x<=n:
    x=x+1
    valores=int(input("Introduce los valores"))
    if valores%2==0:
        pares=pares+1
    else:
        impares=impares+1

print("La cantidad de numeros pares es:")
print(pares)
print("La cantidad de numeros impares es:")
print(impares)
