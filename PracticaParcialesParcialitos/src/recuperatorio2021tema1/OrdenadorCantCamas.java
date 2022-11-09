package recuperatorio2021tema1;

public class OrdenadorCantCamas extends Ordenador {
	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		return h1.getCantidadCamas() - h2.getCantidadCamas();
	}
}
