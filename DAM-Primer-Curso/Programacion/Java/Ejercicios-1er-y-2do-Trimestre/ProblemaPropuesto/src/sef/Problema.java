package sef;

	import java.util.Scanner;

	public class Problema {

		public static void main (String[] args) {
			Scanner teclado = new Scanner(System.in);
			int lado, numero, producto, precio, cantidad, total;
			float promedio, suma;
			///Ejercicio 1-----------------------------------------------------------------
			System.out.print("Introduce el lado: ");
			lado=teclado.nextInt();
			suma=1;
			suma=lado*4;
			System.out.print("El perimetro es ");
			System.out.println(suma);
			///Ejercicio 2-----------------------------------------------------------------
			System.out.print("Introduce el primer valor: ");
			numero=teclado.nextInt();
			suma=0;
			suma= suma + numero;
			System.out.print("Introduce el segundo valor: ");
			numero=teclado.nextInt();
			suma = suma + numero;
			System.out.print("La suma de los 2 primeros valores es ");
			System.out.println(suma);
			System.out.print("Introduce el tercer valor: ");
			numero=teclado.nextInt();
			producto = 1 * numero;
			System.out.print("Introduce el cuarto valor: ");
			numero=teclado.nextInt();
			producto = producto * producto;
			System.out.print("El producto de los 2 ultimos valores es ");
			System.out.println(producto);
			///Ejercicio 3------------------------------------------------------------------
			suma = 0;
			System.out.print("Introduce el primer valor: ");
			numero = teclado.nextInt();
			suma = suma + numero;
			System.out.print("Introduce el segundo valor: ");
			numero = teclado.nextInt();
			suma = suma + numero;
			System.out.print("Introduce el tercer valor: ");
			numero = teclado.nextInt();
			suma = suma + numero;
			System.out.print("Introduce el cuarto valor: ");
			numero = teclado.nextInt();
			suma = suma + numero;
			System.out.print("La suma de todos los valores es ");
			System.out.println(suma);
			promedio = suma/4;
			System.out.print("El promedio de todos los valores es  ");
			System.out.println(promedio);
			///Ejercicio 4-------------------------------------------------------------------
			System.out.print("Introduce el precio del articulo: ");
			precio = teclado.nextInt();
			System.out.print("¿Cuantos articulos se va a llevar?: ");
			cantidad = teclado.nextInt();
			total = precio * cantidad;
			System.out.print("El total se queda en ");
			System.out.println(total);
			teclado.close();	
		}
		
	}

