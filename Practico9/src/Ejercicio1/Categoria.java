package Ejercicio1;

import java.util.ArrayList;

public class Categoria{
	private String descripcion;
	private String imagen;
	private ArrayList<ElementosDelSitio> elementos;
	
	public Categoria(String descripcion, String imagen){
		this.descripcion = descripcion;
		this.imagen = imagen;
		elementos = new ArrayList<>();
	}
	
	public int contarNoticias(){
		int resultado = 0;
		for(ElementosDelSitio elemento: elementos){
			resultado += elemento.contarNoticias();
		}
		return resultado;
		
	}
	
	public void addElemento(ElementosDelSitio elemento){
		if(!elementos.contains(elemento)){
			elementos.add(elemento);
		}
	}
}
