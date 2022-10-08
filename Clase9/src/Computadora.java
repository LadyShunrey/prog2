//import java.util.ArrayList;


public class Computadora extends ElementoCola {
	private String nombre;
	//ArrayList<String> procesos;
	//private int memoria; 
	private double velocidadCPU;
	
	public Computadora(String nombre, double velocidadCPU) {
		super();
		this.nombre = nombre;
		this.velocidadCPU = velocidadCPU;
	}

	public String getNombre() {
		return nombre;
	}

	public double getVelocidadCPU() {
		return velocidadCPU;
	}

	@Override
	public String toString() {
		return "Computadora [nombre=" + nombre + ", velocidadCPU="
				+ velocidadCPU + "]";
	}
	 
	
}
