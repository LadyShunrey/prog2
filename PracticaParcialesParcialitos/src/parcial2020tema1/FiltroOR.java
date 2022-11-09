package parcial2020tema1;

public class FiltroOR extends Filtro {
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOR(Filtro f1, Filtro f2){
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Paciente paciente) {
		return (f1.cumple(paciente)) || (f2.cumple(paciente));
	}

}
