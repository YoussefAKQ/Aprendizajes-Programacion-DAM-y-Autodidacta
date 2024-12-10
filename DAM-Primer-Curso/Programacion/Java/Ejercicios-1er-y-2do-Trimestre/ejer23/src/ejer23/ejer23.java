package ejer23;

import java.util.Scanner;

public class ejer23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int cantidad,n,f,valor;
		cantidad=0;
		System.out.print("Cuandos valores introduces:");
		n=teclado.nextInt();
		for(f=1;f<=n;f++) {
			System.out.print("Introduce el valor");
			valor=teclado.nextInt();
			if (valor>=1000) {
				cantidad=cantidad+1;
			}
		}
		System.out.print("La cantidad de valores introducidos mayores o iguales a 1000 son:");
		System.out.print(cantidad);
			
	}

}
