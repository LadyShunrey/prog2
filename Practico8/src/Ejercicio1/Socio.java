package Ejercicio1;

import java.util.ArrayList;

public class Socio implements Comparable<Socio>{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean cuotaPaga;
	private ArrayList<Alquiler> alquileresRealizados;
	
	public Socio(String nombre, String apellido, int edad, boolean cuotaPaga){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cuotaPaga = cuotaPaga;
		alquileresRealizados = new ArrayList<>();
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCuotaPaga() {
		return cuotaPaga;
	}

	public void setCuotaPaga(boolean cuotaPaga) {
		this.cuotaPaga = cuotaPaga;
	}

//	public ArrayList<Alquiler> getAlquileresRealizados() {
//		ArrayList<Alquiler> copiaDeListaAlquileres = new ArrayList<Alquiler>();
//		return copiaDeListaAlquileres;
//	}

	public void addAlquiler(Alquiler alquiler) {
		if (!alquileresRealizados.contains(alquiler)){
			alquileresRealizados.add(alquiler);
		}		
	}

	@Override
	public int compareTo(Socio socioOtro) {
		int result = this.getApellido().compareTo(socioOtro.getApellido());
		if(result == 0){
			result = this.getNombre().compareTo(socioOtro.getNombre());
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "El Socio apellido: " + apellido + " de nombre: " + nombre + " y de edad: " +edad+ " tiene su cuota: " + cuotaPaga + "\n";
	}
	
}
