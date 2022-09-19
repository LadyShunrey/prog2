
public class Dado {
	//atributos siempre privados
	private int cantidadCaras;
	private int ultimoValor;
	
	//constructor
	public Dado(int cantidad){
		cantidadCaras = cantidad;
	}
	
	//métodos
	public int tirar(){
		ultimoValor = (int)((Math.random()*cantidadCaras)+1); 
		return ultimoValor;
	}
	
	public int getCantidadCaras() {
		return cantidadCaras;
	}
	
	public void setCantidadCaras(int cantidadCaras) {
		this.cantidadCaras = cantidadCaras;
	}
}
