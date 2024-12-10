lista=[1,2,3]
tupla=(1,2,3)
fecha=(25,"Diciembre",2016)
punto=(10,2)
persona=("Rodriguez","Pablo",43)

valor=int(input("Introduce un valor para la lista:"))
lista.append(valor)
print(lista)

valor2=int(input("Introduce un valor para la tupla:"))
tupla.append(valor2)
print(tupla)


"""
Las tuplas son como las listas pero en estas no se les puede introducir un
valor, cuando intentas meterle algo da error. Para meterles valores hay que
cambiarlo a lista con list o tuple para hacer lo contrario
"""
