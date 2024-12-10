def recibe_enteros(v1,v2,v3):
    suma=(v1+v2+v3)/3
    return suma

def envia_enteros():
    valor1=int(input("Introduce el primer entero"))
    valor2=int(input("Introduce el segundo entero"))
    valor3=int(input("Introduce el tercer entero"))
    print("El promedio es",recibe_enteros(valor1,valor2,valor3))

envia_enteros()
