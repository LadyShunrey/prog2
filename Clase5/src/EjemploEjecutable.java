import clase5.ejemploThis.A;
import clase5.ejemploThis.B;
import clase5.ejemploThis.C;
import clase5.otrosEjemplos.*;

public class EjemploEjecutable {

	public static void main(String[] args) {
		A auxiliar = new A();
		
		auxiliar.atributoPublico = 5; //ESTO NO SE HACE ESTA MAL ES SOLO EJEMPLO
		
		System.out.println(auxiliar.a1());
		System.out.println(auxiliar.a2());
		System.out.println(auxiliar.a3());
		System.out.println("-------");
		
		B auxiliarB = new B();
		
		auxiliarB.atributoPublico = 6;
		
		System.out.println(auxiliarB.a1());
		System.out.println(auxiliarB.a2());
		System.out.println(auxiliarB.a3());
		System.out.println(auxiliarB.b1());
		System.out.println("-------");
	
		auxiliar = auxiliarB;

		System.out.println(auxiliar.a1());
		System.out.println(auxiliar.a2());
		System.out.println(auxiliar.a3());
		/* System.out.println(auxiliar.b1()); //SOLO MENSAJES QUE ESTEN EN A */
		System.out.println("-------");
		
		C auxiliarC = new C();
		
		System.out.println(auxiliarC.a1());
		System.out.println(auxiliarC.a2());
		System.out.println(auxiliarC.a3());
		/*System.out.println(auxiliarC.b1());*/ //NO LO VA A PODER EJECUTAR PORQUE C NO TIENE UN METODO b1
		System.out.println("-------");
		
		D auxiliarD = new D();
		
		System.out.println(auxiliarD.a1());
		System.out.println(auxiliarD.a2());
		System.out.println(auxiliarD.a3());
		System.out.println("-------");
		
		
		Persona p1 = new Persona ();
		p1.setNombre("Melisa");
		p1.setApellido("Burlando");
		Persona p2 = new Persona ("Burlando", "Ulises");
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellido());
		System.out.println(p2.getNombre());
		System.out.println(p2.getApellido());

	}
	
	
}
  