package clase5.otrosEjemplos;

public class Persona {
	
	//Atributos de INSTANCIA porque estan en el objeto
	private String nombre;
	private String apellido;
	private int id;
	
	//ATRIBUTO DE LA CLASE
	private static int contador = 0;
	
	//Mayoría de edad
	public static final int MAYORIAEDAD = 18;
	public static final String ESPECIE = "Humano";
	
	public Persona(){
		nombre = "n";
		apellido = "a";
		id = contador;
		contador ++;
	}
	
	public Persona(String apellido, String nombre){
		this.nombre = nombre;
		this.apellido = apellido;
		id = contador;
		contador ++;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	
	//METODO DE CLASE PORQUE DICE STATIC
	public static int getContador(){
		//LO UNICO CON LO QUE TENGO QUE TENER CUIDADO
		//UN METODO DE CLASE PUEDE CREAR VARIABLES PUEDE
		//HACER TODO LO DE UN METODO PERO NO PUEDE ACCEDER A VARUABKES DE INSTANCIA SI A VARIABLES DE CALSE
		return contador;
	}
}
