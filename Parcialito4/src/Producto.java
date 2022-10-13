

import java.util.ArrayList;

public class Producto {

	private String nombre;
	private String descripcion;
	private double precio;
	private ArrayList<String> componentes;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public boolean tieneComponente(String componente){
		return componentes.contains(componente);
	}

}
