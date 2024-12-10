def carga_suma(): #esta funcion suma 2 valores y los imprime
    valor1=int(input("Introduce el primer valor:"))
    valor2=int(input("Introduce el segundo valor:"))
    suma=valor1+valor2
    print("La suma de los dos valores es:",suma)

def separacion(): #esta funcion printea un separador
    print("____________________________________")
    print("________                  _________")
    print("               ____")
    print("____________________________________")
for x in range(5): #este bucle repite las funciones 5 veces
    carga_suma()
    separacion()
