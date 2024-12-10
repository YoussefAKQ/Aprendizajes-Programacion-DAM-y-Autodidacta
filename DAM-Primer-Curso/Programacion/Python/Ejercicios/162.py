def cargar_datos():
    lista={}
    for x in range(4):
        print("Persona")
        dni=input("Introduce el DNI: ")
        nombre=input("Introduce el nombre: ")
        lista[dni]=nombre
    return lista

def imprimir_datos(lista):
    for clave in lista:
        print(clave,lista[clave])

def consulta_nombre(lista):
    consulta=input("Introduce tu DNI: ")
    for clave in lista:
        if consulta==clave:
            print(lista[clave])
        else:
            print("El dni que has introducido no está en el diccionario")

#bloque principal
lista=cargar_datos()
imprimir_datos(lista)
consulta_nombre(lista)
