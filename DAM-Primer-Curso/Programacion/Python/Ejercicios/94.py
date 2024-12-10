nombres=[]
habitantes=[]

for x in range(5):
    nom=input("Introduce el nombre del país:")
    nombres.append(nom)
    hab=int(input("Introduce la cantidad de habitantes:"))
    habitantes.append(hab)


for k in range(4):
    for x in range(4-k):
        if nombres[x]>nombres[x+1]:
            aux=nombres[x]
            nombres[x]=nombres[x+1]
            nombres[x+1]=aux
            aux2=habitantes[x]
            habitantes[x]=habitantes[x+1]
            habitantes[x+1]=aux2
            
print("Lista ordenada alfabéticamente:")
for x in range(4):
    print(nombres[x],habitantes[x])

for k in range(4):
    for x in range(4-k):
        if habitantes[x]<habitantes[x+1]:
            aux3=habitantes[x]
            habitantes[x]=habitantes[x+1]
            habitantes[x+1]=aux3
            aux4=nombres[x]
            nombres[x]=nombres[x+1]
            nombres[x+1]=aux4

print("Lista ordenada por cantidad de habitantes:")
for x in range(4):
    print(nombres[x],habitantes[x])
