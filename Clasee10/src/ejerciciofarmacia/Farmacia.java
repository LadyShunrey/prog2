package ejerciciofarmacia;

import java.util.ArrayList;

//organizar medicamentos

//cada medicamento guarda: nombre, laboratorio, precio, conjunto de sintomas que trata

//la farmacia desea poder buscar todos los medicamentos del laboratorio Bayer



public class Farmacia {
	private ArrayList <Medicamento> todosLosMedicamentos;
	
	public Farmacia() {
		this.todosLosMedicamentos = new ArrayList<>();
	}

	public void addMedicamento (Medicamento med){
		this.todosLosMedicamentos.add(med);
	}
	
	public ArrayList<Medicamento> buscar(Criterio criterio){
        ArrayList<Medicamento> losQueCumplen = new ArrayList<>();
        for (Medicamento m: todosLosMedicamentos) //foreach
            if (criterio.cumple(m))
                losQueCumplen.add(m);
        return losQueCumplen;
    }

//	public ArrayList<Medicamento> medicamentosDelLaboratorio(String laboratorio){
//		ArrayList<Medicamento>medicamentosDelLaboratorio = new ArrayList<>();
//		for(Medicamento med: todosLosMedicamentos){ //foreach
//			if(med.getLaboratorio().equals(laboratorio)){
//				medicamentosDelLaboratorio.add(med);
//			}
//		}		
//		return medicamentosDelLaboratorio; 
//	}
//	
//	public ArrayList<Medicamento> medicamentosPorNombre(String nombre){
//		ArrayList<Medicamento>medicamentosDeEseNombre = new ArrayList<>();
//		for(Medicamento med: todosLosMedicamentos){ //foreach
//			if(med.getNombre().equals(nombre)){
//				medicamentosDeEseNombre.add(med);
//			}
//		}		
//		return medicamentosDeEseNombre; 
//	}
}
