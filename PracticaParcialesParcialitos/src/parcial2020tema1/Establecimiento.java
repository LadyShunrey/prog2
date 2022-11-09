package parcial2020tema1;

import java.util.ArrayList;

public class Establecimiento {
	private String nombre;
	private ArrayList<ElementoHospital> elementos;
	
	public Establecimiento(String nombre){
		this.nombre = nombre;
		elementos = new ArrayList<>();
	}
	
	public int contarCamas(){
		int cantidadCamas = 0;
		for(ElementoHospital elemento: elementos){
			cantidadCamas += elemento.contarCamas();
		}
		return cantidadCamas;
	}
	
	public ArrayList<Cama> camasDisponibles(){
		ArrayList<Cama> camasDisponibles = new ArrayList<>();
		for(ElementoHospital elemento: elementos){
			camasDisponibles.addAll(elemento.buscarCamasDisponibles());
		}
		return camasDisponibles;
	}
	
	public void asignarPaciente(Paciente paciente, Filtro filtro){
		ArrayList<Cama> camas = new ArrayList<>();
		camas.addAll(this.camasDisponibles());
		if(filtro.cumple(paciente)){
			for(Cama cama: camas){
				int contador = 0;
				if(paciente.getCamaAsignada() == false){
					ArrayList<String> auxiliar = new ArrayList<>();
					auxiliar.addAll(paciente.getEquipamientoNecesario());
					for(String equipo: auxiliar){
						if(cama.getEquipamiento().contains(equipo)){
							contador++;
							if(contador == auxiliar.size()){
								cama.setPaciente(paciente);
								cama.setDisponible(false);
								paciente.setCamaAsignada(true);
							}
						}
					}
				}
			}
		}
	}
	
	public ArrayList<ElementoHospital> copiaElementosSegunCondicion(Filtro filtro){
		ArrayList<ElementoHospital> copiaDeElemento = new ArrayList<>();
		//buscar entre las camas
		for(ElementoHospital elemento: elementos){
			//si la cama no esta disponible
			ArrayList<Cama> auxiliar = new ArrayList<>();
			auxiliar.addAll(elemento.buscarCamasOcupadas());
				//pedirle a la cama su paciente
				for(Cama cama: auxiliar){
					Paciente paciente = cama.getPaciente();
					//si paciente cumple condicion
					if(filtro.cumple(paciente)){
						//agregar cama a la lista
						copiaDeElemento.add(cama);
					}
											
				}

		}
		return copiaDeElemento;
	}
	
	public void addElemento(ElementoHospital elemento){
		if(!elementos.contains(elemento)){
			elementos.add(elemento);
		}
	}
}
