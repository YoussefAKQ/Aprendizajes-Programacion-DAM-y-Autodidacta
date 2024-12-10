def cargar_datos():
    alumnos={}
    for x in range(3):
        dni=input("Introduce el numero de dni")
        listamaterias=[]
        continua="s"
        while continua=="s":
            materia=input("Introduce el nombre de la materia que cursa: ")
            nota=int(input("Introduce la nota de la materia: "))
            listamaterias.append((materia,nota))
            pregunta=input("Quieres meter más materias?[s/n]:")
            continua=pregunta
        alumnos[dni]=listamaterias
    return alumnos
            
def imprimir_datos(alumnos):
    for dni in alumnos:
        print("Para el dni",dni)
        for materia,nota in alumnos[dni]:
            print(materia,nota)

def consulta_notas(alumnos):
    tudni=input("Introduce el dni a consultar: ")
    for clave in alumnos:
        if tudni==clave:
            for materia,nota in alumnos[clave]:
                print(materia,nota)


#bloque principal
lista=cargar_datos()
imprimir_datos(lista)
consulta_notas(lista)


#ESTE ES COPIADO, TÚ HAS HECHO OTRO QUE SE LLAMA 165Prueba
