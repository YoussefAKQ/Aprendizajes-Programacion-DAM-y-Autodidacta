import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsultaVector {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int[] vec= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	
	try {
		System.out.println("Introduce un valor entre el 0 y el 9: ");
		int indice = teclado.nextInt();
		System.out.println("En el vector se almacena en la posicion "+indice +" el valor "+vec[indice]);
	}catch(InputMismatchException ex) {
		System.out.println("Introduce un numero entero");
	}catch(IndexOutOfBoundsException ex) {
		System.out.println("El valor debe estar entre el 0 y el 9");
	}
	}
}
