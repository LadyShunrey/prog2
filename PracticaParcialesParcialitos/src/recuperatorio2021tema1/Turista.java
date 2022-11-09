package recuperatorio2021tema1;

public class Turista {
	private String nombre;
	private int edad;
	private String ciudad;
	private Habitacion habitacionDesignada;
	
	public Turista(String nombre, int edad, String ciudad, Habitacion habitacion){
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		habitacionDesignada = habitacion;
	}
	
	
}
