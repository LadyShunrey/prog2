package ejerciciofarmacia;

import java.util.ArrayList;

//cada medicamento guarda: nombre, laboratorio, precio, conjunto de sintomas que trata

public class Medicamento {
	private String nombre;
	private String laboratorio;
	private double precio;
	private ArrayList<String> sintomasQueTrata;
	
	public Medicamento(String nombre, String laboratorio, double precio) {
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.precio = precio;
		this.sintomasQueTrata = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void addSintoma(String sintoma){
		this.sintomasQueTrata.add(sintoma);
	}

	public ArrayList<String> getSintomasQueTrata() {
		ArrayList<String> aux = new ArrayList<>();
		aux = sintomasQueTrata;
		return aux;
	}
	
	@Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", precio=" + precio +
                '}'+"\n";
    }
	
}
