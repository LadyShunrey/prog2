
public class Proceso extends ElementoCola {
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
	public String toString() {
		return "Proceso [nombre=" + nombre + ", memoriaRequerida="
				+ memoriaRequerida + "]";
	}
	
	
}
