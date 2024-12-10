package ejer42;

import java.util.Scanner;


public class ejer42 {
	private Scanner teclado;
	private int[] valores;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		int n=0;
		System.out.println("Cuantos valores quieres?");
		n = teclado.nextInt();
		for (int f=0;f<n;f++) {
			System.out.println("Introduce el valor: ");
			valores[f]=teclado.nextInt();
		}
		for (int x=0;x<valores.length;x++) {
			System.out.println(valores[x]);
		}
		
	}
	
	public void suma() {
		int total=0;
		for (int k=0;k<valores.length;k++) {
			total = total + valores[k];
		}
		System.out.println("El total es "+total);
	}
	
	public static void main(String[] args) {
		ejer42 pv=new ejer42();
		pv.cargar();
		pv.suma();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
