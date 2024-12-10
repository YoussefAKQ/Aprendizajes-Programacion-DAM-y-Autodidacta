def triangulo():
    #Preguntamos cuantos pisos quiere el usuario
    num=int(input("Cuántos pisos quieres que tenga tu triángulo?"))
    #Utilizamos 2 contadores, uno para los asteriscos y otro para los espacios
    contadorA=1 #Asteriscos, usamos 1 porque empieza con 1
    contadorE=num-1 #Espacios, es el número de líneas -1 para ir quitando espacios
    while contadorA<num: #Utilizamos un while para que se ejecute hasta el número de líneas de num
        for x in range(num): #Este bucle es para que se ejecuten los 2 bucles (el de asteriscos y espacios) y num porque 
            for e in range(contadorE): #Espacios
                print(" ",end="") #Printeamos espacio y end para que no salte de línea
            contadorE=contadorE-1 #Aquí hacemos -1 para que borre un espacio

            for a in range(contadorA): #Asteriscos
                print("*",end="") #Printeamos el asterisco y el end para no saltar de línea
            print()               #Para el salto de línea
            contadorA=contadorA+2 #Sumamos 2 para sumar 2 asteriscos


#bloque principal
triangulo()
