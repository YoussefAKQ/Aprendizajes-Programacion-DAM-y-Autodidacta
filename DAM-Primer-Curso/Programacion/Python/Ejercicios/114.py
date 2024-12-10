def cuadrado():
    valor=int(input("Introduce el valor::"))
    valor2=pow(valor,2)#pow sirve para elevar un valor (pow(4,4)=4**4)
    print("El resultado es:",valor2)

def producto():
    num1=int(input("Introduce el primer valor:"))
    num2=int(input("Introduce el segundo valor:"))
    mult=num1*num2
    print("El producto de ambos valores es:",mult)

#programa principal

cuadrado()
producto()
