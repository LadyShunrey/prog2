package clase5.otrosEjemplos;

public class MainPersona {

	public static void main(String[] args) {
		Persona jj = new Persona ("jj", "López");
		Persona jj2 = new Persona ("jj", "Perez");
		Persona jj3 = new Persona ("jj", "López");
		Persona jj4 = new Persona ("jj", "Perez");
		
		System.out.println(jj.getId());
		System.out.println(jj2.getId());
		System.out.println(jj3.getId());
		System.out.println(jj4.getId());
		/*System.out.println(jj4.getContador()); //El warning es porque estoy mandando un metodo de clase a una instancia
		System.out.println(jj.getContador());*/
		System.out.println(Persona.getContador());
		
		System.out.println(Persona.MAYORIAEDAD);
		System.out.println(Persona.ESPECIE);
		
		
	}

}
