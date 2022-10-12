package clasesistemadearchivos;

public class Comprimido extends Carpeta{
	
	private double factor;
	
	public Comprimido(String nombre, double factor) {
		super(nombre);
		this.factor = factor;
	}

//	@Override
//	public int cantArchivos() {
//		return super.cantArchivos();
//	}

	@Override
	public double getTamanio() {
		return super.getTamanio()*factor;
	}
	
	

}
