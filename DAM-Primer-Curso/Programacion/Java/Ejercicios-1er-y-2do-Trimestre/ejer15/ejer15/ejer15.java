package ejer15;

import java.util.Scanner;

public class ejer15 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n,x;
		System.out.print("Introduce el valor final:");
		n=teclado.nextInt();
		x=1;
		while (x <= n) {
			System.out.print(x);
			System.out.print("-");
			x = x + 1;
		}

	}

}
