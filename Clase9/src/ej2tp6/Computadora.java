package ej2tp6;
//import java.util.ArrayList;


public class Computadora implements ElementoCola {
	private String nombre; 
	private double velocidadCPU;
	private Proceso proc;
	
	public Computadora(String nombre, double velocidadCPU) {
		super();
		this.nombre = nombre;
		this.velocidadCPU = velocidadCPU;
		proc = null;
	}

	public String getNombre() {
		return nombre;
	}

	public double getVelocidadCPU() {
		return velocidadCPU;
	}
	
	public void ejecutarProceso(Proceso p){
		this.proc = p;
	}
	
	@Override
	public boolean esMayor(ElementoCola otro) {
		return this.getVelocidadCPU() > ((Computadora) otro).getVelocidadCPU();
	}

	@Override
	public String toString() {
		return "Computadora [nombre=" + nombre + ", velocidadCPU="
				+ velocidadCPU + "]";
	}
	 
	
}
