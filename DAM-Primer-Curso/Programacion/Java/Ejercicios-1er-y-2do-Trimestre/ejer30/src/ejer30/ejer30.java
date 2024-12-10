package ejer30;

import java.util.Scanner;

public class ejer30 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String apenom1,apenom2;
	int edad1,edad2;
	System.out.print("Introduce el apellido y el nombre: ");
	apenom1=teclado.nextLine();
	System.out.print("Introduce edad: ");
	edad1=teclado.nextInt();
	System.out.print("Introduce el apellido y el nombre");
	teclado.nextLine();
	apenom2=teclado.nextLine();
	System.out.print("Introduce edad: ");
	edad2=teclado.nextInt();
	System.out.print("La persona de mayor edad es: ");
	if (edad1>edad2) {
		System.out.println(apenom1);
	}else {
		System.out.println(apenom2);
	}
	
	
	
	}
}
