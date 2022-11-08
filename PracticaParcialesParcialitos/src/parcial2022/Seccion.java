package parcial2022;

import java.util.ArrayList;

public class Seccion extends ElementoPortal {
	private ArrayList<ElementoPortal> elementos;
	private String categoria;
	private int posicion; //4 o 5 depende de si creo una seccion o un grupo
	private String error; //"Sin Definir"
	private ArrayList<String> palabrasClaves;
	
	public Seccion (int posicion, String error){
		this.posicion = posicion;
		this.error = error;
		elementos = new ArrayList<>();
		palabrasClaves = new ArrayList<>();
	}
	
	public String getCategoria(){ 
		if(elementos.size()>posicion && elementos.get(posicion) != null){
			categoria = elementos.get(posicion).getCategoria();
			return categoria;
		}
		return error;
	}
	
	public ArrayList<String> getPalabrasClaves(){
		ArrayList<String> encontrarPalabrasClaves = new ArrayList<>();
		for(ElementoPortal elemento: this.elementos){
			ArrayList<String> auxiliar = new ArrayList<>();
			auxiliar.addAll(elemento.getPalabrasClaves());
			for(String palabraClave: auxiliar){
				if(!encontrarPalabrasClaves.contains(palabraClave)){
					encontrarPalabrasClaves.add(palabraClave);
				}
			}
		}
		return encontrarPalabrasClaves;
	}
	
	public void addElemento(ElementoPortal elemento){
		if(!elementos.contains(elemento)){
			elementos.add(elemento);
		}
	}
	
	@Override
	public ArrayList<Noticia> buscarNoticiasPorFiltro(Filtro f1){
		ArrayList<Noticia> noticiasQueCumplen = new ArrayList<>();
		for(ElementoPortal elemento: elementos){
			noticiasQueCumplen.addAll(elemento.buscarNoticiasPorFiltro(f1));
		}
		return noticiasQueCumplen;
	}
}
