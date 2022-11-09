package parcial2020tema1;

import java.util.ArrayList;

public abstract class ElementoHospital {
	public abstract int contarCamas();
	public abstract ArrayList<Cama> buscarCamasDisponibles();
	public abstract ArrayList<Cama> buscarCamasOcupadas();
}
