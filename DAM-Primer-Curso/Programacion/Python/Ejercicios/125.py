
def recibe_valores(la1,la2,la3,la4):
    superficie1=la1*la2
    superficie2=la3*la4
    if superficie1>superficie2:
        print("El primer rectangulo es mayor")
    else:
        if superficie2>superficie1:
            print("El segundo rectangulo es mayor")
        else:
            print("Los 2 rectangulos son iguales")
        
def manda_valores():
    print("Primer rectangulo")
    lado1=int(input("Introduce el primer lado del rectangulo"))
    lado2=int(input("Introduce el segundo lado del rectangulo"))
    print("Segundo rectangulo")
    lado3=int(input("Introduce el primer lado del rectangulo"))
    lado4=int(input("Introduce el segundo lado del rectangulo"))
    recibe_valores(lado1,lado2,lado3,lado4)


manda_valores()


