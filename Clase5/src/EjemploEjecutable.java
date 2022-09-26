import clase5.ejemploThis.A;
import clase5.ejemploThis.B;

public class EjemploEjecutable {

	public static void main(String[] args) {
		A auxiliar = new A();
		
		auxiliar.atributoPublico = 5;
		
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

	}
	
	
}
  