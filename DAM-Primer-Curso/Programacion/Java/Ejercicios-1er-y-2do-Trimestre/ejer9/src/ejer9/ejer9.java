package ejer9;

import java.util.Scanner;

public class ejer9 {
	public static void main(String[] args) {
		 Scanner teclado= new Scanner(System.in);
		 
		 int nota1,nota2,nota3,promedio;
		 
		 System.out.println("Introduce nota1 : ");
		 nota1=teclado.nextInt();
		 System.out.println("Introduce nota2 : ");
		 nota2=teclado.nextInt();
		 System.out.println("Introduce nota3 : ");
		 nota3=teclado.nextInt();
		 promedio=(nota1+nota2+nota3)/3;
		 System.out.println("El promedio es "+promedio);
		 
		 if (promedio>=7) {
			 System.out.println("Promociona");
		 }
		 else if(promedio>=4) {
			 System.out.println("Regular");
		 }
		 else if(promedio<4) {
			 System.out.println("Suspendido");
		 }
			
			
		
	}
		
		
		
}

