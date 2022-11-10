package recuperatorio2021tema1;

import java.util.ArrayList;
import java.util.Collections;

public class CadenaHotelera {
	private String nombre;
	private ArrayList<ElementoHotel> elementos;
	
	public CadenaHotelera(String nombre){
		this.nombre = nombre;
		elementos = new ArrayList<>();
	}
	
	public int totalHabitacionesCondicion(Filtro filtro){
		int totalHabitaciones = 0;
		for(ElementoHotel elemento: elementos){
			totalHabitaciones = elemento.totalHabitacionesCondicion(filtro);
		}
		return totalHabitaciones;
	}
	
	public ArrayList<Habitacion> getHabitacionesDisponibles(){
		ArrayList<Habitacion> camasDisponibles = new ArrayList<>();
		for(ElementoHotel elemento: elementos){
			camasDisponibles.addAll(elemento.getHabitacionesDisponibles());
		}
		return camasDisponibles;
	}
	
	public ArrayList<Habitacion> buscarHabitacionFiltro(Filtro filtro, Ordenador ordenador){
		ArrayList<Habitacion> lasQueCumplen = new ArrayList<>();
		for(ElementoHotel elemento: elementos){
			lasQueCumplen.addAll(elemento.buscarHabitacionFiltro(filtro));
		}
		if (ordenador!=null)
		 Collections.sort(lasQueCumplen, ordenador);
		return lasQueCumplen;	
	}
	
	public double getDimensionTotal(){
		double dimensionTotal = 0.0;
		for(ElementoHotel elemento: elementos){
			dimensionTotal += elemento.getDimensionTotal();
		}
		return dimensionTotal;
	}
	
	public void asignarTurista(Turista turista, Filtro filtro){
		//recorre habitaciones
		//si la habitacion cumple
		//asigno turista
	}
	
	public void addElemento(ElementoHotel elemento){
		if(!elementos.contains(elemento)){
			elementos.add(elemento);	
		}
	}
}
