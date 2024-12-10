primero=0
segundo=0
tercero=0
cuarto=0
puntos=int(input("Introduce la cantidad de pares de puntos:"))
for f in range(puntos):
    x=int(input("Introduce x:"))
    y=int(input("Introduce y:"))
    if x>0 and y>0:
        print("Está en el cuadrante I")
        primero=primero+1
    else:
        if x>0 and y<0:
            print("Está en el cuadrante IV")
            cuarto=cuarto+1
        else:
            if x<0 and y>0:
                print("Está en el cuadrante II")
                segundo=segundo+1
            else:
                print("Está en el cuadrante III")
                tercero=tercero+1
print("La cantidad de puntos que se muestran en el primer cuadrante son:")
print(primero)
print("La cantidad de puntos que se muestran en el segundo cuadrante son:")
print(segundo)
print("La cantidad de puntos que se muestran en el tercero cuadrante son:")
print(tercero)
print("La cantidad de puntos que se muestran en el cuarto cuadrante son:")
print(cuarto)




#Se podría poner que x=0 y y=0 es un "Punto de origen", y habría que preguntar
# si x=0 e y=2 por ejemplo, no está en ningún cuadrante tampoco
