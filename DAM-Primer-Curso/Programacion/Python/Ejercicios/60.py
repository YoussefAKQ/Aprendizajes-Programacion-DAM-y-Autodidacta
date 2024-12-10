opcion="si"
suma=0
while opcion=="si":
    valor=int(input("Introduce un valor"))
    suma=suma+valor
    opcion=input("Desea cargar otro numero(si/no)")
print("La suma de valores introducidos es:")
print(suma)
