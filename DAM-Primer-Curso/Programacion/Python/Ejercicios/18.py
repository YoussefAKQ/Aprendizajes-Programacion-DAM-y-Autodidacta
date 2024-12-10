num1=int(input("Introduzca el número de preguntas"))
num2=int(input("Introduzca el número de preguntas acertadas"))
aciertos=(num2/num1)
porcentaje=aciertos*100
if porcentaje>=90:
    print("Sobresaliente")
else:
    if porcentaje>=75:
        print("Notable")
    else:
        if porcentaje>=50:
            print("Aprobado")
        else:
            print("Suspenso")




