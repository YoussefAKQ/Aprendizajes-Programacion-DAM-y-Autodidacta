package ejer67;

import java.util.Scanner;

public class Operaciones2 {
	private Scanner teclado;
	private int valor1;
	private int valor2;
	
	public Operaciones2() {
		Scanner teclado = new Scanner(System.in);
		int v1;
		int v2;
		System.out.println("Introduce el valor 1: ");
		v1=teclado.nextInt();
		System.out.println("Introduce el valor 2: ");
		v2=teclado.nextInt();
		valor1=v1;
		valor2=v2;
		
	}
	
	public void Suma() {
		int suma;
		suma=valor1+valor2;
		System.out.println("Suma: "+suma);
	}
	
	public void Resta() {
		int resta;
		resta=valor1-valor2;
		System.out.println("Resta: "+resta);
	}
	
	public void Multi() {
		int multi;
		multi=valor1*valor2;
		System.out.println("Multiplicación: "+multi);
	}
	
	public void Divi() {
		int divi;
		divi=valor1/valor2;
		System.out.println("División: "+divi);
	}
	
	public static void main(String[] args) {
		Operaciones2 op=new Operaciones2();
		op.Suma();
		op.Resta();
		op.Multi();
		op.Divi();
	}
	

}