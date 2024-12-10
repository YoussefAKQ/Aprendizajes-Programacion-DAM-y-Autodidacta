lista=[]
cant=1
for k in range(25):
    lista.append([])#introducimos 25 listas
    valor=1 #definimos valor 1 para poder asi introducir el dato 1 y sumarle luego otro 1 para printear el resultado
    for x in range(cant):#la cantidad de principio es 1
        lista[k].append(valor)
        valor=valor+1
    cant=cant+1#sumamos cantidad +1 para en la lista poner 1 y 2
print(lista)
