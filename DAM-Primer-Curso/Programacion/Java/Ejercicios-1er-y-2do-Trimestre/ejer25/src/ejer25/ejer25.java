package ejer25;

import java.util.Scanner;

public class ejer25 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.print("Introduce un numero entre 0 y 999 (0 finaliza): ");
			valor = teclado.nextInt();
			if (valor>=100) {
				System.out.println("Tiene 3 dígitos");
			}else {
				if (valor>=10) {
					System.out.println("Tiene 2 dígitos");
				}else {
					System.out.println("Tiene 1 dígito");
				}
			}
			
		}while (valor!=0);
		
		
		
		
		
		
		
		
		
		
		

	}

}
