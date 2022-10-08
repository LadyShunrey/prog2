package personas;

import java.time.LocalDate;
import java.util.ArrayList;
import ej2tp6.ElementoCola;

public class Alumno extends Persona implements ElementoCola{
	private int legajo;
	private ArrayList<String> materiasAprobadas;
	
	public Alumno(String nombre, LocalDate nacimiento, int legajo) {
		super(nombre, nacimiento);
		this.legajo = legajo;
		this.materiasAprobadas = new ArrayList<>();
	}
	
	public int getLegajo(){
		return legajo;
	}
	
	public int cantMateriasAprobadas(){
		return materiasAprobadas.size();
	}
	
	public void agregarMateriaAprobada(String materia){
		materiasAprobadas.add(materia);
	}
	
	@Override
	public boolean esMayor(ElementoCola otro){
		return this.getLegajo() > ((Alumno)otro).getLegajo();
	}
	
}
