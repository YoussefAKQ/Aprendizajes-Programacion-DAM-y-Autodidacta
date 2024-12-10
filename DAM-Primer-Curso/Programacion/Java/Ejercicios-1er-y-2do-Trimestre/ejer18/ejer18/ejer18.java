package ejer18;

import java.util.Scanner;

public class ejer18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota,contador=0,contadoralto=0, contadorbajo=0,sueldo=0,contadorsueldo1=0,contadorsueldo2=0,sumasueldos=0, sumaterminos=0;
		float altura=0,sumaalturas=0,n=0, contador2=0, promedioalturas=0;
		///Parte 1 ---------------------------------------------------------
		System.out.println("PARTE 1 ");
		while (contador<10) {
			System.out.println("Introduce la nota: ");
			nota = teclado.nextInt();
			contador=contador+1;
			if (nota>=7) {
				contadoralto=contadoralto+1;
			}
			else {
				contadorbajo=contadorbajo+1;
			}
		}
		System.out.println("Alumnos con 7 o más: ");
		System.out.println(contadoralto);
		System.out.println("Alumnos con menos de 7 ");
		System.out.println(contadorbajo);
		
		
		///Parte 2 -----------------------------------------------------------
		System.out.println("PARTE 2 ");
		System.out.print("Introduce la cantidad de alturas");
		n = teclado.nextFloat();
		while (n>contador2) {
			contador2=contador2+1;
			System.out.println("Introduce la altura: ");
			altura = teclado.nextFloat();
			sumaalturas=sumaalturas+altura;
		}
		System.out.println("El promedio de alturas es:");
		promedioalturas=sumaalturas/n;
		System.out.println(promedioalturas);
		
		///Parte 3 --------------------------------------------------------------
		System.out.println("PARTE 3 ");
		contador2=0;
		System.out.print("Introduce la cantidad de empleados");
		n = teclado.nextFloat();
		while (n>contador2) {
			contador2=contador2+1;
			System.out.println("Introduce los sueldos: ");
			sueldo = teclado.nextInt();
			sumasueldos=sumasueldos+sueldo;
			if (sueldo>100&&sueldo<300) {
				contadorsueldo1=contadorsueldo1+1;
			}
			else {
				if (sueldo>300) {
					contadorsueldo2=contadorsueldo2+1;
				}
			}
		}
		System.out.println("La cantidad de empelados que cobran entre 100 y 300 es: ");
		System.out.println(contadorsueldo1);
		System.out.println("La cantidad de empelados que cobran más de 300 es: ");
		System.out.println(contadorsueldo2);
		System.out.println("El importe que gasta la empresa en sueldo es: ");
		System.out.println(sumasueldos);
		///Parte 4 --------------------------------------------------------------
		System.out.println("PARTE 4 ");
		contador=0;
		while (contador<25) {
			System.out.print(sumaterminos);
			System.out.print("-");
			sumaterminos=sumaterminos+11;
			contador=contador+1;
		}
		///Parte 5 --------------------------------------------------------------
		System.out.println("PARTE 5 ");
		int multiplos=0;
		while (multiplos<490) {
			multiplos=multiplos+8;
			System.out.println(multiplos);
		}
		///Parte 6 --------------------------------------------------------------
		System.out.println("PARTE 6 ");
		int lista1=0, lista2=0, valores=0,cont1=0,cont2=0;
		while (cont1<15){
			cont1=cont1+1;
			System.out.println("Introduce los valores de la lista 1");
			valores = teclado.nextInt();
			lista1 = lista1+valores;
		}
		contador = 0;
		while (cont2<15){
			cont2=cont2+1;
			System.out.println("Introduce los valores de la lista 2");
			valores = teclado.nextInt();
			lista2 = lista2+valores;
		}
		
		if (lista1>lista2){
			System.out.println("La lista 1 es mayor");
		}
		else {
			if (lista2>lista1) {
				System.out.println("La lista 2 es mayor");
			}
			else {
				System.out.println("Las listas son iguales");
			}
		}
		
		///Parte 7 --------------------------------------------------------------
		int enteros=0,pares=0,impares=0,contadorenteros=0, entero=0;
		System.out.println("PARTE 7 ");
		System.out.print("Introduce la cantida de numeros enteros que vas a cargar");
		enteros = teclado.nextInt();
		while (enteros>contadorenteros) {
			contadorenteros=contadorenteros+1;
			System.out.println("Introduce el entero: ");
			entero = teclado.nextInt();
			if (entero%2==0) {
				pares=pares+1;
			}
			else {
				impares=impares+1;
			}
		}
		System.out.println("La cantidad de pares que hay es "+pares);
		System.out.println("La cantidad de impares que hay es "+impares);
		
		System.out.println();
		
		
		
	}

}
