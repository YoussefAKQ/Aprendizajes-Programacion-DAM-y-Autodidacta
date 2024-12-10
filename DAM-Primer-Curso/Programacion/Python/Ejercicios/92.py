lista=[]
for x in range(5):
    valor=int(input("Introduce un valor"))
    lista.append(valor)

for k in range(4):#la cantidad de valores
    for x in range(4-k):#-k para que no se repita
        if lista[x]>lista[x+1]: #si posición0 es mayor que posición1
            aux=lista[x] #aux es posición0
            lista[x]=lista[x+1] #posición0 es posición1
            lista[x+1]=aux #posición1 es aux(posición0)
            
print("Lista ordenada de menor a mayor:")
print(lista)
    
for k in range(4):
    for x in range(4-k):
        if lista[x]<lista[x+1]:
            aux=lista[x]
            lista[x]=lista[x+1]
            lista[x+1]=aux
            
print("Lista ordenada de mayor a menor:")
print(lista)
