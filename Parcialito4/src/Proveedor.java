

import java.util.ArrayList;

public class Proveedor {

	private ArrayList<String> marcasComercializadas;
	private String nombreEmpresa;
	private String CUIT;
	private double deudaActual;

	public double getDeudaActual() {
		return deudaActual;
	}

	public void setDeudaActual(double deudaActual) {
		this.deudaActual = deudaActual;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public String getCUIT() {
		return CUIT;
	}

}
