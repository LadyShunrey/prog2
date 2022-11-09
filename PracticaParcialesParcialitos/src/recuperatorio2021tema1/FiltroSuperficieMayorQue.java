package recuperatorio2021tema1;

public class FiltroSuperficieMayorQue extends Filtro {
	private double metros;
	
	public FiltroSuperficieMayorQue(double metros){
		this.metros = metros;
	}

	@Override
	public boolean cumple(Habitacion habitacion) {
		return habitacion.getMetros()>=metros;
	}
}
