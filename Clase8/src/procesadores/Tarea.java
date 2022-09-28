package procesadores;

public class Tarea {
	
	//atributos de instancia
	private double cpu;
	private double memoria;
	private int prioridad;
	private String id;
	
	//constructor
	public Tarea(double cpu, double memoria, int prioridad, String id) {
		super();
		this.cpu = cpu;
		this.memoria = memoria;
		this.prioridad = prioridad;
		this.id = id;
	}

	//métodos de instancia
	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void ejecutarTarea(){
		System.out.println("SE EJECUTÓ LA TAREA: " + this);
	}
	
	public String toString(){
		return "Tarea("+id+", "+cpu+", "+memoria+", "+prioridad+").";
	}
}
