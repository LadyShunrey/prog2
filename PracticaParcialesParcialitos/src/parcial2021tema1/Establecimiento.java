package parcial2021tema1;

import java.util.ArrayList;

public class Establecimiento {
	private String nombre;
	private ArrayList<ElementoHospital> elementos;
	
	public Establecimiento(String nombre){
		this.nombre = nombre;
		elementos = new ArrayList<>();
	}
}
