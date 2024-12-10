package ejer72;

import java.util.Scanner;

public class Socio {
	private String nombre;
	private int antiguedad;
	
	public Socio(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre");
		nombre=teclado.next();
		System.out.println("Introduce la antigüedad");
		antiguedad=teclado.nextInt();
		
	}
	

}
