"""
Escribir un programa en python que pida al usuario un número entero
n y muestre por pantalla un triangulo con el mismo numero de filas
que el numero introducido

Si utilizamos la propiedad end="" al final de lo que imprimamos no tendremos
salto de linea
"""

n=int(input("Introduce el numero de lineas:"))

for k in range(n):
    for x in range(n-k-1):
        print(" ",end="")
    for x in range(2*k+1):
        print("*",end="")
    print()


    

    
