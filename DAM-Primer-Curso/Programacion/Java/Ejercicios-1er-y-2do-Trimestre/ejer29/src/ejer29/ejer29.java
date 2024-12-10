package ejer29;

import java.util.Scanner;

public class ejer29 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre1,nombre2;
		int edad1,edad2;
		System.out.println("Introduce tu nombre: ");
		nombre1=teclado.next();
		System.out.print("Introduce tu edad: ");
		edad1=teclado.nextInt();
		System.out.println("Introduce el nombre");
		nombre2=teclado.next();
		System.out.println("Introduce edad");
		edad2=teclado.nextInt();
		System.out.println("La persona de mayor edad es: ");
		if (edad1>edad2) {
			System.out.println(nombre1);
		}else {
			System.out.println(nombre2);
		}
		
	}

}
