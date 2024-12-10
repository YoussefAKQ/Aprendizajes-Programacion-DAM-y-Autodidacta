def recibe_valores(palabra):
    contador=0
    for x in range(len(palabra)):
        if palabra[x]=="a" or palabra[x]=="A":
            contador=contador+1
    return contador

def envia_valores():
    palabra=(input("Introduce la palabra:"))
    print("La cantidad de as que hay en la palabra",palabra,"son",recibe_valores(palabra))

envia_valores()
