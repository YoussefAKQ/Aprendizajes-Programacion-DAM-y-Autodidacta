public class PersonaAdulta {
	private String nombre;
	private int edad;
	
	public PersonaAdulta(String nombre, int edad) throws Exception {
		
		this.nombre = nombre;
		if (edad<18) {
			throw new Exception("La persona "+" no es adulta porque tiene "+edad+ " años");
		}
		this.edad = edad;
	}
	
	public void fijarEdad(int edad) throws Exception{
		if (edad<18) {
			throw new Exception("La persona "+nombre+" no es adulta porque tiene "+edad+" años");
		}
		this.edad=edad;
	}
	
	public void Imprimir() {
		System.out.println(nombre+" - "+edad);
	}
	
	public static void main(String[] args) {
		try {
			PersonaAdulta persona1 = new PersonaAdulta("Juan",14);
			persona1.Imprimir();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			PersonaAdulta persona2 = new PersonaAdulta("Jorge",124);
			persona2.Imprimir();
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
}
