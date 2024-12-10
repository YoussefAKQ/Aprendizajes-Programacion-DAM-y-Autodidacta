/// 
///


package sef;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] arg) {
		Scanner teclado= new Scanner(System.in);
		double valor1, valor2, suma, resta, producto, nota, promedionota, numero;
		double division;
		System.out.println("Introduce un valor: ");
		valor1 = teclado.nextDouble();
		System.out.println("Introduce otro valor: ");
		valor2 = teclado.nextDouble();
		if (valor1>valor2) {
			suma = 0;
			resta = 0;
			suma=valor1+valor2;
			resta=valor1-valor2;
			System.out.println("La suma de los 2 valores es ");
			System.out.println(suma);
			System.out.println("La diferencia entre los 2 valores es ");
			System.out.println(resta);
		}
		else {
			producto = valor1 * valor2;
			division = valor1/valor2;
			System.out.println("El producto de los 2 valores es: ");
			System.out.println(producto);
			System.out.println("La division de los 2 valores es: ");
			System.out.println(division);
		}
		///Parte 2 -------------------------------------------------------------------------------
		promedionota = 0;
		System.out.println("Introduce tu primera nota: ");
		nota = teclado.nextDouble();
		promedionota = promedionota + nota;
		System.out.println("Introduce tu segunda nota: ");
		nota = teclado.nextDouble();
		promedionota = promedionota + nota;
		System.out.println("Introduce tu tercera nota: ");
		nota = teclado.nextDouble();
		promedionota = promedionota + nota;
		promedionota = promedionota/3;
		System.out.println("Tu nota promedio es: ");
		System.out.println(promedionota);
		if (promedionota>=7){
			System.out.println("Promocionado");
		}
		else {
			System.out.println("Suspendido");
		}
		///Parte 3 --------------------------------------------------------------------------------
		System.out.println("Introduce un numero del 1 al 99: ");
		numero = teclado.nextDouble();
		if (numero>9) {
			System.out.println("El numero es de dos cifras");
		}
		else {
			System.out.println("El numero es de una cifra");
		}
		teclado.close();
	}
}
