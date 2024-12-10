n=int(input("Introduce el número de empleados:"))
x=1
suma=0
pobre=0
rico=0
while x<=n:
    x=x+1
    sueldo=int(input("Introduce el sueldo:"))
    suma=suma+sueldo
    if sueldo>=300:
        rico=rico+1
    else:
        pobre=pobre+1
    
print("El número de empleados que cobra más de 300 euros es:")
print(rico)
print("El número de empleados que cobra menos de 300 euros es:")
print(pobre)
print("La empresa se gasta en sus empleados:")
print(suma)
