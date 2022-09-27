package libreria;

public class ClienteExigente extends Cliente {

	public ClienteExigente(String nombre, String apellido, String direccion, long dni) {
		super(nombre, apellido, direccion, dni);
	}
	
	public boolean leGusta(Libro l1){
		if(super.leGusta(l1)){
			return generosFavoritos.contains(l1.getGeneroLiterario());
		}
		else{
			return false;
		}
	}
}
