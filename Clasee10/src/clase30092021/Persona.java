package clase30092021;

import java.time.LocalDate;
import java.time.Period;


public class Persona  implements Comparable<Persona>{
	private String nombre;
	private String apellido;
	private LocalDate nacimiento;
	int cantHijos;
	
	public Persona (String nombre, String apellido, LocalDate nacimiento, int cantHijos){
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.cantHijos = cantHijos;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}
	
	public int getCantHijos() {
		return cantHijos;
	}
	
	public int getEdad(){
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(nacimiento, ahora);
		return periodo.getYears();
	}

	
	//compareTo retorna un valor positivo si this es mayor que el elemento parámetro
	//retorna un valor negativo si this es menor que el parametro
	//y retorna 0(cero) si son iguales
	@Override
	public int compareTo(Persona otra) {
		return this.cantHijos - otra.getCantHijos();
		//return this.getApellido().compareTo(otra.getApellido());
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", nacimiento=" + nacimiento + ", cantHijos=" + cantHijos
				+ "]" + "\n";
	}
	
}
