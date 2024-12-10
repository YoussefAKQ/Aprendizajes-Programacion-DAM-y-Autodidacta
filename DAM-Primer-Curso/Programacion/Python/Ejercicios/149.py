def cargar():
 lista=[]
 for x in range(5):
     valor=int(input("Introduce valor: "))
     lista.append(valor)
 return lista
def retornar_mayormenor(lista):
 may=lista[0]
 men=lista[0]
 for x in range(1,len(lista)):
     if lista[x]>may:
         may=lista[x]
 else:
     if lista[x]<men:
         men=lista[x]
 return (may,men)
# bloque principal
lista=cargar()
mayor,menor=retornar_mayormenor(lista)
print("Mayor valor de la lista:",mayor)
print("Menor valor de la lists:",menor)
