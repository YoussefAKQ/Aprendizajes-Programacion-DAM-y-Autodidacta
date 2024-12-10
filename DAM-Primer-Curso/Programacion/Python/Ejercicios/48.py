suma=0
for x in range(10):
    valor=int(input("Introduce los valores"))
    if x>4:
        suma=suma+valor
print("La suma de los últimos 5 valores es:")
print(suma)


#Aquí como SOLAMENTE nos pide la suma de los ÚLTIMOS 5 VALORES, empezamos a
#contar a partir de x>4 es decir 5, y con ese if va sumando los valores después
#del 4
