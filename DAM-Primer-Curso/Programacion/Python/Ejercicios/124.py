def recibe_valores(la):
    perimetro=la*4
    return perimetro


def manda_valores():
    lado=int(input("Introduce el lado del cuadrado:"))
    print("El perimetro del cuadrado es",recibe_valores(lado))
    

manda_valores()
