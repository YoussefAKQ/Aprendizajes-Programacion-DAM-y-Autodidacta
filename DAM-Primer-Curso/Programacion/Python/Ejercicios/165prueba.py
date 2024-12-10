def cargar_datos():
    alumnos={}
    for x in range(3):
        dni=input("Introduce el dni")
        continua="s"
        lista=[]
        while continua=="s":
            materia=input("Introduce el nombre de la materia: ")
            nota=int(input("Introduce la nota de la materia: "))
            lista.append((materia,nota))
            pregunta=input("Este alumno tiene más materias?[s/n]: ")
            continua=pregunta
        alumnos[dni]=lista
    return alumnos
    

def imprimir_datos(diccionario):
    for dni in diccionario:
        print("Para el dni",dni)
        for materia,nota in diccionario[dni]:
            print(materia,nota)


def consultar_datos(diccionario):
    tudni=input("Introduce el dni que buscas: ")
    for clave in diccionario:
        if tudni==clave:
            print("Notas del dni",clave,":")
            for materia,nota in diccionario[clave]:
                print(materia,nota)

#bloque principal
diccionario=cargar_datos()
imprimir_datos(diccionario)    
consultar_datos(diccionario)
