package ejer17;

import java.util.Scanner;

public class ejer17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x=1,cantidad=0,n;
		float largo;
		System.out.print("Cuantas piezas procesará: ");
		n=teclado.nextInt();
		while (x<=n) {
			System.out.print("Introduce la medida de la pieza");
			largo=teclado.nextFloat();
			if (largo>=1.20 && largo<=1.30) {
				cantidad = cantidad +1;
			}
			x=x +1;
		}
		System.out.print("La cantidad de piezas aptas son: ");
		System.out.print(cantidad);

	}

}
