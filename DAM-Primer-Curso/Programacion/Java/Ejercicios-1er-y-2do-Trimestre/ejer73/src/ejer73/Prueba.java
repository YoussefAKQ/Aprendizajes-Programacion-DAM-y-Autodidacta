package ejer73;

public class Prueba {
	public static void main(String[] ar) {
		Suma suma1=new Suma();
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();
		System.out.println("El resultado es:");
		suma1.mostrarResultado();
		Resta resta1=new Resta();
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();
		System.out.println("El resultado de la resta es:");
		resta1.mostrarResultado();
		Multiplicacion multiplicacion1=new Multiplicacion();
		multiplicacion1.cargar1();
		multiplicacion1.cargar2();
		multiplicacion1.operar();
		System.out.println("El resultado de la multiplicación es:");
		multiplicacion1.mostrarResultado();
		Division Division1=new Division();
		Division1.cargar1();
		Division1.cargar2();
		Division1.Operar();
		System.out.println("El resultado de la división es:");
		Division1.mostrarResultado();
	}
}
