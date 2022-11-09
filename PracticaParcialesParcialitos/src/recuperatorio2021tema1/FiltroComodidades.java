package recuperatorio2021tema1;

public class FiltroComodidades extends Filtro {
	private String equipo;
	
	public FiltroComodidades (String equipo){
		this.equipo = equipo;
	}

	@Override
	public boolean cumple(Habitacion habitacion) {
		return habitacion.getComodidades().contains(equipo);
	}

}
