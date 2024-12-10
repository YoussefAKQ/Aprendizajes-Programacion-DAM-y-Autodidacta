#Pedimos que introduzca una oración
oracion=input("Introduce una oracion:")
#Pasamos la oración a minúsculas para poder contar bien las vocales 
oracionmin=oracion.lower()
#Ponemos 2 contadores, uno para la cantidad de vocales y otro para que le programa pare al terminar la oracion
cantidad=0
x=0
#Con este while hacemos que siga el programa hasta que llegue al final de la oracion y pare
while x<len(oracionmin):
    #En este if, la x es para que el programa RECORRA toda la oracion en busca de a,e,i,o,u, las vocales
    if oracionmin[x]=="a" or oracionmin[x]=="e" or oracionmin[x]=="i" or oracionmin[x]=="o" or oracionmin[x]=="u":
    #cuando encuentra la vocal, suma
        cantidad=cantidad+1
    #esto es para que sume x para terminar el programa al terminar la oracion
    x=x+1
print("La cantidad de vocales de la oracion son: ")
print(cantidad)




