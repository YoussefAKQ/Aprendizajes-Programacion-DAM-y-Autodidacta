def calculo_vocales(voc):
    contador=0
    for x in range(len(voc)):
        if voc[x]=="a" or voc[x]=="e" or voc[x]=="i" or voc[x]=="o" or voc[x]=="u":
            contador=contador+1
    print("La cantidad de vocales que hay es:",contador)


#programa principal

for x in range(3):
    palabra=input("Introduce tu palabra:")
    calculo_vocales(palabra)


