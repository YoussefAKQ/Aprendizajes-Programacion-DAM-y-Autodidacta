package ejer48;

import java.util.Scanner;

public class ejer48 {
	private Scanner teclado;
	private String[] paises;
	private int[] habitantes;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		paises=new String[5];
		habitantes=new int[5];
		for (int f=0;f<5;f++) {
		System.out.println("Introduce el país: ");
		paises[f]= teclado.next();
		System.out.println("Introduce la cantidad de habitantes: ");
		habitantes[f]= teclado.nextInt();
		}
	}
	
	public void ordenar() {
		int aux2;
		String aux1;
		for (int k=0;k<paises.length-1;k++) {
		for (int x=0;x<paises.length-1-k;x++) {
			if (habitantes[x]<habitantes[x+1]) {
				aux2=habitantes[x];
				habitantes[x]=habitantes[x+1];
				habitantes[x+1]=aux2;
				aux1=paises[x];
				paises[x]=paises[x+1];
				paises[x+1]=aux1;
			}	
		}
		}
	}
	
	public void printear() {
		for (int k=0;k<paises.length;k++) {
			System.out.println(paises[k]);
			System.out.println(habitantes[k]);
		}
	}
	
	public void ordenar2() {
		int aux2;
		String aux1;
		for (int k=0;k<paises.length-1;k++) {
		for (int x=0;x<paises.length-1-k;x++) {
			if (paises[x].compareTo(paises[x+1])>0) {
				aux2=habitantes[x];
				habitantes[x]=habitantes[x+1];
				habitantes[x+1]=aux2;
				aux1=paises[x];
				paises[x]=paises[x+1];
				paises[x+1]=aux1;
			}	
		}
		}
	}

	public static void main(String[] ar) {
		ejer48 pv=new ejer48();
		pv.cargar();
		pv.ordenar();
		System.out.println("Ordeando por habitantes: ");
		pv.printear();
		pv.ordenar2();
		System.out.println("Ordeando por nombres de países: ");
		pv.printear();
	}
}
