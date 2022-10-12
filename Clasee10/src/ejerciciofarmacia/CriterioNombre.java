package ejerciciofarmacia;

public class CriterioNombre extends Criterio {
	
	private String nombreQueBusco;
	
	public CriterioNombre(String nombreQueBusco){
		this.nombreQueBusco = nombreQueBusco;
	}

	public String getNombreQueBusco(){
		return nombreQueBusco;
	}
	
	public void setNombreQueBusco(String nombreQueBusco){
		this.nombreQueBusco = nombreQueBusco;
	}
	
	@Override
	public boolean cumple(Medicamento m) {
		return m.getNombre().equals(nombreQueBusco);
	}
}
