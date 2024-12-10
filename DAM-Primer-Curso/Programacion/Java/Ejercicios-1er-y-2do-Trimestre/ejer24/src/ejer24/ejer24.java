package ejer24;

import java.util.Scanner;

public class ejer24 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		///PARTE 1---------------------------------------------------------------------------
		System.out.println("Parte 1-------------------------------------------");
		int base, altura, superficie, f, n, tria12=0;
		System.out.println("¿Cuántos triángulos vas a introducir?");
		n = teclado.nextInt();
		for (f=1;f<=n;f++) {
			System.out.println("Introduce la base: ");
			base = teclado.nextInt();
			System.out.println("Introduce la altura");
			altura = teclado.nextInt();
			superficie = (base*altura)/2;
			if (superficie>12){
				tria12 = tria12 + 1;
			}
			
		}
		System.out.println("La cantidad de triángulos cuya superficie es mayor a 12 es: ");
		System.out.println(tria12);
		
		///PARTE 2---------------------------------------------------------------------------
		System.out.println("Parte 2-------------------------------------------");
		n=0;
		int suma=0, valor=0 ;
		for (f=1;f<=10;f++) {
			System.out.println("Introduce el valor");
			valor = teclado.nextInt();
			if (f>5){
				suma = suma + valor;
			}
		}
		System.out.println("La suma de los últimos 5 valores es: ");
		System.out.println(suma);
		
		///PARTE 3---------------------------------------------------------------------------
		System.out.println("Parte 3-------------------------------------------");	
		int multi;
		valor=5;
		for (f=1;f<=10;f++) {
			multi = 0;
			multi = f * valor;
			System.out.println(multi);
		}

		///PARTE 4---------------------------------------------------------------------------
		System.out.println("Parte 4-------------------------------------------");	
		valor=0;
		System.out.println("Introduce un valor del 1 al 10: ");
		valor = teclado.nextInt();
		for (f=1;f<=12;f++) {
			multi = 0;
			multi = f * valor;
			System.out.println(multi);
		}
		///PARTE 5---------------------------------------------------------------------------
		System.out.println("Parte 5-------------------------------------------");	
		int lado1, lado2, lado3, equi=0, isos=0, esca=0 ;
		n=0;
		System.out.println("Introduce la cantidad de triángulos que vas a introducir: ");
		n = teclado.nextInt();
		for (f=1;f<=n;f++) {
			lado1=0;
			lado2=0;
			lado3=0;
			System.out.println("Introduce el primer lado");
			lado1 = teclado.nextInt();
			System.out.println("Introduce el segundo lado");
			lado2 = teclado.nextInt();
			System.out.println("Introduce el tercer lado");
			lado3 = teclado.nextInt();
			
			if (lado1==lado2&&lado2==lado3){
				equi= equi + 1;
			}
			else {
				if (lado1!=lado2&&lado1!=lado3&&lado2!=lado3) {
					esca = esca + 1;
				}
				else {
					isos = isos +1;
				}
			}
		}
		System.out.println("La cantidad de triángulos equiláteros es: ");
		System.out.println(equi);
		System.out.println("La cantidad de triángulos isósceles es: ");
		System.out.println(isos);
		System.out.println("La cantidad de triángulos escalenos es: ");
		System.out.println(esca);

		if (equi<isos&&equi<esca) {
			System.out.println("El triángulo que menos se repite es el equilátero");
		}
		if (isos<equi&&isos<esca) {
			System.out.println("El triángulo que menos se repite es el isósceles");
		}if (esca<isos&&esca<equi) {
			System.out.println("El triángulo que menos se repite es el escaleno");
		}
		///PARTE 6---------------------------------------------------------------------------
		System.out.println("Parte 6-------------------------------------------");
		int x=0, y=0, pricua=0, segcua=0, tercua=0, cuacua=0;
		n = 0;
		System.out.println("Introduce la cantidad de puntos a procesar");
		n = teclado.nextInt();
		for (f=1;f<=n;f++) { 
			System.out.println("Introduce x: ");
			x = teclado.nextInt();
			System.out.println("Introduce y: ");
			y = teclado.nextInt();
			
			if (x<0&&y>0) {
				pricua = pricua + 1;
			}
			if (x>0&&y>0) {
				segcua = segcua + 1;
			}
			if (x<0&&y<0) {
				tercua= tercua + 1;
			}
			if (x>0&&y<0) {
				cuacua = cuacua + 1;
			}
		}
		System.out.println("Puntos en el primer cuadrante: "+pricua);
		System.out.println("Puntos en el segundo cuadrante: "+segcua);
		System.out.println("Puntos en el tercero cuadrante: "+tercua);
		System.out.println("Puntos en el cuarto cuadrante: "+cuacua);
		///PARTE 7---------------------------------------------------------------------------
		System.out.println("Parte 7-------------------------------------------");
		int pos=0, neg=0, mult15=0, val=0, par=0;
		System.out.println("Introduce 10 valores");
		for (f=1;f<=10;f++) {
			System.out.println("Introduce el valor: ");
			val = teclado.nextInt();
			if (val>0) {
				pos = pos +1;
			}
			else {
				neg = neg +1;
			}
			if (val%15==0) {
				mult15 = mult15 + 1;
			}
			
			if (val%2==0) {
				par = par + 1;
			}
			
			
		}
		System.out.println("La cantidad de valores introducidos negativos es "+neg);
		System.out.println("La cantidad de valores introducidos positivos es "+pos);
		System.out.println("La cantidad de valores introducidos multiplos de 15 es "+mult15);
		System.out.println("La cantidad de valores introducidos pares es "+par);
		///PARTE 8---------------------------------------------------------------------------
		System.out.println("Parte 8-------------------------------------------");
		int edad=0,sumaM=0, sumaT=0, sumaN=0, promM=0,promT=0,promN=0;
		System.out.println("Introduce la edad 5 estudiantes del turno de mañana");
		for (f=1;f<=5;f++) {
			System.out.println("Introduce la edad del estudiante de mañana");
			edad = teclado.nextInt();
			sumaM = sumaM + edad; 
		}
		System.out.println("Introduce la edad 6 estudiantes del turno de tarde");
		for (f=1;f<=6;f++) {
			System.out.println("Introduce la edad del estudiante de tarde");
			edad = teclado.nextInt();
			sumaT = sumaT + edad; 
		}
		System.out.println("Introduce la edad 11 estudiantes del turno de noche");
		for (f=1;f<=11;f++) {
			System.out.println("Introduce la edad del estudiante de noche");
			edad = teclado.nextInt();
			sumaN = sumaN + edad; 
		}
		promM = sumaM/5;
		promT = sumaT/6;
		promN = sumaN/11;

		System.out.println("El promedio de edad de la mañana es "+promM);
		System.out.println("El promedio de edad de la tarde es "+promT);
		System.out.println("El promedio de edad de la noche es "+promN);
		
		if (promM<promT) {
			if (promM<promN) {
				System.out.println("El promedio de mañana es el menor");
			}
			
		}
		if (promT<promM) {
			if (promT<promN) {
				System.out.println("El promedio de tarde es el menor");
			}
			
		}
		if (promN<promT) {
			if (promN<promM) {
				System.out.println("El promedio de noche es el menor");
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
