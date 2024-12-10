package ProblemaPropuesto;

import java.util.Scanner;

public class ProblemaPropuesto {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int lado, numero, suma, producto;
		System.out.print("Introduce el primer valor: ");
		numero = teclado.nextInt();
		suma = suma + numero;
		System.out.print("Introduce el segundo valor");
		numero=teclado.nextInt();
		suma = suma + numero;
		System.out.print("La suma de los 2 primeros valores es");
		System.out.println(suma);
		teclado.close();
		
		
	}
	
}