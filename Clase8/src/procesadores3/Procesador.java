package procesadores3;

public abstract class Procesador {
	
	ColaTareas tareas;
	
	
	//ORDENADO
	
	public Procesador(){
		tareas = new ColaTareasCPU();
		
	}
	
	public void ejecutarPrimera(){
		Tarea t1 = tareas.obtenerPrimera();
		if(t1!=null){
			t1.ejecutarTarea();
		}
		
	}
	
	
	public abstract boolean esMayor(Tarea t1, Tarea t2);
	
	//METODO TEMPLATE
	public void addTarea(Tarea t1) {
		tareas.agregarTarea(t1);
	}
	

	
	//NO USAR NUNCA EL METODO GETTAREAS DEL ARRAYLIST PORQUE ROMPE ENCAPSULAMIENTO
	
	public String toString(){
		return "Proc"+tareas.toString();
	}
	
	public void setComportamiento(ColaTareas nuevaForma){
		nuevaForma.vaciar();
		// tareas nueva forma
		while(tareas.getSize()>0){
			nuevaForma.agregarTarea(tareas.obtenerPrimera());
		}
		
		tareas = nuevaForma;
		
		//Acá está faltando re ordenar la lista! en procesadores3 lo resolvemos
	}
	
}
