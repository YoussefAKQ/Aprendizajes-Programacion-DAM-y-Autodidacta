
public class Excepcion6 {
	private int valor1, valor2, resultado;
	
	public Excepcion6(int valor1, int valor2) {
		this.valor1 = valor1;	
		this.valor2 = valor2;
		System.out.println("algo");
	}
	
	public void Sumar() {
		this.resultado = valor1+valor2;
		System.out.println(resultado);
	}
	
	public void Resta() {
		this.resultado = valor1-valor2;
		System.out.println(resultado);
	}
	
	public void Multi() {
		this.resultado = valor1*valor2;
		System.out.println(resultado);
	}
	
	public void Divi(){
		this.resultado = valor1/valor2;
		System.out.println(resultado);
	}
	
	public static void main(String[] args) throws Exception {
		Excepcion6 e = new Excepcion6(4,0);
		e.Sumar();
		e.Resta();
		e.Multi();
		try {
			e.Divi();
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
