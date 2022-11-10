package recuperatorio2020;

public class FiltroMontoSuperiorA extends Filtro {
	private double monto;
	
	public FiltroMontoSuperiorA(double monto) {
		this.monto = monto;
	}

	@Override
	public boolean cumple(Seguro seguro) {
		return seguro.getMonto()>monto;
	}

}
