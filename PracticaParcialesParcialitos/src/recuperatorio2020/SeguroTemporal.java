package recuperatorio2020;

import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroTemporal extends Seguro {
	private LocalDate inicio;
	private LocalDate fin;
	
	public SeguroTemporal(int nro, String descripcion, CalculadorMonto calculador, int dni, LocalDate inicio, LocalDate fin){
		super(nro, descripcion, calculador, dni);
		this.inicio = inicio;
		this.fin = fin;
	}
	
	
	@Override
	public ArrayList<Seguro> buscarSeguros(Filtro filtro){
		ArrayList<Seguro> segurosEncontrados = new ArrayList<>();
		LocalDate hoy = LocalDate.now();
		if(hoy.isAfter(inicio) && hoy.isBefore(fin)){
			segurosEncontrados.addAll( super.buscarSeguros(filtro));
//			if(filtro.cumple(this)){
//				segurosEncontrados.add(this);
//			}
		}
		return segurosEncontrados;
	}



	@Override
	public double getMonto(){
		double monto = 0.0;
		LocalDate hoy = LocalDate.now();
		if(hoy.isAfter(inicio) && hoy.isBefore(fin)){
			monto = calculador.calcularMonto();
		}
		return monto;
	}
}
