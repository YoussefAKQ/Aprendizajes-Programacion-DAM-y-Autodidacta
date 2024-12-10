escaleno=0
equilatero=0
isosceles=0
n=int(input("Introduce la cantidad de triángulos:"))
for x in range(n):
    lado1=int(input("Introduce el primer lado:"))
    lado2=int(input("Introduce el segundo lado:"))
    lado3=int(input("Introduce el tercer lado:"))
    if lado1==lado2 and lado2==lado3:
        print("Es un triángulo equilátero")
        equilatero=equilatero+1
    else:
        if lado1==lado2 or lado1==lado3 or lado2==lado3:
            print("Es un triángulo isósceles")
            isosceles=isosceles+1
        else:
            print("Es un triángulo escaleno")
            escaleno=escaleno+1
print("La cantidad de triángulos equiláteros es:")
print(equilatero)
print("La cantidad de triángulos isósceles es:")
print(isosceles)
print("La cantidad de triángulos escalenos es:")
print(escaleno)

