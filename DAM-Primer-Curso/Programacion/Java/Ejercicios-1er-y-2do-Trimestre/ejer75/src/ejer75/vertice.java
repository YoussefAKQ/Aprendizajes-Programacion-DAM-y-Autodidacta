package ejer75;

import java.util.Scanner;

public class vertice {
	private Scanner teclado;
	private int [][] mat;
	
	public vertice() {
		Scanner teclado = new Scanner(System.in);
		mat = new int[3][3];
		for (int f=0;f<3;f++) {
			for (int c=0;c<3;c++) {
				System.out.println("Introduce el valor"+"["+f+"]"+"["+c+"]");
				mat[f][c]=teclado.nextInt();
			}
			
		}
	}
	
	public void imprimir() {
		for (int f=0;f<3;f++) {
			for (int c=0;c<3;c++) {
				System.out.print(mat[f][c]+" ");
			}
			System.out.println();
			
		}
	}
	
	public void sumarfila() {
		int fila1=0;
		int fila2=0;
		int fila3=0;
		for (int f=0;f<3;f++) {
			for (int c=0;c<3;c++) {
				if (f==0) {
					fila1 = fila1 + mat[f][c];
				}else{
					if (f==1) {
						fila2 = fila2 + mat[f][c];
						
					}else {
						fila3 = fila3 + mat[f][c];
					}
				}
			}

		}
		System.out.println("La suma de todos los valores de la fila 1 es: "+fila1);
		System.out.println("La suma de todos los valores de la fila 2 es: "+fila2);
		System.out.println("La suma de todos los valores de la fila 3 es: "+fila3);
	}
	
	public void sumatodo() {
		int sumatotal=0;
		for (int f=0;f<3;f++) {
			for (int c=0;c<3;c++) {
				sumatotal = sumatotal + mat[f][c];
			}
			
		}
		System.out.println("La suma de todos los valores es: "+sumatotal);
	}
	
	
	
	
	public static void main(String[] args) {
		vertice vertice1=new vertice();
		vertice1.imprimir();
		vertice1.sumarfila();
		vertice1.sumatodo();
		
		
	}

}
