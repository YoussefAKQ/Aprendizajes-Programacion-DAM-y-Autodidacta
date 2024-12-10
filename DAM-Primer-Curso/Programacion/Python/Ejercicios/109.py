lista=[]#1 2 3 4 5 6 7 8 9 10
for x in range(10):
    valor=int(input("Introduce valor:"))
    lista.append(valor)
    
print(lista)

posicion=0 
while posicion<len(lista): #mientras 5 sea menor que 5
    if lista[posicion]==5: #si 5 es igual a 5
        lista.pop(posicion) #borramos 5(no lo hacemos porque no lo es)
    else: #y si no es 5
        posicion=posicion+1 #sumamos 1 a posicion
    
print(lista)
