package ejer54;

import java.util.Scanner;

public class ejer54PARTE2 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		
		System.out.println("Cuantas filas tiene la matriz?: ");
		int filas = teclado.nextInt();
		System.out.println("Cuantas columnas tiene la matriz?: ");
		int columnas = teclado.nextInt();
		mat=new int[filas][columnas];
		for (int f=0;f<mat.length;f++) {
			for (int c=0;c<mat[f].length;c++) {
				System.out.println("Introduce el componente: ");
				mat[f][c]=teclado.nextInt();
			}
		}
	}
	
	public void imprimir() {
		for (int f=0;f<mat.length;f++) {
			for (int c=0;c<mat[f].length;c++) {
				if (mat[f]==mat[c]) {
					System.out.print(mat[f][c]);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ejer54PARTE2 ma=new ejer54PARTE2();
		ma.cargar();
		ma.imprimir();
	}
}
