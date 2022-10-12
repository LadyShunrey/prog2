package ejerciciofarmacia;

public class CriterioLaboratorio extends Criterio {
	
	private String labQueBusco;
	
	public CriterioLaboratorio(String labQueBusco){
		this.labQueBusco = labQueBusco;
	}

	public String getLabQueBusco(){
		return labQueBusco;
	}
	
	public void setLabQueBusco(String labQueBusco){
		this.labQueBusco = labQueBusco;
	}
	
	@Override
	public boolean cumple(Medicamento m) {
		return m.getLaboratorio().equals(labQueBusco);
	}

}
