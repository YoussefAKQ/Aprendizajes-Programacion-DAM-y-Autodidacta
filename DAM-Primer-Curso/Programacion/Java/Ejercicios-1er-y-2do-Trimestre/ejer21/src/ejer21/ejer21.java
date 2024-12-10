package ejer21;

import java.util.Scanner;

public class ejer21 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int aprobados,reprobados,f,nota;
		aprobados=0;
		reprobados=0;
		for(f=1;f<=10;f++) {
			System.out.print("Introduce la nota");
			nota = teclado.nextInt();
			if (nota>=7) {
				aprobados=aprobados+1;
				
			}
			else {
				reprobados=reprobados+1;
			}
		}
		System.out.print("Cantidad de aprobados");
		System.out.print(aprobados);
		System.out.print("Cantidad de reprobados");
		System.out.print(reprobados);
		
		
		
		
		
		
		

	}

}
