
public class Jugador {
	//atributos
	private String nombre;
	private int puntos;
	//constructores
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	//métodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void sumarPuntos() {
		this.puntos++;
	}
	public int tirarDados(Dado d1, Dado d2){
		//DELEGANDO RESPONSABILIDADES
		return d1.tirar()+d2.tirar();
	}
	public int tirarDados(Cubilete cub){
		//DELEGANDO RESPONSABILIDADES 
		return cub.tirar();
	}
	
	public boolean equals(Object o1){
		String nombreAfuera = ((Jugador)o1).getNombre();
		return nombre.equals(nombreAfuera);
	}
	
	 
}
