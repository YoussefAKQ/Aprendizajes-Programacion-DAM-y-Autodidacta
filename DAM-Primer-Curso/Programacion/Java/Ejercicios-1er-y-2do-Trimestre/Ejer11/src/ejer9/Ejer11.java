package ejer9;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Introduce el primer valor: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo valor: ");
		num2=teclado.nextInt();
		System.out.println("Introduce tecer valor: ");
		num3=teclado.nextInt();
		
		if (num1>num2&&num1>num3) {
			System.out.println("El primer valor es el mayor");
			
		}
		else {
			if(num2>num3) {
				System.out.println("El segundo valor es el mayor");
			}
			else {
				System.out.println("El tercer valor es el mayor");
			}
		}
		
		
		
		
		
		
		
	}

}
