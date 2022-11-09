package parcial2020tema1;

public class FiltroNOT extends Filtro {
	private Filtro filtro;
	
	public FiltroNOT(Filtro filtro){
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Paciente paciente) {
		return !filtro.cumple(paciente);
	}

}
