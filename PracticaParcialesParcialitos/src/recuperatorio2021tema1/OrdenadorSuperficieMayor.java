package recuperatorio2021tema1;

public class OrdenadorSuperficieMayor extends Ordenador {

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		if (h2.getMetros() > h1.getMetros()){
			return 1;
		}
		else if(h2.getMetros() < h1.getMetros()){
			return -1;
		}
		
		return 0;
	}

}
