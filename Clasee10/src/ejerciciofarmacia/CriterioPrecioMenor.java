package ejerciciofarmacia;

public class CriterioPrecioMenor extends Criterio {
	
	private double precioLimite;

	public CriterioPrecioMenor(double precioLimite) {
		this.precioLimite = precioLimite;
	}

	@Override
	public boolean cumple(Medicamento m) {
		if (m.getPrecio()<precioLimite){
			return true;
		}
		else return false;
	}

}
