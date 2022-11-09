package parcial2020tema1;

import java.util.ArrayList;

public class Cama extends ElementoHospital {
	private int nroCama;
	private ArrayList<String> equipamiento;
	private boolean disponible;
	private Paciente paciente;
	
	public Cama (int nroCama, boolean disponible, Paciente paciente){
		this.disponible = disponible;
		this.paciente = paciente;
		this.nroCama = nroCama;
		equipamiento = new ArrayList<>();
	}
	
	public int contarCamas(){
		return 1;
	}
	
	public ArrayList<Cama> buscarCamasDisponibles(){
		ArrayList<Cama> camasDisponibles = new ArrayList<>();
		
		if(disponible == true){
			camasDisponibles.add(this);
		}
		
		return camasDisponibles;
	}
	
	public ArrayList<Cama> buscarCamasOcupadas(){
		ArrayList<Cama> camasOcupadas = new ArrayList<>();
		
		if(disponible == false){
			camasOcupadas.add(this);
		}
		
		return camasOcupadas;
	}
	
	public ArrayList<String> getEquipamiento(){
		ArrayList<String> copiaDeEquipamiento = new ArrayList<>();
		copiaDeEquipamiento.addAll(equipamiento);
		return copiaDeEquipamiento;
	}
	
	public boolean getDisponible(){
		return disponible;
	}
	
	public void setDisponible(boolean disponibilidad){
		disponible = disponibilidad;
	}
	
	public Paciente getPaciente(){
		return paciente;
	}
	
	public void setPaciente(Paciente paciente){
		if(disponible == true){
			this.paciente = paciente;
		}
	}
	
	public void addEquipamiento(String equipo){
		equipamiento.add(equipo);
	}
	
	public String toString(){
		return "Esta es la cama " + nroCama;
	}
}
