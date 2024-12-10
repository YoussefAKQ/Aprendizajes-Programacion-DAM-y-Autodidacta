def cargar():
    agenda={}
    continua1="s"
    while continua1=="s":
        fecha=input("Introduce la fecha con formato dd/mm/aa: ")
        continua2="s"
        lista=[]
        while continua2=="s":
            hora=input("Introduce la hora de la actividad con formato hh:mm")
            actividad=input("Introduce la descripcion de la actividad")
            lista.append((hora,actividad))
            continua2=input("Introduce otra actividad para la misma fecha[s/n]")
        agenda[fecha]=lista
        continua1=input("Introduce otra fecha[s/n]:")
    return agenda

def imprimir(agenda):
    print("Listado completo de la agenda")
    for fecha in agenda:
        print("Para la fecha:",fecha)
        for hora,actividad in agenda[fecha]:
            print(hora,actividad)

def consulta_fecha(agenda):
    fecha=input("Introduce la fecha que quieres consultar:")
    if fecha in agenda:
        for hora,actividad in agenda[fecha]:
            print(hora,actividad)
    else:
        print("No hay actividades agendadas para dicha fecha")

#bloque principal
agenda=cargar()
imprimir(agenda)
consulta_fecha(agenda)
