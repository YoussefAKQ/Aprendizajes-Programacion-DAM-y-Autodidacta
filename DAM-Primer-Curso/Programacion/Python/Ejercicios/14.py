num1=int(input("Introduce primera nota"))
num2=int(input("Introduce segunda nota"))
num3=int(input("Introduce tercera nota"))

prom=(num1+num2+num3)/3

if prom>=7:
    print("Promocionado")
else:
    if prom>=4:
        print("Regular")
    else:
        print("Reprobado")
