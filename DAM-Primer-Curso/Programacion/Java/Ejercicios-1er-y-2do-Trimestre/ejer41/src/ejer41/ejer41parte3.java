package ejer41;

import java.util.Scanner;

public class ejer41parte3 {
	private Scanner teclado;
	private float[] clase1;
	private float[] clase2;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		clase1 = new float[4];
		clase2 = new float[4];
		float suma1=0, suma2=0, prom1=0, prom2=0;
		for (int f=0;f<4;f++){
			System.out.println("Introduce la nota de la clase 1");
			clase1[f] = teclado.nextFloat();
			suma1 = suma1 + clase1[f];
			
		}
		for (int f=0;f<4;f++){
			System.out.println("Introduce la nota de la clase 2");
			clase2[f] = teclado.nextFloat();
			suma2 = suma2 + clase2[f];
		}
		prom1 = suma1 / 4 ;
		prom2 = suma2 / 4 ;
		System.out.println("El promedio de la clase 1 es: "+prom1);
		System.out.println("El promedio de la clase 2 es: "+prom2);
		if (prom1>prom2) {
			System.out.println("LA CLASE CON MAYOR PROMEDIO ES LA CLASE 1");
		}else {
			if (prom1<prom2) {
				System.out.println("LA CLASE CON MAYOR PROMEDIO ES LA CLASE 2");
			}else {
				System.out.println("Las 2 tienen el mismo promedio");
			}
		}
			
	}
	
	public static void main(String[] args) {
		ejer41parte3 pv = new ejer41parte3();
		pv.cargar();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
