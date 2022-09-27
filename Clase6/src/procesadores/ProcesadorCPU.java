package procesadores;

public class ProcesadorCPU extends Procesador {

	@Override
	public void addTarea(Tarea t1) {
		
		boolean encontro = false;
		int i = 0;
		while(!encontro && i<tareas.size()){
			if(t1.getCpu() > tareas.get(i).getCpu()){
				encontro = true;
				tareas.add(i,t1);
			}
			i++;
		}
		if(!encontro){
			tareas.add(i);
		}

	}

}
