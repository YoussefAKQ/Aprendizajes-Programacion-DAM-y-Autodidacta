def primeros_tres(cadena):

    return cadena[:3];

# bloque principal
meses=('enero','febrero','marzo','abril','mayo','junio','julio','agosto','septiembre','octubre','noviembre','diciembre')
for x in meses:
    print(primeros_tres(x))
