sueldo=int(input("Introduce tu sueldo:"))
tiempo=int(input("Introduce tus años en la empresa:"))
sueldo20=(sueldo*20)/100
sueldo5=(sueldo*5)/100
if sueldo<500 and tiempo>=10:
    print("Tu sueldo sube un 20% y se queda en:")
    print(sueldo20+sueldo)and print("$")
else:
    if sueldo<500 and tiempo<10:
        print("Tu sueldo sube un 5% y se queda en:")
        print(sueldo5+sueldo)and print("$")
    else:
        print("Tu sueldo se mantiene en:")
        print(sueldo)and print("$")
    
