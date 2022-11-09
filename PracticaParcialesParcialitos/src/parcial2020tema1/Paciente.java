package parcial2020tema1;

import java.util.ArrayList;

public class Paciente {
	
	private String nombre;
	private int edad;
	private ArrayList<String> sintomas;
	private ArrayList<String> equipamientoNecesario;
	private boolean camaAsignada;
	
	public Paciente (String nombre, int edad, boolean camaAsignada){
		this.nombre = nombre;
		this.edad = edad;
		this.camaAsignada = camaAsignada;
		sintomas = new ArrayList<>();
		equipamientoNecesario = new ArrayList<>();
	}
	
	public ArrayList<String> getEquipamientoNecesario(){
		ArrayList<String> copiaDeEquipamiento = new ArrayList<>();
		copiaDeEquipamiento.addAll(equipamientoNecesario);
		return copiaDeEquipamiento;
	}
	
	public ArrayList<String> getSintomas(){
		ArrayList<String> copiaDeSintomas = new ArrayList<>();
		copiaDeSintomas.addAll(sintomas);
		return copiaDeSintomas;
	}
	
	public void addEquipamientoNecesario(String equipo){
		equipamientoNecesario.add(equipo);
	}
	
	public int getEdad(){
		return edad;
	}
	
	public boolean getCamaAsignada(){
		return camaAsignada;
	}
	
	public void setCamaAsignada(boolean asignado){
		camaAsignada = asignado;
	}
	
	public String toString(){
		return "El paciente " + nombre;
	}

}
