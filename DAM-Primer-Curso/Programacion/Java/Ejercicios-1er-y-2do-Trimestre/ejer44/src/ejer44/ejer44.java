package ejer44;

import java.util.Scanner;

public class ejer44 {
	private Scanner teclado;
	private int[] sueldos;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		sueldos=new int[5];
		for(int f=0;f<sueldos.length;f++) {
			System.out.println("Introduce el sueldo");
			sueldos[f]=teclado.nextInt();
		}
	}
	
	public void ordenar() {
		for(int k=0;k<4;k++) {
			for(int f=0;f<4;f++) {
				int aux;
				aux=sueldos[f];
				sueldos[f]=sueldos[f+1];
				sueldos[f+1]=aux;
					
			}
		}
	}
	
	public void imprimir() {
		System.out.println("Sueldos ordenados de menor a mayor");
		for(int f=0;f<sueldos.length;f++) {
			System.out.println(sueldos[f]);
			
		}
	}
	
	public static void main(String[] ar) {
		ejer44 pv=new ejer44();
		pv.cargar();
		pv.ordenar();
		pv.imprimir();
	}
	
	

	
	

}
