num1=int(input("Introduce el primer valor"))
num2=int(input("Introduce el segundo valor"))
num3=int(input("Introdue el tercer valor"))

print("El mayor de los tres valores es")
if num1>num2 and num1>num3:
    print(num1)
else:
    if num2>num1 and num2>num3:
        print(num2)
    else:
        print(num3)
