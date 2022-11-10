package recuperatorio2020;

public class CalculadorMontoPorcentaje extends CalculadorMonto {

	private double valorAsegurado;
	private double porcentaje;
	
	public CalculadorMontoPorcentaje(double valorAsegurado, double porcentaje){
		this.valorAsegurado = valorAsegurado;
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double calcularMonto() {
		double monto = 0.0;
		monto = (porcentaje * valorAsegurado) / 100;
		return monto;
	}

}
