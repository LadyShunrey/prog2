package ejerciciofarmacia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Farmacia farm = new Farmacia();

		Medicamento ibu = new Medicamento("Ibuprofeno", "Bayer", 500.0);
        Medicamento tafirol = new Medicamento("Tafirol", "Bayer", 900.0);
        Medicamento ibuevanol = new Medicamento("Ibuevanol", "XX", 600.0);
        
        farm.addMedicamento(ibu);
        farm.addMedicamento(tafirol);
        farm.addMedicamento(ibuevanol);
        farm.addMedicamento(new Medicamento("diclofenac", "XX", 400.5));
        
        Medicamento ibu1 = new Medicamento("Ibuprofeno", "Bayer", 100.5);
        Medicamento ibu2 = new Medicamento("Ibuprofeno", "Bagho", 200.0);
        Medicamento tafi = new Medicamento("Tafirol", "Bayer", 150.5);

        farm.addMedicamento(ibu1);
        farm.addMedicamento(ibu2);
        farm.addMedicamento(tafi);
        
//        System.out.println(farm.tieneMedicamento(med));

        System.out.println(farm.buscar(new CriterioLaboratorio("Bayer")));
        
        System.out.println("Más ejemplos!: ");
        
        ArrayList<Medicamento> resultado = new ArrayList<>();
        
        System.out.println("----------Laboratorio Bayer");
        resultado = farm.buscar(new CriterioLaboratorio("Bayer"));
        System.out.println(resultado);
        System.out.println("----------Precio menor a 160");
        resultado = farm.buscar(new CriterioPrecioMenor(160.0));
        System.out.println(resultado);
        System.out.println("----------Nombre Tafirol");
        resultado = farm.buscar(new CriterioNombre("Tafirol"));
        System.out.println(resultado);

	}

}
