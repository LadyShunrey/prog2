package Ejercicio1;

import java.util.ArrayList;

public class Seccion extends ElementosDelSitio {
	private String descripcion;
	private String imagen;
	private ArrayList<ElementosDelSitio> elementos;
	
	public Seccion(String descripcion, String imagen){
		this.descripcion = descripcion;
		this.imagen = imagen;
		elementos = new ArrayList<>();
	}

	@Override
	public int contarNoticias() {
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
