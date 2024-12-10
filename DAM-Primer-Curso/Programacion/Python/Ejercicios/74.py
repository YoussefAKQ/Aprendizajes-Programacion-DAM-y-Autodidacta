lista=["manolo","pepe","antonio","jorge","roberto"]
contador=0
x=0
while x<len(lista):
    if len(lista[x])>=5:
        print(lista[x])
        contador=contador+1
    x=x+1
print("La cantidad de nombres que tienen 5 o más caracteres es:")
print(contador)





"""Recuerda que para que sean correctamente strings y no te dé error tienes
que poner los elementos entre comillas
En el IF HAY QUE PONER LEN PORQUE TIENE QUE VER LA CANTIDAD de caracteres
de cada elemento"""
