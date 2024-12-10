def largo(cadena):
    returno len(cadena)

#bloque principal

nombre1=input("Introduce primer nombre:")
nombre2=input("Introduce segundo nombre:")
la1=largo(nombre1)
la2=largo(nombre2)
if la1==la2:
    print("Los nombres:",nombre1,nombre2,"tiene la misma cantidad de caracteres")
    else:
        if la1>la2:
            print(nombre1,"es mas largo")
        else:
            print(nombre2,"es mas largo")
