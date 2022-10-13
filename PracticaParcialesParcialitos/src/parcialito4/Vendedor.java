package parcialito4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vendedor implements Comparable<Vendedor> {
	private String nombre;
	private String apellido;
	private int edad;
	ArrayList<ProductoVendido> ventas;
	
	public Vendedor(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ventas = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void addVenta(ProductoVendido v){
		ventas.add(v);
	}
	
	public double ventasTotales(LocalDate inicio, LocalDate fin){
		double total =0.0;
		for(ProductoVendido p:ventas){
			if(p.entreFechas(inicio, fin)){
				total += p.ganancia();
			}
		}
		return total;
	}
	
	public int cantidadVentas(LocalDate inicio, LocalDate fin){
		int total = 0;
		for(ProductoVendido p:ventas){
			if(p.entreFechas(inicio, fin)){
				total++;
			}
		}
		return total;
		//return ventas.size();
	}
	
	public boolean vendio(String codigo){
		ArrayList<ProductoVendido> aux = ventas;
		for(ProductoVendido p: aux){
			if(p.getCodigo().equals(codigo)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Vendedor o) {
		int res = this.getApellido().compareTo(o.getApellido());
		if (res == 0){
			return this.getNombre().compareTo(o.getNombre());
		}
		return res;
	}
	
}
