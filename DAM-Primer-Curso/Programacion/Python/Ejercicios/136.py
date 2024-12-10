def cargar_listas():
    articulos=[]
    precios=[]
    for x in range(5):
        art=input("Introduce tu articulo:")
        articulos.append(art)
        pre=int(input("Introduce el precio:"))
        precios.append(pre)
    return [articulos,precios]

def imprimir_listas(arti,preci):
    for x in range(len(arti)):
        print("Articulo",arti[x])
        print("Precio",preci[x])

def articulo_mayor(arti,preci):
    mayor=preci[0]
    mayorarti=arti[0]
    for x in range(1,len(preci)):
        if preci[x]>mayor:
            mayor=preci[x]
            mayorarti=arti[x]

    print("El articulo con el precio mayor es",mayorarti,"con un precio de",mayor)
    return mayor

def comparacion_articulos(preci,arti):
    importe=int(input("Introduce un importe:"))
    print("Los articulos con un precio igual o menor son:")
    for x in range(len(preci)):
        if importe>=preci[x]:
            print(arti[x])
    
#bloque principal
articulos,precios=cargar_listas()
imprimir_listas(articulos,precios)
mayor=articulo_mayor(articulos,precios)
comparacion_articulos(precios,articulos)
