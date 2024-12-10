package ejer52;

import java.util.Scanner;

public class ejer52 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado=new Scanner(System.in);		
		mat=new int[2][5];
		int cont = 0;
		for (int c=0;c<5;c++) {
		for (int f=0;f<2;f++) {
				System.out.println("Introduce el componente: ");
				mat[f][cont] = teclado.nextInt();				///Aquí en vez de un contador podríamos utilizar la c que es lo mismo que el contador
		}
		cont = cont + 1;
	}
	}
	
	public void imprimir() {
		System.out.println("La matriz: ");
		for (int f=0;f<2;f++) {
			for (int c=0;c<5;c++) {
				System.out.print(mat[f][c]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ejer52 ma=new ejer52();
		ma.cargar();
		ma.imprimir();
	}
}
