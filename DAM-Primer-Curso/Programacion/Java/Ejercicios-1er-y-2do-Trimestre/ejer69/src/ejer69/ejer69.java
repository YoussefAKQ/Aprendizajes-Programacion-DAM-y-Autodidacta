package ejer69;

import java.util.Scanner;

public class ejer69 {
	private Scanner teclado;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String Caracteres;
		char arroba='@';
		System.out.println("Introduce tu email");
		Caracteres = teclado.next();
		int posi=Caracteres.indexOf("@");
		if (posi==-1) {
			System.out.println(Caracteres+" NO tiene @");
		}else {
			System.out.println(Caracteres+" tiene @");
		}
		for (int x=0;x<Caracteres.length();x++) {
			char caracter=Caracteres.charAt(x);
			if (caracter==arroba) {
				System.out.println("Email incorrecto");
				
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
