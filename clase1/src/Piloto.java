
public class Piloto {
	private String nombre;
	Avion av;
	
	public Piloto(String nombr, Avion aa){
		nombre = nombr;
		av = aa;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Avion getAvion() {
		return av;
	}
	public void setAvion(Avion av) {
		this.av = av;
	}
}
