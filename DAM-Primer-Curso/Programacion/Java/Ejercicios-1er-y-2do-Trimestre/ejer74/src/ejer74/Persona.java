package ejer74;

import java.util.Scanner;

public class Persona {
	protected String nombre;
	protected int edad;
	protected Scanner teclado;
	
	public void cargar() {
		teclado= new Scanner(System.in);
		System.out.println("Introduce el nombre: ");
		nombre = teclado.next();
		System.out.println("Introduce la edad: ");
		edad = teclado.nextInt();
		
	}
	
	public void imprimir() {
		System.out.println("Nombre: "+nombre+" Edad: "+edad);
	}

}
