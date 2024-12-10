package ejer32;

import java.util.Scanner;

public class ejer32 {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.println("Introduce nombre: ");
		nombre=teclado.next();
		System.out.println("Introduce edad: ");
		edad=teclado.nextInt();
		
	}
	
	
	
	public void imprimir() {
		System.out.println("Nombre"+nombre);
		System.out.println("Edad"+edad);
	}
	
	public void esMayorEdad() {
		if (edad>=18) {
			System.out.println(nombre+"es mayor de edad");
		}else {
			System.out.println(nombre+"no es mayor de edadd");
		}
	}
	
	
	
	
	
	
	
	
	
	

}
