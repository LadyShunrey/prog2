package recuperatorio2020;

import java.util.ArrayList;

public class Aseguradora {
	private String nombre;
	private ArrayList<ElementoSeguro> elementos;
	
	public Aseguradora(String nombre){
		this.nombre = nombre;
		elementos = new ArrayList<>();
	}
	
	public ArrayList<Seguro> buscarSeguros(Filtro filtro){
		ArrayList<Seguro> segurosEncontrados = new ArrayList<>();
		for(ElementoSeguro elemento: elementos){
			segurosEncontrados.addAll(elemento.buscarSeguros(filtro));
		}
		return segurosEncontrados;
	}
}
