"""Codificar un programa que solicite la carga de valores enteros por teclado y
los sume. Finalizar la carga al introducir el valor -1. Dejar como comentario
dentro del código fuente el enunciado del problema."""
#definimos contador y variable
suma=0
valor=int(input("Introduce valor (-1 finaliza):")) # se carga el primer valor antes del while
while valor!=-1:
    suma=suma+valor
    valor=int(input("Introduce valor(-1 finaliza):")) # se cargar todos losotros valores dentro del while
print("La suma de los valores introducidos es:")
print(suma)
    



"""No habría que utilizar for porque no sé las veces que tengo que repetirlo
hay que meter while; PARA PONER "MIENTRAS NO SEA" ES UN ! """
