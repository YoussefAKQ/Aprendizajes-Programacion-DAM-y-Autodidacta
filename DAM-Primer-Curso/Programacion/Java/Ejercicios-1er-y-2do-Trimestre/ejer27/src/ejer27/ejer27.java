package ejer27;

import java.util.Scanner;

public class ejer27 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cant1,cant2,cant3,suma;
		float peso;
		cant1=0;
		cant2=0;
		cant3=0;
		do {
			System.out.println("Introduce el peso de la pieza (0 para finalizar)");
			peso=teclado.nextFloat();
			if (peso>10.2) {
				cant1++;
			}else {
				if (peso>=9.8) {
					cant2++;
				}else {
					if (peso>0) {
						cant3++;
					}
				}
			}
			
		}while(peso!=0);
		System.out.println("Piezas aptas: ");
		System.out.println(cant2);
		System.out.println("Piezas con un peso superior a 10.2: ");
		System.out.println(cant1);
		System.out.println("Piezas con un peso inferior a 9.8: ");
		System.out.println(cant3);
		
	}

}
