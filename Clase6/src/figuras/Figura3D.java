package figuras;

public class Figura3D {
	private String nombre;
	private double altura;
	
	Figura base;
	
	public Figura3D(Figura b, double altura, String nomb){
		base = b;
		this.altura = altura;
		nombre = nomb;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getAreaBase(){
		return base.getArea();
	}
	
	public double getVolumen(){
		return this.getAreaBase()*altura;
	}
	
	public double getSuperficie(){
		return base.getPerimetro()*altura+base.getArea()*2;
	}
	
}
