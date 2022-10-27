package Ejercicio1;

public class ComparadorEdad implements Comparador {

	public int compare(Socio socio1, Socio socio2) {
		return (socio1.getEdad() - socio2.getEdad());
	}

}
