def mascaracteres(palabras):
    pos=0
    for x in range(len(palabras)):
        if len(palabras[x])>len(palabras[pos]):
            pos=x
    return palabras[pos]


#bloque principal

palabras=["enero","febrero","marzo","abril","mayo","junio"]
print("Palabra con mas caracteres:",mascaracteres(palabras))
