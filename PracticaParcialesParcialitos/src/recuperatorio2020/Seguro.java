package recuperatorio2020;

import java.util.ArrayList;

public class Seguro extends ElementoSeguro {
	protected int nroPoliza;
	protected String descripcion;
	protected CalculadorMonto calculador;
	
	public Seguro(int nroPoliza, String descripcion, CalculadorMonto calculador, int dni){
		super(dni);
		this.nroPoliza = nroPoliza;
		this.descripcion = descripcion;
		this.calculador = calculador;
	}
	
	@Override
	public ArrayList<Seguro> buscarSeguros(Filtro filtro){
		ArrayList<Seguro> segurosEncontrados = new ArrayList<>();
		if(filtro.cumple(this)){
			segurosEncontrados.add(this);
		}
		return segurosEncontrados;
	}
	
	@Override
	public double getMonto(){
		double monto;
		monto = calculador.calcularMonto();
		return monto;
	}
	
	@Override
	public int getNroPoliza(){
		return nroPoliza;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
}



//pregunta monto tiene que tener algun basico??

//pregunta si se repite el atributo lo subo al super??

//OTRAS PREGUNTAS
//El seguro temporal puede ser un integrador?? Porque si es asi no hereda de seguro sino de elemento

//nombre == descripcion?? O tengo que hacer un atributo nombre??

//dni es un int no???