lista=[]
valor=int(input("Introducir valor(0 para finalizar)"))
while valor!="0":
    lista.append(valor)
    valor=int(input("Introduce valor(0 para finalizar)"))
print("Tamaño lista")
print(len(lista))







"""Aquí no hace falta un contador ya que almacena los datos en lista,
para luego printearlos con un len.
El append sirve para introducir tu mismo los datos en la lista y aquí usamos
el while ya que no sabemos cuantos valores va a introducir el usuario,
y un != que significa MIENTRAS NO SEA"""
