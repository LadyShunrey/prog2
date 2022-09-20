
public class Cubo extends Figura3D {

	private double lado1;
	private double lado2;
	
	public Cubo(Figura b, double altura, String nomb) {
		super(b, altura, nomb);
	}

	public double getAreaBase(){
		return lado1*lado2;
	}
}
