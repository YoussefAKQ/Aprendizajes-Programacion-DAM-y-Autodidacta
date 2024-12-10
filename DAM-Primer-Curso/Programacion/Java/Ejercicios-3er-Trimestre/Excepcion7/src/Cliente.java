
public final class Cliente {
	private String nombre;
	private int saldo = 0;
	private int sacar = 0;
	
	public Cliente(int saldo, String nombre, int sacar){
		this.saldo = saldo;
		this.nombre = nombre;
		this.sacar = sacar;
	}
	
	public void Depositar() {
		System.out.println("La cantidad de "+saldo+" ha sido depositada correctamente.");
		
	}
	
	public void Extraer() throws Exception{		///SIEMPRE QUE HAGAMOS UNA EXCEPCIÓN HAY QUE LLAMAR A ESTE, throws exception
		if (sacar>saldo) {
			throw new Exception("No puede realizar esta operación debido a que quiere sacar "+sacar+" y tiene "+saldo+" en la cuenta");	///Tiene que poner throw delante
		}else {
			System.out.println("La operación se ha realizado correctamente, sacando "+sacar);
			saldo = saldo - sacar;
		}
	}
	
	public void Imprimir() {
		System.out.println("La cuenta perteneciente a "+nombre);
		System.out.println("El saldo de su cuenta es de "+saldo);
	}
	
	public static void main(String[] args) throws Exception{
		Cliente cli = new Cliente(150, "Jose", 101000);
		cli.Depositar();
		try {
			cli.Extraer();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		cli.Imprimir();
	}
}
