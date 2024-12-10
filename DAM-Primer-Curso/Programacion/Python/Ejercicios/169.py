def carga_datos():
    diccionario={}
    continua="s"
    while continua=="s":
        expediente=input("Introduce el expediente: ")
        nombre=input("Introduce el nombre: ")
        profesion=input("Introduce la profesion: ")
        sueldo=float(input("Introduce el sueldo: "))
        continua=input("Quieres introducir otro empleado?[s/n]: ")
        diccionario[expediente]=[nombre,profesion,sueldo]
    return diccionario

def printear_sueldo(diccionario):
    for elemento in diccionario:
        print(elemento)
        print(diccionario[elemento][0],diccionario[elemento][1],diccionario[elemento][2])
    
def modificar_sueldo(diccionario):
    continua="s"
    while continua=="s":
        pregunta=input("Introduce el expediente a modificar: ")
        if pregunta in diccionario:
            pregunta2=input("Introduce a qué sueldo quieres cambiarlo: ")
            diccionario[pregunta][2]=pregunta2
        else:
            print("No existe un empleado con dicho expediente")
        pregunta3=input("Quieres cambiar otro expediente?[s/n]")
        continua=pregunta3
    for elemento in diccionario:
        print(elemento)
        print(diccionario[elemento][0],diccionario[elemento][1],diccionario[elemento][2])
    
def printear_analistas(diccionario):
    print("Todos los empleados con la profesión de sistemas: ")
    for elemento in diccionario:
        if diccionario[elemento][1]=="analista de sistemas":
            print(elemento)
            print(diccionario[elemento][0],diccionario[elemento][1],diccionario[elemento][2])

#bloque principal
diccionario=carga_datos()
printear_sueldo(diccionario)
modificar_sueldo(diccionario)
printear_analistas(diccionario)
