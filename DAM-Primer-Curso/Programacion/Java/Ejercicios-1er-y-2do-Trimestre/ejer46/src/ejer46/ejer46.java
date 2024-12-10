package ejer46;

import java.util.Scanner;

public class ejer46 {
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
	
	public void ordenar() {
		for(int k=0;k<elementos.length;k++) {
			for(int f=0;f<elementos.length-1-k;f++) {
				if (elementos[f]<elementos[f+1]) {
					int aux;
					aux=elementos[f];
					elementos[f]=elementos[f+1];
					elementos[f+1]=aux;
				}
			}
		}
		for(int x=0;x<elementos.length;x++) {
			System.out.println(elementos[x]);
		}
		
	}
	
	public static void main(String[] args) {
		ejer46 pv=new ejer46();
		pv.cargar();
		pv.ordenar();
	}
	

	
	
}
