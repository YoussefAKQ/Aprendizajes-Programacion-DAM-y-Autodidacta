package ejer74;

import java.util.Scanner;

public class Empleado extends Persona {
	protected int sueldo;
	protected Scanner teclado;
	
	public void cargarsueldo() {
		teclado= new Scanner(System.in);
		System.out.println("Introduce el sueldo: ");
		sueldo = teclado.nextInt();
	}

	public void imprimirsueldo() {
		System.out.println("Sueldo: "+sueldo);
		
	}
	
}
