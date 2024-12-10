package ejer20;

import java.util.Scanner;

public class ejer20 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int suma,f,valor,promedio;
		suma=0;
		for (f=1;f<=10;f++) {
			System.out.print("Introduce valor:");
			valor=teclado.nextInt();
			suma=suma+valor;
		}
		System.out.print("La suma es:");
		System.out.println(suma);
		promedio=suma/10;
		System.out.print("El promedio es: ");
		System.out.print(promedio);

	}

}
