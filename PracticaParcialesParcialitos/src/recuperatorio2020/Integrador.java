package recuperatorio2020;

import java.util.ArrayList;

public class Integrador extends ElementoSeguro {
	private ArrayList<ElementoSeguro> elementos;
	
	public Integrador(int dni){
		super(dni);
	}
	
	@Override
	public ArrayList<Seguro> buscarSeguros(Filtro filtro){
		ArrayList<Seguro> segurosEncontrados = new ArrayList<>();
		for(ElementoSeguro elemento: elementos){
			segurosEncontrados.addAll(elemento.buscarSeguros(filtro));
		}
		return segurosEncontrados;
	}
	
	@Override
	public double getMonto(){
		double monto = 0.0;
		for(ElementoSeguro elemento: elementos){
			monto += elemento.getMonto();
		}
		return monto;
	}
	
	@Override
	public int getNroPoliza(){
		int nroPoliza = 0;
		for(ElementoSeguro elemento: elementos){
			int aux = elemento.getNroPoliza();
			if(aux > nroPoliza){
				nroPoliza = aux;
			}
		}
		return nroPoliza;
	}
}
