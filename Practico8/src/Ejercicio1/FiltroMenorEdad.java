package Ejercicio1;

public class FiltroMenorEdad extends Filtro {
	public final int MAYOREDAD = 18;

	@Override
	public boolean cumpleCondicion(Socio socio) {
		if(socio.getEdad()<MAYOREDAD){
			return true;
		}
		return false;
	}

}
