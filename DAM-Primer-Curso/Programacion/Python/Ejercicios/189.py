class triangulo:

    def cargar_datos(self,lado1,lado2,lado3):
        self.lado1=lado1
        self.lado2=lado2
        self.lado3=lado3

    def imprimir_mayor(self):
        if self.lado1>self.lado2 and selflado1>selflado3:
            print("El lado mayor es",self.lado1)
        else:
            if self.lado2>self.lado1 and self.lado2>self.lado3:
                print("El lado mayor es",self.lado2)
            else:
                if self.lado3>self.lado1 and self.lado3>self.lado2:
                    print("El lado mayor es",self.lado3)
                else:
                    print("Los lados son iguales")

    def mostrar_equilatero(self):
        if self.lado1==self.lado2 and self.lado1==self.lado3:
            print("Es equilatero")
        else:
            print("No es equilatero")

#bloque principal
lado1=int(input("Introduce el primer lado: "))
lado2=int(input("Introduce el segundo lado: "))
lado3=int(input("Introduce el tercer lado: "))
triangulo1=triangulo()
triangulo1.cargar_datos(lado1,lado2,lado3)
triangulo1.imprimir_mayor()
triangulo1.mostrar_equilatero()
