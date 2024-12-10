x=1
y=1
suma=0
sumados=0
while x<=15:
    valores=int(input("Introduce los valores de la lista UNO:"))
    suma=suma+valores
    x=x+1   
while y<=15:
    valores=int(input("Introduce los valores de la lista DOS:"))
    sumados=sumados+valores
    y=y+1   
if suma>sumados:
    print("Lista 1 mayor")
else:
        if sumados>suma:
            print("Lista 2 mayor")
        else:
            print("Listas iguales")


