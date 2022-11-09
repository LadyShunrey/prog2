package recuperatorio2021tema1;

import java.util.ArrayList;
import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;

public class Habitacion extends ElementoHotel {
	private int nroHabitacion;
	private ArrayList<String> comodidades;
	private ArrayList<Turista> turistas;
	private double metros;
	private int cantidadCamas;
	private LocalDate fechaUltima;
	private boolean aceptaMascota;

	public Habitacion(int nro, double metros, int cant, LocalDate ultima, boolean acepta){
		this.metros = metros;
		nroHabitacion = nro;
		cantidadCamas = cant;
		fechaUltima = ultima;
		aceptaMascota = acepta;
		comodidades = new ArrayList<>();
		turistas = new ArrayList<>();
	}
	
	public double getMetros(){
		return metros;
	}
	
	public ArrayList<String> getComodidades(){
		ArrayList<String>copiaComodidades = new ArrayList<>();
		copiaComodidades.addAll(comodidades);
		return copiaComodidades;
	}
	
	public ArrayList<Habitacion> buscarHabitacionFiltro(Filtro filtro){
		ArrayList<Habitacion> habitacionesQueCumplen = new ArrayList<>();
		if (filtro.cumple(this)){
			habitacionesQueCumplen.add(this);
		}
		return habitacionesQueCumplen;
	}
	
	@Override
	public int totalHabitacionesCondicion(Filtro filtro) {
		if(filtro.cumple(this)){
			return 1;
		}
		return 0;
	}
	
	@Override
	public ArrayList<Habitacion> getHabitacionesDisponibles(){
		ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
		if(turistas == null){
			habitacionesDisponibles.add(this);
		}
		return habitacionesDisponibles;
	}
	
	@Override
	public double getDimensionTotal(){
		double dimension;
		dimension = this.getMetros();
		return dimension;
	}
	
	public boolean getAceptaMascota(){
		return aceptaMascota;
	}
	
	public int getCantidadCamas(){
		return cantidadCamas;
	}
	
	public void addComodidad(String comodidad){
		comodidades.add(comodidad);
	}
	
	public String toString(){
		return "Habitacion nro " + nroHabitacion + "\n";
	}
}
