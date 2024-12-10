package vectorlength;

import java.util.Scanner;

public class vectorlength {
	private Scanner teclado;
	private int[] sueldos;

	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuanto sueldos introducirás?");
		int cant;
		cant=teclado.nextInt();
		sueldos=new int[cant];
		for (int f=0;f<sueldos.length;f++) {
			System.out.println("Introduce el sueldo: ");
			sueldos[f]=teclado.nextInt();
		}
	}

	public void imprimir() {
		for(int f=0;f<sueldos.length;f++) {
			System.out.println(sueldos[f]);
		}		
	}

	public static void main(String[] args) {
		vectorlength pv=new vectorlength();
		pv.cargar();
		pv.imprimir();
	}



}