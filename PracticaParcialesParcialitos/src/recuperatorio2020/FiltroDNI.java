package recuperatorio2020;

public class FiltroDNI extends Filtro {
	private int dni;
	
	public FiltroDNI(int dni){
		this.dni = dni;
	}

	@Override
	public boolean cumple(Seguro seguro) {
		return seguro.getDni() == dni;
	}

}
