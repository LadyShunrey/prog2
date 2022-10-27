package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;


public class Club{
	private ArrayList<Socio> socios;
	private ArrayList<Alquiler> alquileres;
	
	public Club(){
		socios = new ArrayList<>();
		alquileres = new ArrayList<>();
	}
	
	public ArrayList<Socio> obtenerSociosCuotaImpaga(){
			
		ArrayList<Socio> sociosCuotaImpaga = new ArrayList<>();
		
		for(Socio socio: socios){
			if(socio.isCuotaPaga()==false){
				if(!sociosCuotaImpaga.contains(socio)){
					sociosCuotaImpaga.add(socio);
				}
			}
		}
		Collections.sort(sociosCuotaImpaga);
		
		return sociosCuotaImpaga;
		
	}
	
	public ArrayList<Socio> obtenerTodosLosSocios(){
		ArrayList<Socio> todosLosSocios = new ArrayList<>();
		for(Socio socio: socios){
			todosLosSocios.add(socio);
		}
		
		return todosLosSocios;
	}
	
	public ArrayList<Socio> obtenerMenores(Filtro f, Comparador c){
		ArrayList<Socio> todosLosMenores = new ArrayList<>();
		for(Socio socio: socios){
			if(f.cumpleCondicion(socio)){
				todosLosMenores.add(socio);
			}
		}
		
		//ordenarlos por edad
		Collections.sort(todosLosMenores, c);
		return todosLosMenores;
	}
	
	public void addSocio(Socio nuevoSocio){
		if(!socios.contains(nuevoSocio)){
			socios.add(nuevoSocio);
		}
	}
	
	public void addAlquiler(Alquiler nuevoAlquiler){
		if(!alquileres.contains(nuevoAlquiler)){
			alquileres.add(nuevoAlquiler);
		}
	}

		
}
