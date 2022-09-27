package figuras;

public class MedioCirculo extends Circulo {
	
	public MedioCirculo(double radio){
		super(radio);
		this.setNombre("MedioCirculo");
		this.getNombre();
		this.getRadio();
		this.getArea();
	}
	
	public MedioCirculo(double radio, String nombre){
		super(radio, nombre);
	}
	
	public double getArea(){
		return super.getArea()/2;
	}
	
	public double getPerimetro(){
		return super.getPerimetro()/2+ this.getRadio()*2;
	}
	
}
