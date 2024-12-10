package ejer43;

import java.util.Scanner;

public class ejer43 {
	private Scanner teclado;
	private int[] elementos;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		System.out.println("¿Cuántos elementos?");
		int n = teclado.nextInt();
		elementos=new int[n];
		for (int f=0;f<n;f++) {
			System.out.println("Introduce el valor");
			elementos[f] = teclado.nextInt();
		}
	}
	
	public void comprobar() {
		int contador = 0;
		int menor = elementos[0];
		for (int x=1;x<elementos.length;x++) {
			if (elementos[x]<menor) {
				menor=elementos[x];
			}
	
		}
		System.out.println("El menor es "+menor);
		
		for (int k=0;k<elementos.length;k++) {
			if (elementos[k]==menor) {
				contador = contador + 1;
			}
			if (contador>1) {
				System.out.println("Se repite el elemento"+menor);
			}
			
		}
	}
	

	
	public static void main(String[] args) {
		ejer43 pv=new ejer43();
		pv.cargar();
		pv.comprobar();
		
	}

	
}
