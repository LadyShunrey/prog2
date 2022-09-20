
public class Cilindro extends Figura3D {

	private double radio;
	
	public Cilindro(Figura b, double altura, String nomb) {
		super(b, altura, nomb);

	}
	
	public double getAreaBase(){
		return Math.PI*radio*radio;
	}
}
