package sef;

import java.util.Scanner;

public class Ejer6 {
	
	public static void main (String[] args) {
		
	Scanner teclado=new Scanner(System.in);
	float sueldo;
	System.out.print("Introduce un sueldo: ");
	sueldo=teclado.nextFloat();
	if (sueldo>3000) {
	
		System.out.println("Debe pasar por garita.");
	}
	teclado.close();
		
		
		

	}
	
}
