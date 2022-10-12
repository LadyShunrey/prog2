package clase30092021;

public class ComparadorNombre extends ComparadorPersona{
	
	public ComparadorNombre() {
		
	}

	public ComparadorNombre(ComparadorPersona siguiente) {
		super(siguiente);
	}

	@Override
	public int comparar(Persona per1, Persona per2){
		return per1.getNombre().compareTo(per2.getNombre());
	}
}
