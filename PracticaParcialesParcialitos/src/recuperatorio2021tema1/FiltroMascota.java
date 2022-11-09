package recuperatorio2021tema1;

public class FiltroMascota extends Filtro {
	private boolean acepta;
	
	public FiltroMascota(boolean acepta){
		this.acepta = acepta;
	}

	@Override
	public boolean cumple(Habitacion habitacion) {
		return habitacion.getAceptaMascota() == acepta;
	}

}
