num=int(input("Introduce un valor"))
if num<10:
    print("El valor tiene una cifra")
else:
    if num<100:
        print("El valor tiene dos cifras")
    else:
        if num<1000:
            print("El valor tiene tres cifras")
        else:
            print("Error")
            
