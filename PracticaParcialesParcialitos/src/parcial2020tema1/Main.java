package parcial2020tema1;

public class Main {

	public static void main(String[] args) {
		Establecimiento hospital = new Establecimiento("Hospital");
		
		Filtro filtroEdad = new FiltroEdadMenorQue(60);
		
		Paciente juan = new Paciente("Juan", 23, true);
		Paciente pedro = new Paciente("Pedro", 43, false);
		
		Cama c1 = new Cama(1, true, null);
		Cama c2 = new Cama(2, true, null);
		Cama c3 = new Cama(3, true, null);
		Cama c4 = new Cama(4, true, null);
		Cama c5 = new Cama(5, false, juan);
		
		c2.addEquipamiento("suero");
		c2.addEquipamiento("otro equipo");
		
		pedro.addEquipamientoNecesario("suero");
		
		Sala s1 = new Sala();
		
		s1.addElemento(c3);
		s1.addElemento(c4);
		s1.addElemento(c5);
		
		hospital.addElemento(c1);
		hospital.addElemento(c2);
		hospital.addElemento(s1);
		
		System.out.println(hospital.contarCamas());
		
		System.out.println(hospital.camasDisponibles());
		
		hospital.asignarPaciente(pedro, filtroEdad);
		
		System.out.println(hospital.camasDisponibles());
		
	}

}
