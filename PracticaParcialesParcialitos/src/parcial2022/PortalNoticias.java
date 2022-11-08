package parcial2022;

import java.util.ArrayList;

public class PortalNoticias {
	private String nombre;
	private ArrayList<ElementoPortal> elementos;
	private ArrayList<Clasificador> clasificadores;
	
	public PortalNoticias(String nombre){
		this.nombre = nombre;
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoPortal elemento){
		if(!elementos.contains(elemento)){
			elementos.add(elemento);
		}
	}
	
	public ArrayList<ElementoPortal> buscarNoticias(Filtro f1){
		ArrayList<ElementoPortal> noticiasQueCumplen = new ArrayList<>();
		for(ElementoPortal elemento: elementos){
			ArrayList<ElementoPortal> auxiliar = new ArrayList<>();
			auxiliar.addAll(elemento.buscarNoticiasPorFiltro(f1));
			for (ElementoPortal noticia: auxiliar){
				if(!noticiasQueCumplen.contains(noticia)){
					noticiasQueCumplen.add(noticia);
				}
			} 
		}
		return noticiasQueCumplen;
	}
}
