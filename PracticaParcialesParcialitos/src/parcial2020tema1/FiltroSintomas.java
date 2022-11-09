package parcial2020tema1;

public class FiltroSintomas extends Filtro {
	private String sintoma;
	
	public FiltroSintomas(String sintoma){
		this.sintoma = sintoma;
	}

	@Override
	public boolean cumple(Paciente paciente) {
		return paciente.getSintomas().contains(sintoma);
	}

}
