package libreria;

public class ComportamientoGenero extends Comportamiento {

	@Override
	public boolean leGusta(Libro l1, Cliente c1) {
		
		return c1.leGustaGenero(l1.getGeneroLiterario());
	}

}
