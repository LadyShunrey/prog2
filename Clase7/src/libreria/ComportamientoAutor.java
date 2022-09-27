package libreria;

public class ComportamientoAutor extends Comportamiento {

	@Override
	public boolean leGusta(Libro l1, Cliente c1) {
		return c1.leGustaAutor(l1.getAutor());
	}

}
