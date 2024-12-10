def menor():
    valor1=int(input("Introduce el primer valor"))
    valor2=int(input("Introduce el segundo valor"))
    valor3=int(input("Introduce el tercer valor"))
    if valor1<valor2 and valor1<valor3:
        print("El menor valor es:",valor1)
    else:
        if valor2<valor1 and valor2<valor3:
            print("El menor valor es:",valor2)
        else:
            if valor3<valor1 and valor3<valor2:
                print("El menor valor es:",valor3)
#programa principal
menor()
menor()
