
public class DadoCargado extends Dado {
	
	private int ladoCargado;
	private double probabilidad;
	
	public DadoCargado(int cantidadCaras, int ladoCargado){
		super(cantidadCaras);
		this.ladoCargado = ladoCargado;
		probabilidad = 0.5;
	}
	
	public DadoCargado(int cantidadCaras, int ladoCargado, double dd){
		super(cantidadCaras);
		this.ladoCargado = ladoCargado;
		probabilidad = dd;
	}
	
	
	
	public double getProbabilidad() {
		return probabilidad;
	}

	/*public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}*/

	public int getLadoCargado() {
		return ladoCargado;
	}

	/*public void setLadoCargado(int ladoCargado) {
		this.ladoCargado = ladoCargado;
	}*/

	public int tirar(){
		if (Math.random()>probabilidad){
			return super.tirar();
		}
		else{
			return ladoCargado;
		}
		
	}
	
	public static void main (String[]args){
		Dado d1 = new Dado(6);
		DadoCargado d2 = new DadoCargado(6,6, 0.9);
		DadoCargado d3 = new DadoCargado(6,1);
		
		for (int i = 0; i<20; i++){
			System.out.println("d1: "+d1.tirar()+" - d2: "+d2.tirar());
		}
	}
}
