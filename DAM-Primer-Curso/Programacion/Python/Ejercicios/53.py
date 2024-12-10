negativos=0
positivos=0
mult15=0
pares=0
sumapares=0
for x in range(10):
    x=x+1
    valores=int(input("Introduce 10 valores enteros:"))
    if valores>=0:
        positivos=positivos+1
    else:
        if valores<0:
            negativos=negativos+1
    if valores%2==0:
        pares=pares+1
        sumapares=sumapares+valores
    if valores%15==0:
        mult15=mult15+1
print("La cantidad de números negativos es:")
print(negativos)
print("La cantidad de números positivos es:")
print(positivos)
print("La cantidad de números múltiplos de 15 es:")
print(mult15)
print("La cantidad de números pares es:")
print(pares)
print("La suma de pares es:")
print(sumapares)
    


#Aquí tienes que tener en cuenta en positivos o negativos que O ES POSITIVO
#O ES NEGATIVO, la manera correcta no sería poner 2 IF en los dos
#primeros(aunque funciona) ya que NO puede ser positivo y negativo a la vez
#además tienes que leer bien los enunciados, no te han pedido la cantidad
# de números pares, si no la suma "EL VALOR ACUMULADO"
