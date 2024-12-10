def cargar_sueldos():
    sueldos=[]
    for x in range(10):
        su=int(input("Introduce los sueldos:"))
        sueldos.append(su)
    return(sueldos)

def imprimir(su):
    print("La lista de sueldos es:")
    for x in range(len(su)):
        print(su[x])

def superior_4000(su):
    contador=0
    for x in range(len(su)):
        if su[x]>4000:
            contador=contador+1
    print("La cantidad de sueldos superiores a 4000 son",contador)
    
def promedio_sueldos(su):
    suma=0
    for x in range(len(su)):
        suma=suma+su[x]
    promedio=suma/10
    print("El promedio es",promedio)
    return(promedio)
    
def bajo_promedio(su,pro):
    print("Los sueldos por debajo del promedio son:")
    for x in range(len(su)):
        if pro>su[x]:
            print(su[x])


    
#bloque principal
sueldos=cargar_sueldos()#convertimos sueldos a la lista de sueldos
imprimir(sueldos)#ahora que tenemos la lista de sueldos, llamamos a la funcion imprimir con sueldos ya que ya lo tenemos
superior_4000(sueldos)#llamamos a la funcion con sueldos
promedio=(promedio_sueldos(sueldos))#definimos promedio y llamamos a la funcion y con el return conseguimos definir promedio
bajo_promedio(sueldos,promedio)#llamamos a la funcion con los 2 valores ya definidos
