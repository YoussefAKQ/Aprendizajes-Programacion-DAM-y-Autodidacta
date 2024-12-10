package ejer67;

import java.util.Scanner;

public class ejer67 {
	private Scanner teclado;
	private int sueldo;
	private String nombre;
	
	public ejer67(String nom, int sue) {
		sueldo=sue;
		nombre=nom;
	}
	
	public void imprimir() {
		System.out.println("Empleado "+nombre+" con un sueldo de "+sueldo+" euros");
		if (sueldo>3000) {
			System.out.println("Debe pagar impuestos");
		}else {
			System.out.println("No debe pagar impuestos");
		}
	}
	
	public static void main(String[] args) {
		ejer67 ol=new ejer67("Jose",4000);
		ol.imprimir();
	}
}
