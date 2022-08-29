
public class Avion {

	//ATRIBUTOS
	private String color;
	private int codigoID;
	private int cantidadDeAsientos;
	private int cantidadDeTripulacion;
	
	//MÉTODOS
	public String getColor(){
		return color;
	}
	
	public void setColor(String unColor){
		if (! unColor.equals("celeste")) //ESTO ESTA MAL EN UN FUTURO VAMOS A VER BIEN COMO SE HACE
			color = unColor;
	}
	
	public int getCodigoID(){
		return codigoID;
	}
}
