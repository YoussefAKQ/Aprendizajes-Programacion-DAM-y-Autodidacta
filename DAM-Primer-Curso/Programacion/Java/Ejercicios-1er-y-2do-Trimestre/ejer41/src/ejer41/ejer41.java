package ejer41;

import java.util.Scanner;
public class ejer41 {
	private Scanner teclado;
	private float[] edades;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		edades=new float[8];
		for (int f=0;f<8;f++) {
			System.out.println("Introduce la edad: ");
			edades[f] = teclado.nextFloat();
		}
	}
	
	public void sumar() {
		float sumar=0;
		for (int f=0;f<8;f++) {
			sumar = sumar + edades[f];
		}
		System.out.println("La suma de todas las edades es: "+sumar);	
	}
	
	public void diferenciar() {
		int may36=0,may50=0;
		for (int f=0;f<8;f++) {
			if (edades[f]>36) {
				may36 = may36 + 1;
			}
			if (edades[f]>50) {
				may50 = may50 + 1;
			}
		}
		System.out.println("La cantidad de personas mayores a 36 es: "+may36);
		System.out.println("La cantidad de personas mayores a 50 es: "+may50);
	}
	
	public static void main(String[] args) {
		ejer41 pv = new ejer41();
		pv.cargar();
		pv.sumar();
		pv.diferenciar();
	}
	
	
	
}
