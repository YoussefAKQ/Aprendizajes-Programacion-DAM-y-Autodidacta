num1=int(input("Introduce el primer valor"))
num2=int(input("Introduce el segundo valor"))
num3=int(input("Introduce el tercer valor"))
if num1>num2 and num1>num3 and num2<num1 and num2<num3:
    print("La diferencia entre el mayor y el menor valor es:")
    print(num1-num2)
    print("El mayor valor es:")
    print(num1)
    print("El menor valor es:")
    print(num2)

else:
    if num1>num2 and num1>num3 and num3<num1 and num3<num2:
        print("La diferencia entre el mayor y el menor valor es:")
        print(num1-num3)
        print("El mayor valor es:")
        print(num1)
        print("El menor valor es:")
        print(num3)
    else:
        if num2>num1 and num2>num3 and num1<num2 and num1<num3:
            print("La diferencia entre el mayor y el menor valor es:")
            print(num2-num3)
            print("El mayor valor es:")
            print(num2)
            print(num3)
        else:
            if num3>num1 and num3>num2 and num1<num2 and num1<num3:
                print("La diferencia entre el mayor y el menor valor es:")
                print(num3-num1)
                print("El mayor valor es:")
                print(num3)
                print("El menor valor es:")
                print(num1)
            else:
                if num3>1 and num3>num2 and num2<num1 and num2<num3:
                    print("La diferencia entre el mayor y el menor valor es:")
                    print(num3-num2)
                    print("El mayor valor es:")
                    print(num3)
                    print("El menor valor es:")
                    print(num2)
                else:
                  if num2>num1 and num2>num3 and num3<num1 and num3<num2:
                    print("La diferencia entre el mayor y el menor valor es:")
                    print(num2-3)
                    print("El mayor valor es:")
                    print(num2)
                    print("El menor valor es:")
                    print(num3)


#Está es una manera correcta pero mucho más difícil de hacer, tienes
#Otro ejercicio 27 de una manera mucho más fácil.
              
                
