package parcial2022;

import java.util.ArrayList;

public class Clasificador {
	//atributo
	ArrayList<String> palabras;
	Filtro filtro;

	//constructor
	public Clasificador(Filtro filtro, ArrayList<String> palabras){
		this.filtro = filtro;
		this.palabras = palabras;
	}
	
	//método
	public void clasificar(Noticia noticia){
		if(this.filtro.cumple(noticia)){
			for(String palabra: palabras){
				noticia.addPalabraClave(palabra);
			}
		}
	}
}
