package ejer63;

import java.util.Scanner;

public class ejer63 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		mat=new int[6][];
		int contador=0;
		for (int f=0;f<6;f++) {
			mat[f]=new int[contador];
			for (int c=0;c<contador;c++) {
				System.out.println("Introduce el componente");
				mat[f][c]=teclado.nextInt();
			}
			contador=contador+1;
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
	
	
	public static void main(String[] args) {
		ejer63 ma=new ejer63();
		ma.cargar();
		ma.imprimir();
	}
}
