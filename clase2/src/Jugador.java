
public class Jugador {
	//atributos
	private String nombre;
	private int puntos;
	//constructores
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	//m�todos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void sumarPuntos(int puntos) {
		this.puntos++;
	}
	public int tirarDados(Cubilete cub){
		//DELEGANDO RESPONSABILIDADES 
		return cub.tirar();
	}
	
}
