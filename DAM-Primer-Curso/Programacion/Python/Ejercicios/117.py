def mostrar_mayor(v1,v2,v3):
    print("El valor mayor de los tres numeros es")
    if v1>v2 and v1>v3:
        print(v1)
    else:
        if v2>v1 and v2>v3:
            print(v2)
        else:
            if v3>v1 and v3>v2:
                print(v3)
            else:
                if v1==v2 and v1>v3:
                    print(v1)
                else:
                    if v2==v3 and v2>v1:
                        print(v2)
                    else:
                        if v2==v3 and v3==v1:
                            print("Son todos iguales")

def cargar():
    valor1=int(input("Introduce el primer valor:"))
    valor2=int(input("Introduce el segundo valor:"))
    valor3=int(input("Introduce el tercer valor:"))
    mostrar_mayor(valor1,valor2,valor3)

#programa principal

cargar()
