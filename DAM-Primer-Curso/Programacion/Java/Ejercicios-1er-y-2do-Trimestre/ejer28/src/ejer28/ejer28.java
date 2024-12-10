package ejer28;

import java.util.Scanner;

public class ejer28 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// PARTE 1--------------------------------------------------------------------------------------------
		System.out.println("PARTE 1----------------------------------------------------------------------------");
		int valor, suma;
		valor=0;
		suma=0;
		do {
			System.out.println("Introduce el valor (9999 para finalizar): ");
			valor = teclado.nextInt();
			if (valor!=9999) {
				suma = suma + valor;
			}
		}while(valor!=9999);
		System.out.println("El valor acumulado es "+suma);	
		// PARTE 2--------------------------------------------------------------------------------------------
		System.out.println("PARTE 2----------------------------------------------------------------------------");
		int num=0, saldo=0, sumasueldo=0, sumatotal;
		num=0;
		saldo=0;
		sumatotal=0;
		do {
			sumasueldo=0;
			System.out.println("Introduce la cuenta: ");
			num = teclado.nextInt();
			System.out.println("Introduce el saldo: ");
			saldo = teclado.nextInt();
			sumasueldo = sumasueldo + saldo;
			System.out.println(num);
			System.out.println(sumasueldo);
			if (sumasueldo>0) {
				System.out.println("Acreedor");
				sumatotal=sumatotal + saldo;
			}
			else {
				if (sumasueldo<0) {
					System.out.println("Deudor");
				}
				else {
					System.out.println("Nulo");
				}
			}
			}while(saldo>0);
		    System.out.println("Suma total de acreedores "+sumatotal);
			System.out.print("Gracias por participar.");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
