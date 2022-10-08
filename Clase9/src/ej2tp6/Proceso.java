package ej2tp6;

public class Proceso implements ElementoCola {
	private String nombre;
	private double memoriaRequerida;
	
	public Proceso(String nombre, double memoriaRequerida) {
		this.nombre = nombre;
		this.memoriaRequerida = memoriaRequerida;
	}

	public String getNombre() {
		return nombre;
	}

	public double getMemoriaRequerida() {
		return memoriaRequerida;
	}

	
	
	@Override
	public boolean esMayor(ElementoCola otro) {
		return this.getMemoriaRequerida() > ((Proceso) otro).getMemoriaRequerida();
	}

	@Override
	public String toString() {
		return "Proceso [nombre=" + nombre + ", memoriaRequerida="
				+ memoriaRequerida + "]";
	}
	
	
}
