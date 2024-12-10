package ejer41;

import java.util.Scanner;

public class ejer41parte2 {
	private Scanner teclado;
	private float[] vector1;
	private float[] vector2;
	private float[] vector3;
	
	public void cargar(){
		teclado=new Scanner(System.in);
		vector1=new float[4];
		vector2=new float[4];
		for (int f=0;f<4;f++) {
			System.out.println("Introduce el entero para el vector 1: ");
			vector1[f] = teclado.nextFloat();
	
		}
		for (int f=0;f<4;f++) {
			System.out.println("Introduce el entero para el vector 2: ");
			vector2[f] = teclado.nextFloat();
		}
	}
	
	public void suma() {
		float suma;
		vector3=new float[4];
		for (int f=0;f<4;f++) {
			suma = vector1[f] + vector2[f];
			vector3[f] = suma;
			System.out.println(vector3[f]);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		ejer41parte2 pv = new ejer41parte2();
		pv.cargar();
		pv.suma();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
