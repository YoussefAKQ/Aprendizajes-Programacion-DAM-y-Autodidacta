
def menor():
    lista=[]
    valor1=int(input("Introduce el primer valor"))
    lista.append(valor1)
    valor2=int(input("Introduce el segundo valor"))
    lista.append(valor2)
    valor3=int(input("Introduce el tercer valor"))
    lista.append(valor3)
    print(lista)

    
    posicionamiento=0
    for x in range(1,3):
        while posicionamiento<3:
            if lista[posicionamiento]<lista[x]:
                lista[x]
            else:
                posicionamiento=posicionamiento+1
    print("hola")
    print(lista)
    print(lista[posicionamiento])

menor()

"""sigue hacinedolo"""
