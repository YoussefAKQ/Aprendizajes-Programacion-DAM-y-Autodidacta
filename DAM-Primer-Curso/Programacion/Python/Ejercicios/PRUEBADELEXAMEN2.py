"""
Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa
que dé la siguiente información:

a)La temperatura media de cada día
b)La media de esas temperaturas
c)Se lee una temperatura por teclado y se muestran los días cuya temperatura
coincide con ella si no existe ningun dia se muestra un mensaje de info.

"""
def datos_media():
    media=[]
    temperaturas=[]
    for x in range(5):
        maxtemp=int(input("Temperatura máxima"))
        temperaturas.append(maxtemp)
        mintemp=int(input("Temperatura mínima"))
        temperaturas.append(mintemp)
        med=(maxtemp+mintemp)/2
        media.append(med)
    return media,temperaturas

def imprimir_media(media,temperaturas):
    print("La media de temperaturas por día:")
    for x in range(len(media)):
        print(media[x])

def menor_temp(media,temperaturas):
    men=0
    for x in range(len(temperaturas)):
        if temperaturas[x]<temperaturas[men]:
            men=x
    print("La temperatura mínima fue",temperaturas[men])

def buscar_temp(media,temperaturas):
    print(temperaturas)
    pos=0
    buscar=input("Introduce la temperatura que buscas")
    for x in range(len(temperaturas)):
        if temperaturas[x]==buscar:
        pos=x
        print("El día",pos,"ha dado esa temperatura")

#bloque principal
media,temperaturas=datos_media()
imprimir_media(media,temperaturas)
menor_temp(media,temperaturas)
buscar_temp(media,temperaturas)


""" está mal """
