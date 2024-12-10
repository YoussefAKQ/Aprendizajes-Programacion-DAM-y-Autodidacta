
lista1=[]
n=int(input("Introduce la cantidad de sueldos con los que quieres operar:"))
for x in range(n):
    valores=float(input("Introduce el sueldo:"))
    lista1.append(valores)

for k in range(n-):
    for x in range(n-k-1):
        if lista1[x]>lista1[x+1]:
            aux=lista1[x]
            lista1[x]=lista1[x+1]
            lista1[x+1]=aux

print(lista1)
    
    

