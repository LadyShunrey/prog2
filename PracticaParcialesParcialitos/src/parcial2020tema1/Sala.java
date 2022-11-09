package parcial2020tema1;

import java.util.ArrayList;

public class Sala extends ElementoHospital {
	private ArrayList<ElementoHospital> elementos;
	
	public Sala(){
		elementos = new ArrayList<>();
	}
	
	public int contarCamas(){
		int cantidadCamas = 0;
		for(ElementoHospital elemento: elementos){
			cantidadCamas += elemento.contarCamas();
		}
		return cantidadCamas;
	}
	
	public ArrayList<Cama> buscarCamasDisponibles(){
		ArrayList<Cama> camasDisponibles = new ArrayList<>();
		for(ElementoHospital elemento: elementos){
			ArrayList<Cama> auxiliar = new ArrayList<>();
			auxiliar.addAll(elemento.buscarCamasDisponibles());
			for(Cama cama: auxiliar){
				if(!camasDisponibles.contains(cama)){
					camasDisponibles.add(cama);
				}
			}
		}
		return camasDisponibles;
	}
	
	public ArrayList<Cama> buscarCamasOcupadas(){
		ArrayList<Cama> camasOcupadas = new ArrayList<>();
		for(ElementoHospital elemento: elementos){
			ArrayList<Cama> auxiliar = new ArrayList<>();
			auxiliar.addAll(elemento.buscarCamasOcupadas());
			for(Cama cama: auxiliar){
				if(!camasOcupadas.contains(cama)){
					camasOcupadas.add(cama);
				}
			}
		}
		return camasOcupadas;
	}
	
	public void addElemento(ElementoHospital elemento){
		if(!elementos.contains(elemento)){
			elementos.add(elemento);
		}
	}
}
