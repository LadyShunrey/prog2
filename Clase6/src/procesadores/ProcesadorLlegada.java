package procesadores;

public class ProcesadorLlegada extends Procesador {

	@Override
	public void addTarea(Tarea t1){
		tareas.add(t1);
	}
	
	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		
		return false;
	}

	
}
