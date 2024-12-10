package ejer66;

import java.util.Scanner;

public class TablaMultiplicar {
	private int tabla;
	private int terminos;
	
	
	public TablaMultiplicar(int ta,int ter) {
		tabla=ta;
		terminos=ter;
	}
	
	public TablaMultiplicar(int ta) {
		tabla=ta;
		terminos=10;
	}
	
	public void imprimir() {
		System.out.println("Tabla de multiplicar del "+tabla);
		for (int f=1;f<=terminos;f++) {
			int resultado=f*tabla;
			System.out.println(tabla+"*"+f+"="+resultado);
			
		}
	}
	
	public static void main(String[] ar) {
		TablaMultiplicar tabla1=new TablaMultiplicar(5);
		tabla1.imprimir();
		TablaMultiplicar tabla2=new TablaMultiplicar(3,5);
		tabla2.imprimir();
	}
	

}
