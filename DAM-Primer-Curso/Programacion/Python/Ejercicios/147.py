def cargar_fecha():
    dd=int(input("Introduce el numero de dia:"))
    mm=int(input("Introduce el numero de mes:"))
    aa=int(input("Introduce el numero de año:"))
    return(dd,mm,aa)

def imprimir_fecha(fecha):
    print(fecha[0],fecha[1],fecha[2],sep="/")

#bloque principal
fecha=cargar_fecha()
imprimir_fecha(fecha)    
