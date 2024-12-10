package sef;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] arg) {
		Scanner teclado= new Scanner(System.in);
		int num1,num2;
		System.out.println("Introduce un numero: ");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero: ");
		num2=teclado.nextInt();
		if (num1>num2) {
			System.out.println("El primero es mayor");
		}
		else {
			System.out.println("El segundo es mayor");
		}
	}
}
