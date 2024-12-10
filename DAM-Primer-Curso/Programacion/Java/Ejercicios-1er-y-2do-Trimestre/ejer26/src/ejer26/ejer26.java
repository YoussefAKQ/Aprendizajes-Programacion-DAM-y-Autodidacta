package ejer26;

import java.util.Scanner;

public class ejer26 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int suma,cant,valor,promedio;
		suma=0;
		cant=0;
		do {
			System.out.print("Introduce un numero (0 para finalizar)");
			valor=teclado.nextInt();
			if (valor!=0) {
				suma=suma+valor;
				cant++;
			}
		}while(valor!=0);
		if (cant!=0) {
			promedio=suma/cant;
			System.out.println("El promedio de los numeros introducidos es: ");
			System.out.println(promedio);
		}else {
			System.out.println("No se introdujeron numeros.");
		}

	}

}
