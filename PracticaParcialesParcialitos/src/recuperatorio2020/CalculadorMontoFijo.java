package recuperatorio2020;

public class CalculadorMontoFijo extends CalculadorMonto {
	private double monto;
	
	public CalculadorMontoFijo(double monto){
		this.monto = monto;
	}
	
	public double calcularMonto(){
		return monto;
	}
}
