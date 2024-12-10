num1=int(input("Introduce el primer valor"))
num2=int(input("Introduce el segundo valor"))
num3=int(input("Introduce el tercer valor"))
print("El valor más grande es:")
if num1>num2: 
    if num1>num3:
        print(num1)
if num2>num1:
    if num2>num3:
        print(num2)
if num3>num1:
    if num3>num2:
        print(num3)
