contador1=0
contador2=0
n=int(input("Introduce la cantidad de triángulos"))
for f in range(n):
    base=int(input("Introduce la base"))
    altura=int(input("Introduce la altura"))
    print("La base son:")
    print(base)
    print("La altura son:")
    print(altura)
    superficie=(base*altura)/2
    print("La superficie es:")
    print(superficie)
    if superficie>12:
        contador1=contador1+1
print("La cantidad de triángulos cuya superficie es mayor a 12 es:")
print(contador1)
    

#Está bien pero ojo, el print debajo de if tiene que ir fuera ya que es el final
#del ejercicio, y el if tiene que ir DENTRO DE FOR, si no coge solamente el
#último par de valores
