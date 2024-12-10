lista=[]
eliminados=[]
for x in range(5):
    num=int(input("Introduce los valores:"))
    lista.append(num)
print(lista)
posicion=0
while posicion<len(lista):#usamos el while ya que al eliminar la lista varía
    if lista[posicion]>=10:#si la posición 0 es mayor o igual a 10
        eliminados.append(lista[posicion])#agregamos el valor eliminado a una nueva lista para poder luego printear qué valores han sido eliminados
        lista.pop(posicion)#eliminamos lista[0]
    else:#y si no
        posicion=posicion+1 #sumamos a posicion 1 para recorrer todos los valores 

print("Lista después de quitar los valores mayores o iguales a 10:")
for x in range(len(lista)):
    print(lista[x])
print(lista)
print("Lista de los valores eliminados:")
for x in range(len(eliminados)):
    print(eliminados[x])
print(eliminados)
