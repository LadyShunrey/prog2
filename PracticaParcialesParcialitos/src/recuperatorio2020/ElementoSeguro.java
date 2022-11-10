package recuperatorio2020;

import java.util.ArrayList;

public abstract class ElementoSeguro {
	protected int dni;
	
	public ElementoSeguro(int dni){
		this.dni = dni;
	}
	
	public abstract double getMonto();
	
	public abstract int getNroPoliza();
	
	public abstract ArrayList<Seguro> buscarSeguros(Filtro filtro);
	
	public int getDni(){
		return dni;
	}
}
