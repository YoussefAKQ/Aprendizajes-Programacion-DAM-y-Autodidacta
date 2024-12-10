import random

def numero_aleatorio():
    num=random.randint(1,100)
    print(num)
    return num

def adivinar_num(num):
    contador=1
    pregunta=0
    while pregunta!=num:
        pregunta=int(input("Introduce el valor: "))
        if num>pregunta:
            print("Es mayor")
            contador=contador+1
        else:
            if num<pregunta:
                print("Es menor")
                contador=contador+1
            else:
                print("Has ganado con",contador,"intentos")
                

#bloque principal
num=numero_aleatorio()
adivinar_num(num)
