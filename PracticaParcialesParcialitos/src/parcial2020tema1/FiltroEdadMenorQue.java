package parcial2020tema1;

public class FiltroEdadMenorQue extends Filtro {
	private int edad;
	
	public FiltroEdadMenorQue(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(Paciente paciente) {
		return paciente.getEdad()<=edad;
	}

}
