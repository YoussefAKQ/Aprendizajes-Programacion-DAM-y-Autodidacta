package ejer51;

import java.util.Scanner;

public class Matriz3 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		mat=new int[3][4];
		for(int f=0;f<3;f++) {
			for(int c=0;c<4;c++) {
				System.out.println("Introduce componente: ");
				mat[f][c]=teclado.nextInt();
			}
		}
	}
	
	public void primerFila() {
		System.out.println("Primera fila de la matriz");
	
		for (int c=0;c<4;c++) {
			System.out.println(mat[0][c]);
		}
	}
	
	public void ultimaFila() {
		System.out.println("Ultima fila de la matriz: ");
		for(int c=0;c<4;c++) {
			System.out.println(mat[2][c]);
		}
	}
	
	public void primerColumna() {
		System.out.println("Primer columna: ");
		for(int f=0;f<3;f++) {
			System.out.println(mat[f][0]);
		}
	}
	
	public static void main(String[] ar) {
		Matriz3 ma=new Matriz3();
		ma.cargar();
		ma.primerFila();
		ma.ultimaFila();
		ma.primerColumna();
	}
	
	
	
	
	
	
}
	
	