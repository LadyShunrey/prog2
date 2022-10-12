package clasesistemadearchivos;

//import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta extends ElementoFS{
	
	private ArrayList<ElementoFS> elementos;
	
	public Carpeta(String nombre) {
		super(nombre);
		elementos = new ArrayList<>();
	}
	
	public int cantArchivos(){
		//return elementos.size(); //retorna la cantidad de hijos directos no de archivos, 
								 //sino de todos los elementos tanto archivos como carpetas
		int total =0;
		for(ElementoFS elemento:elementos){
			total+=elemento.cantArchivos();
		}
		return total;
	}
	
	public double getTamanio(){
		double total = 0.0;
		for (ElementoFS elemento:elementos){
			total+=elemento.getTamanio();
		}
		return total;
	}

}
