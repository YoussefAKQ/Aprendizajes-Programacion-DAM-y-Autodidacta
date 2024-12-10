package ejer63;

import java.util.Scanner;

public class ejer63parte2 {
	private Scanner teclado;
	private String[][] nombres;
	private int[][] faltas;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		nombres=new String[3][1];
		faltas=new int[3][];
		int elementos=0;
		for (int f=0;f<nombres.length;f++) {
			System.out.println("Introduce el nombre");
			nombres[f][0]=teclado.next();
			System.out.println("Cuántos días faltó?");
			elementos=teclado.nextInt();
			faltas[f]=new int[elementos];
			for (int c=0;c<elementos;c++) {
				System.out.println("Introduce el día que faltó");
				faltas[f][c]=teclado.nextInt();
			}
		}
	}


	public void imprimir() {
		for (int f=0;f<faltas.length;f++) {
			System.out.println("El empleado "+nombres[f][0]);
			for (int c=0;c<faltas[f].length;c++) {
				System.out.println("Faltó el "+faltas[f][c]);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		ejer63parte2 ma=new ejer63parte2();
		ma.cargar();
		ma.imprimir();
	}
}
