def cargar():
    diccionario={}
    continua="s"
    while continua=="s":
        caste=input("Introduce una palabra en castellano: ")
        ing=input("Introduce una palabra en ingles: ")
        diccionario[ing]=caste
        continua=input("Quieres seguir cargando palabras?[s/n]")
    return diccionario

def imprimir(diccionario):
    print("Listado completo del diccionario")
    for ingles in diccionario:
        print(ingles,diccionario[ingles])

def consulta_palabra(diccionario):



    
