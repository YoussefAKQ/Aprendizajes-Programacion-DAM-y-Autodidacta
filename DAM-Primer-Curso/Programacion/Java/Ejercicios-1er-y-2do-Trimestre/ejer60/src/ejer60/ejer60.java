package ejer60;

import java.util.Scanner;

public class ejer60 {
	private Scanner teclado;
	private int[][] mat;
	private String[] pais;
	private int[][] media;
	
	public void cargar () {
		teclado=new Scanner(System.in);
		mat=new int[4][3];
		pais=new String[4];
		for (int f=0;f<pais.length;f++){
			System.out.println("Introduce el nombre del país: ");
			pais[f]=teclado.next();
			for (int x=0;x<mat.length-1;x++){
				System.out.println("Introduce la temperatura trimestral: ");
				mat[f][x]=teclado.nextInt();
			}
		}
	}
	
	public void imprimir () {
		for (int f=0;f<pais.length;f++){
			System.out.println(pais[f]);
			for (int x=0;x<mat.length-1;x++){
				System.out.print(mat[f][x]+" ");
			}
			System.out.println();
		}
	}
	
	public void media() {
		int suma=0;
		media=new int[4][1];
		for (int f=0;f<pais.length;f++){
			for (int x=0;x<mat.length-1;x++){
				suma=suma+mat[f][x];
			}
		}
	}
	
	///terminalo
	
	public static void main(String[] args) {
		ejer60 ma=new ejer60();
		ma.cargar();
		ma.imprimir();
		ma.media();
		
	}
	
	
	
}
