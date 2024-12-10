package ejer54;

import java.util.Scanner;

public class ejer54 {
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
				System.out.print(mat[f][c]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void intercambiar() {
		for (int f=0;f<mat.length;f++) {
			for (int c=0;c<mat[f].length;c++) {
				if (mat[f][c]==mat[0][c]) { 
					int aux;
					aux=mat[f][c];
					mat[f][c]=mat[f+1][c];
					mat[f+1][c]=aux; 
				}
			}
		}
	}

	public static void main(String[] args) {
		ejer54 ma=new ejer54();
		ma.cargar();
		System.out.println("SIN CAMBIAR");
		ma.imprimir();
		System.out.println("--------------");
		ma.intercambiar();
		System.out.println("CAMBIADO");
		ma.imprimir();
		System.out.println("--------------");
	}
}
