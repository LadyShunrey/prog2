
public class Avion {

	//ATRIBUTOS
	private String color;
	private int codigoID;
	private int cantidadDeAsientos;
	private int cantidadDeTripulacion;
	
	Piloto p1;
	
	//CONSTRUCTOR DEL OBJETO
	public Avion(){
		this(15, 3, 1, "blanco");
	}
	
	public Avion(int codigoID){
		this.codigoID = codigoID;
		color = "blanco";
		cantidadDeAsientos = 3;
		cantidadDeTripulacion = 1;
	}
	
	public Avion(int codigo, int asientos, int tripulacion, String color){
		codigoID = codigo;
		this.color = "blanco";
		this.setColor(color);
		this.setCantidadDeAsientos(asientos);
		this.setCantidadDeTripulacion(tripulacion);
		p1 = new Piloto("Juan",this);
		
	}
	
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

	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	public int getCantidadDeTripulacion() {
		return cantidadDeTripulacion;
	}

	public Piloto getPiloto() {
		return p1;
	}

	public void setPiloto(Piloto p1) {
		this.p1 = p1;
	}

	public void setCantidadDeTripulacion(int cantidadDeTripulacion) {
		if(cantidadDeTripulacion<1){
			this.cantidadDeTripulacion = 1;
		}
		else{
			this.cantidadDeTripulacion = cantidadDeTripulacion;
		}
	}
	
	public double getBalance(){
		if (cantidadDeAsientos!=0){
			return (double)cantidadDeTripulacion/(double)cantidadDeAsientos;
		}else{
			return 0;
		}
	}
}
