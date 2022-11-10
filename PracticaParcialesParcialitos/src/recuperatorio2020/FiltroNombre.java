package recuperatorio2020;

public class FiltroNombre extends Filtro {
	private String nombre;
	
	public FiltroNombre(String nombre){
		this.nombre = nombre;
	}
	
	public boolean cumple(Seguro seguro){
		return seguro.getDescripcion().equals(nombre);
	}
}
