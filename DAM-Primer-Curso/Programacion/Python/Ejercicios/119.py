def calculo_vocales():
    contador=0
    for x in range(len(voc)):
        if voc[x]=="a" or voc[x]=="e" or voc[x]=="i" or voc[x]=="o" or voc[x]=="u":
            contador=contador+1
    print("La cantidad de vocales que hay es:",contador)

def cargar_dato():
    voc=input("Introduce la palabra")
    calculo_vocales(voc)

cargar_dato()
calculo_vocales()



"""está mal"""
