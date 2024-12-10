package ejer50;

import java.util.Scanner;
public class ejer50 {
	private String[][] mat;
	
	public void cargar() {
		mat=new String[15][15];
		for (int f=0;f<15;f++) {
			for (int c=0;c<15;c++) {
				if (f==c) {
					mat[f][c]="x";
				}else {
					mat[f][c]="-";
				}
				
			}
		}
	}
	
	public void imprimirDiagonalPrincipal() {
		for(int f=0;f<15;f++) {
			for(int c=0;c<15;c++) {
				System.out.print(mat[f][c]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] ar) {
		ejer50 ma=new ejer50();
		ma.cargar();
		ma.imprimirDiagonalPrincipal();
	}
}
