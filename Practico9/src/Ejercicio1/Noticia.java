package Ejercicio1;

import java.util.ArrayList;

public class Noticia extends ElementosDelSitio{
	private String titulo;
	private ArrayList<String> palabrasClave;
	private String intro;
	private String texto;
	private String autor;
	private String link;
	
	public Noticia(String titulo, String intro, String texto, String autor,
			String link) {
		this.titulo = titulo;
		this.intro = intro;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
		palabrasClave = new ArrayList<>();	
	}
	
	public int contarNoticias(){
		return 1;
	}
}
