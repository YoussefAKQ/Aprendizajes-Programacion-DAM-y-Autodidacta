package ejer74;

public class Main {
	public static void main(String[] args) {
		Persona persona1= new Persona();
		persona1.cargar();
		persona1.imprimir();
		Empleado empleado1=new Empleado();
		empleado1.cargarsueldo();
		empleado1.imprimirsueldo();
	}

}
