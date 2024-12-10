package ejer9;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
	    int num1, num2, num3, valor, valor2;
	    ///Parte 1 (No está bien) ----------------------------------------------------------
	    System.out.println("Introduce el primer numero: ");
	    num1 = teclado.nextInt();
	    System.out.println("Introduce el segundo numero: ");
	    num2 = teclado.nextInt();
	    System.out.println("Introduce el tercer numero: ");
	    num3 = teclado.nextInt();
	    
	    if (num1>num2) {
	    	if (num1>num3) {
	    		System.out.println("El primero es mayor");
	    	}
	    	else{
	    		System.out.println("El tercero es mayor");
	    	}
	    }
	    else {
	    	if (num2>num1) {
	    		if (num2>num3) {
	    			System.out.println("El segundo es mayor");
	    		}
	    		else {
	    			System.out.println("El tercero es mayor");
	    		}
	    	}
	    	else {
	    		System.out.println("El tercero es mayor");
	    	}
	    }
	   
	    
	  ///Parte 2 ---------------------------------------------------------------------------
	    System.out.println("Introduce el valor: ");
	    valor = teclado.nextInt();
	    if (valor==0) {
	    	System.out.println("El valor es nulo");
	    }
	    else {
	    	if (valor>0) {
	    		System.out.println("El valor es positivo");
	    	}
	    	else {
	    		System.out.println("El valor es negativo");
	    	}
	    }
	  ///Parte 3 ---------------------------------------------------------------------------
	    System.out.println("Introduce un valor positivo de hasta 3 cifras");
	    valor2 = teclado.nextInt();
	    if (valor2<10) {
	    	System.out.println("Es de una cifra");
	    }
	    else {
	    	if (valor2<100) {
	    		System.out.println("Es de dos cifras");
	    	}
	    	else {
	    		if (valor2<1000) {
	    			System.out.println("Es de tres cifras");
	    		}
	    		else {
	    			System.out.println("Error");
	    		}
	    	}
	    	
	    }
	  ///Parte 4 ---------------------------------------------------------------------------
	  ///Un postulante a un e && | 
	    
	    
	    
	}
	
	
	
	
	
	
}


