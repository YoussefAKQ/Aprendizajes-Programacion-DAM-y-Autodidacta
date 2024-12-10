"""
Escribe un programa en Python por comprobar si un número es primo. Un número
primo es número natural, mayor que 1 y divisible por sí mismo y por 1, ejemplo
de primos son: (2,4,5,7,11,13,17....)
"""

num=int(input("Introduce tu número: "))
contador=0
print(contador)
for x in range(num):
    if x==0:
        print("")
    else:
        if (num%x)==0:
            contador=contador+1
    
if contador==2:
    print("Es un número primo")
else:
    print("No es primo")


"""
El resto da 0 en los números primos al dividirlos entre sí o entre 1
"""
