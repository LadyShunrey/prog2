package procesadores;

import java.util.ArrayList;

public abstract class Procesador {
	
	protected ArrayList<Tarea> tareas; //acá  este procesador tiene una colección de todas las tareas que estan encoladas en él
	//ORDENADO
	
	public Procesador(){
		tareas = new ArrayList<Tarea>();
	}
	
	public void ejecutarPrimera(){
		if(tareas.size()>0){
			Tarea t1 = tareas.get(0);
			t1.ejecutarTarea();
			tareas.remove(0);
		}
	}
	
	public abstract void addTarea(Tarea t1);
	
	
	
	//NO USAR NUNCA EL METODO GETTAREAS DEL ARRAYLIST PORQUE ROMPE ENCAPSULAMIENTO
	
	public String toString(){
		return "Proc"+tareas.toString();
	}
}
