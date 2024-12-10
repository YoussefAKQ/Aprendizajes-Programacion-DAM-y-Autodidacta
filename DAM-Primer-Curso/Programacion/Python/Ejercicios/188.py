class persona:

    def cargar_datos(self,nombre,edad):
        self.nombre=nombre
        self.edad=edad

    def imprimir_datos(self):
        print("Nombre",self.nombre)
        print("Edad",self.edad)

    def mayor_edad(self):
        if self.edad>=18:
            print("Es mayor de edad")
        else:
            print("No es mayor de edad")

#bloque principal
nombre=input("Introduce el nombre: ")
edad=int(input("Introduce la edad: "))
persona1=persona()
persona1.cargar_datos(nombre,edad)
persona1.imprimir_datos()
persona1.mayor_edad()
