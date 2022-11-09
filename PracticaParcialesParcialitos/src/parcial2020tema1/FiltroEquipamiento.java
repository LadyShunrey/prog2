package parcial2020tema1;

public class FiltroEquipamiento extends Filtro {
	private String equipamiento;
	
	public FiltroEquipamiento (String equipamiento){
		this.equipamiento = equipamiento;
	}

	@Override
	public boolean cumple(Paciente paciente) {
		return paciente.getEquipamientoNecesario().contains(equipamiento);
	}

}
