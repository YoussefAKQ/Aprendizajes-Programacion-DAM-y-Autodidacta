package ej1;

import java.util.Scanner;

public class SuperficieCuadrado {

	public static void main(String[] args) {
	
		Scanner teclado=new Scanner(System.in);
		int lado;
		int superficie;
		System.out.print("Introduce el lado del cuadrado: ");
		lado = teclado.nextInt();
		superficie = lado*lado;
		System.out.print("La superficie del cuadrado es: ");
		System.out.println(superficie);//comentario así//
		teclado.close();
		
		
	}

}
