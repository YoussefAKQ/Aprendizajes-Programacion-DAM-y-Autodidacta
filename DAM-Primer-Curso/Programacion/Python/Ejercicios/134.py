def cargar_datos():
    nom=[]
    ed=[]
    for x in range(5):
        v1=input("Introduce el nombre de la persona:")
        nom.append(v1)
        v2=int(input("Introduce la edad"))
        ed.append(v2)
    return[nom,ed]

def mayores_edad(no,ed):
    for x in range(len(ed)):
        if ed[x]>18:
            print(ed[x],"es mayor de edad")

def promedio_edad(edades):
    suma=0
    for x in range(len(ed)):
        suma=suma+ed[x]
    promedio=suma/5
    print("El promedio es",promedio)


#bloque principal
nombres,edades=cargar_datos()
mayores_edad(nombres,edades)
promedio_edades(edades)


"""está mal echale un ojo"""
