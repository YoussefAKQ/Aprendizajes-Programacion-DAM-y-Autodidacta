y=int(input("Introduce la coordenada y:"))
x=int(input("Introduce la coordenada x:"))

if y>0 and x>0:
    print("Está en el primer cuadrante")
else:
    if y>0 and x<0:
        print("Está en el segundo cuadrante")
    else:
        if y<0 and x>0:
            print("Está en el cuarto cuadrante")
        else:
            print("Está en el tercer cuadrante")
