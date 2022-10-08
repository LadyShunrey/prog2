package ej2tp6;
import java.util.ArrayList;


public class ColaEspera {
	private ArrayList<ElementoCola> elementos;
	
	
	
	public ColaEspera() {
		elementos = new ArrayList<>();
	}

	public void addElemento(ElementoCola elemento){
		boolean inserto = false;
		int i = 0;
		while (!inserto && i<elementos.size()){
			//se fije la velocidad e inserte
			if ( elemento.esMayor(elementos.get(i)) ){
				elementos.add(i, elemento);
				inserto = true;
			}
			i++;
		}
		if (!inserto){
			elementos.add(elemento);
		}
	}
	
	public ElementoCola getSiguiente(){
		if(this.tieneElementos()){
			return elementos.remove(0);
		}
		else{
			return null;
		}
	}
	
	public boolean tieneElementos(){
		return !elementos.isEmpty();
	}
	
}
