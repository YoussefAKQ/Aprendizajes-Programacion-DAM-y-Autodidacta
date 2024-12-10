package ejer13;

import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		///Parte1
		int fecha, fechanavidad, num1, num2, num3, suma, multi, coord, sueldo, antiguedad, nuevosueldo, aumento, mayor, menor;
		System.out.println("Parte 1");
		fechanavidad = 25122024;
		System.out.println("Introduce la fecha (Ejemplo: 01022000)");
		fecha = teclado.nextInt();
		if (fecha==fechanavidad) {
			System.out.println("Es navidad");
		}
		///Parte2 
		///Se introducen tres valores por teclado si todos son iguales se imprime la suma
		///del primero con el segundo ya este resultado lo multiplicas por el tercero
		System.out.println("Parte 2");
		System.out.println("Introduce el primer valor: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo valor: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer valor: ");
		num3 = teclado.nextInt();
		
		if (num1==num2&&num1==num3) {
			suma = num1 + num2;
			multi = suma * num3;
			System.out.println("El resultado es ");
			System.out.println(multi);
		}
		else {
			System.out.println("Los 3 no son iguales");
		}
		///Parte3
		///Se introducen por teclado tres numeros, si todos los valores ingresados son menores
		///a 10, impriimir en pantalla la leyenda "Todos los numeros son menores a 10"
		System.out.println("Parte 3");
		System.out.println("Introduce el primer valor: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo valor: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer valor: ");
		num3 = teclado.nextInt();
		
		if (num1<10&&num2<10&&num3<10) {
			System.out.println("Todos los numeros son menores a 10");
		}
		else {
			System.out.println("No todos son menores a 10");
		}
		///Parte 4
		///Se introducen por teclado 3 numeros, si al menos uno de los valores ingresados es 
		///menor a 10 imprimir en pantalla "Alguno de los valores es menor a 10"
		System.out.println("Parte 4");
		System.out.println("Introduce el primer valor: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo valor: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer valor: ");
		num3 = teclado.nextInt();
		
		if (num1<10|num2<10|num3<10) {
			System.out.println("Alguno de los valores menor a 10");
		}
		else {
			System.out.println("No hay ningun valor menor a 10");
		}
		///Parte 5----------------------------------------------------------------------
		System.out.println("Parte 5");
		System.out.println("Introduce X: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce Y: ");
		num2 = teclado.nextInt();
		if (num1<0&&num2>0) {
		System.out.println("Está en el primer cuadrante");
		}
		else {
			
		if (num1>0&&num2>0) {
		System.out.println("Está en el segundo cuadrante");
		}
		else {
			if (num1<0&&num2<0) {
				System.out.println("Está en el tercer cuadrante");
				}
			else {
				System.out.println("Está en el cuarto cuadrante");
			}
		}
		}
		///Parte 6----------------------------------------------------------------------
		System.out.println("Parte 6");
		System.out.println("Introduce el sueldo: ");
		sueldo = teclado.nextInt();
		System.out.println("Introduce los años de antiguedad: ");
		antiguedad = teclado.nextInt();
		if (sueldo<500&&antiguedad>10){
			System.out.println("El sueldo se queda en");
			aumento = (sueldo*20)/100;
			nuevosueldo = sueldo + aumento;
			System.out.println("El nuevo sueldo se queda en: ");
			System.out.println(nuevosueldo);
		}
		else {
			if (sueldo<500&&antiguedad<10){
				System.out.println("El sueldo se queda en");
				aumento = (sueldo*5)/100;
				nuevosueldo = sueldo + aumento;
				System.out.println("El nuevo sueldo se queda en: ");
				System.out.println(nuevosueldo);
			}
			else {
				System.out.println("El sueldo se queda igual, En: ");
				System.out.println(sueldo);			}
		}
		///Parte 7----------------------------------------------------------------------
		System.out.println("Parte 7");
		System.out.println("Introduce el primer valor: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo valor: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer valor: ");
		num3 = teclado.nextInt();
		
		mayor=0;
		
		if (num1>num2&&num1>num3) {
			mayor = num1;
		}
		else {
			if (num1>num2&&num1<num3) {
				mayor = num3;
			}
			else{
				if (num1>num3&&num1<num2) {
					mayor = num2;
				}
				else {
					if (num2>num3) {
						mayor = num2;
					}
					else {
						mayor = num3;
					}
				}
				
			}
		}
		System.out.println("El mayor es: ");
		System.out.println(mayor);
		
		menor=0;
		
		if (num1<num2&&num1<num3) {
			menor = num1;
		}
		else {
			if (num1<num2&&num1>num3) {
				menor = num3;
			}
			else{
				if (num1<num3&&num1>num2) {
					menor = num2;
				}
				else {
					if (num2<num3) {
						menor = num2;
					}
					else {
						menor = num3;
					}
				}
				
			}
		}
		System.out.println("El menor es: ");
		System.out.println(menor);
		
		
	}
}
