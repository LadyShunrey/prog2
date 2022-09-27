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
	
	//METODO TEMPLATE
	public abstract boolean esMayor(Tarea t1, Tarea t2);
	
	public void addTarea(Tarea t1) {
		
		boolean encontro = false;
		int i = 0;
		while(!encontro && i<tareas.size()){
			if(this.esMayor(t1,tareas.get(i))){
				encontro = true;
				tareas.add(i,t1);
			}
			i++;
		}
		if(!encontro){
			tareas.add(i,t1);
		}

	}
	
	
	
	//NO USAR NUNCA EL METODO GETTAREAS DEL ARRAYLIST PORQUE ROMPE ENCAPSULAMIENTO
	
	public String toString(){
		return "Proc"+tareas.toString();
	}
}
