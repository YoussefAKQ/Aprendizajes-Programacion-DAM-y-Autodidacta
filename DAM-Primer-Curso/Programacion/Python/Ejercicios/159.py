def imprimir_paises(paises):
    for clave in paises:
        print(clave,paises[clave])

#bloque principal
paises={"españa":46000000, "argentina":40000000, "brasil":190000000, "uruguay": 
3400000}
imprimir_paises(paises)
