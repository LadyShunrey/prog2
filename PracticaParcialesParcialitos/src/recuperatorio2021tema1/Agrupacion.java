package recuperatorio2021tema1;

import java.util.ArrayList;

public class Agrupacion extends ElementoHotel {
	private ArrayList<ElementoHotel> elementos;
	
	public Agrupacion(){
		elementos = new ArrayList<>();
	}
	
	@Override
	public int totalHabitacionesCondicion(Filtro filtro){
		int totalHabitaciones = 0;
		for(ElementoHotel elemento: elementos){
			totalHabitaciones += elemento.totalHabitacionesCondicion(filtro);
		}
		return totalHabitaciones;
	}
	
	public ArrayList<Habitacion> buscarHabitacionFiltro(Filtro filtro){
		ArrayList<Habitacion> habitacionesQueCumplen = new ArrayList<>();
		for (ElementoHotel elemento: elementos){
			habitacionesQueCumplen.addAll(elemento.buscarHabitacionFiltro(filtro));
		}
		return habitacionesQueCumplen;
	}
	
	@Override
	public ArrayList<Habitacion> getHabitacionesDisponibles(){
		ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
		return habitacionesDisponibles;
	}
	
	@Override
	public double getDimensionTotal(){
		double dimensionTotal = 0.0;
		for(ElementoHotel elemento: elementos){
			dimensionTotal += elemento.getDimensionTotal();
		}
		return dimensionTotal;
	}
	
	public void addElemento(ElementoHotel elemento){
		if(!elementos.contains(elemento)){
			elementos.add(elemento);	
		}
	}
}
