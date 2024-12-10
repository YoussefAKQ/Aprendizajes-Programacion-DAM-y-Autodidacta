paises=[]
for x in range(5):
    valores=input("Introduce los países:")
    paises.append(valores)

for k in range(4): #ejemplo de 0:
    for x in range(4-k): #se resta k para que no se repita la lista ya ordenada
        if paises[x]>paises[x+1]: #si 0 es mayor que 1:
            aux=paises[x] #aux es 0
            paises[x]=paises[x+1] #0 = 1
            paises[x+1]=aux #1 = aux (osea 0)(con está línea el 1 pasa a la posición 0)


print(paises)
