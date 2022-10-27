package Ejercicio1;

import java.util.ArrayList;

public class SitioWebDeNoticias {
	private ArrayList<Categoria> categorias;
	private ArrayList<Seccion> secciones;
	private ArrayList<Noticia> noticias;
	
	public SitioWebDeNoticias() {
		categorias = new ArrayList<>();
		secciones = new ArrayList<>();
		noticias = new ArrayList<>();
	}
	

	
	public void addCategoria (Categoria categoria){
		if(!categorias.contains(categoria)){
			categorias.add(categoria);
		}
	}
	
	public void addSeccion (Seccion seccion){
		if(!secciones.contains(seccion)){
			secciones.add(seccion);
		}
	}
	
	public void addNoticia (Noticia noticia){
		if(!noticias.contains(noticia)){
			noticias.add(noticia);
		}
	}
	
	
}
