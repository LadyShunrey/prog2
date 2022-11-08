package parcial2022;

import java.util.ArrayList;

public class Noticia extends ElementoPortal{
	private String contenido;
	private String titulo;
	private String autor;
	private String categoria;
	private ArrayList<String> palabrasClaves;
	
	public Noticia(String contenido, String titulo, String autor, String categoria){
		this.contenido = contenido;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		palabrasClaves = new ArrayList<>();
	}
	
	public ArrayList<String> getPalabrasClaves(){
		ArrayList<String> copiaPalabrasClaves = new ArrayList<>();
		for(String palabraClave: palabrasClaves){
			if(!copiaPalabrasClaves.contains(palabraClave)){
				copiaPalabrasClaves.add(palabraClave);
			}
		}
		return copiaPalabrasClaves;
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public String getContenido(){
		return contenido;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public void addPalabraClave(String palabra){
		if(!palabrasClaves.contains(palabra)){
			palabrasClaves.add(palabra);
		}
	}
	
	@Override
	public ArrayList<Noticia> buscarNoticiasPorFiltro(Filtro f1){
		ArrayList<Noticia> noticiasQueCumplen = new ArrayList<>();
		if(f1.cumple(this)){
			if(!noticiasQueCumplen.contains(this)){
				noticiasQueCumplen.add(this);
			}
		}
		return noticiasQueCumplen;
	}
	
	public String toString(){
		return "La noticia " + titulo + " con contenido " + contenido + " La categoria: " + categoria + " y su autor: " + autor + "\n";
	}
	
	public void agregarPalabraClave(){
		if(contenido.contains("futbol")){
			this.addPalabraClave("deportes");	
		}
		if(contenido.contains("iphone") || contenido.contains("android")){
			this.addPalabraClave("moviles");
		}
		if(titulo.contains("heridos")){
			this.addPalabraClave("policiales");
			this.addPalabraClave("urgentes");
		}
	}
}
