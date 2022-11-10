package recuperatorio2020;

public class CalculadorMontoCompuesto extends CalculadorMonto {
	private CalculadorMonto calc1;
	private CalculadorMonto calc2;
	
	public CalculadorMontoCompuesto(CalculadorMonto calc1, CalculadorMonto calc2){
		this.calc1 = calc1;
		this.calc2 = calc2;
	}
	
	@Override
	public double calcularMonto() {
		return calc1.calcularMonto() + calc2.calcularMonto();
	}

}
