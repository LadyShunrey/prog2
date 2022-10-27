//Futbol 5
//club de futbol
//control de socios y alquileres de canchas
//Cada socio tiene nombre apellido edad si tiene paga la cuota y una lista de canchas alguiladas

//cuando el socio alquila se registra la fecha el id de la cancha que alquiló y cuanto pagó




package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Club futbol5 = new Club();
		
		Socio a = new Socio("Anombre", "Bapellido", 15, false);
		Socio b = new Socio("Cnombre", "Bapellido", 13, true);
		Socio c = new Socio("Fnombre", "Capellido", 17, true);
		Socio d = new Socio("Znombre", "Capellido", 10, true);
		Socio e = new Socio("Gnombre", "Gapellido", 20, true);
		Socio f = new Socio("Hnombre", "Hapellido", 23, false);
		Socio g = new Socio("Hnombre", "Bapellido", 25, false);
		Socio h = new Socio("Hnombre", "Zapellido", 22, false);
		Socio i = new Socio("Hnombre", "Aapellido", 16, false);
		
		FiltroMenorEdad menores = new FiltroMenorEdad();
		ComparadorEdad porEdad = new ComparadorEdad();
		
		futbol5.addSocio(a);
		futbol5.addSocio(b);
		futbol5.addSocio(c);
		futbol5.addSocio(d);
		futbol5.addSocio(e);
		futbol5.addSocio(f);
		futbol5.addSocio(g);
		futbol5.addSocio(h);
		futbol5.addSocio(i);
		
		System.out.println("Todos los socios del club son: ");
		System.out.println(futbol5.obtenerTodosLosSocios());
		
		System.out.println("Los socios que tienen cuota impaga son: ");
		System.out.println(futbol5.obtenerSociosCuotaImpaga());
		
		System.out.println("Los menores de edad ordenados por edad son: ");
		System.out.println(futbol5.obtenerMenores(menores, porEdad));

	}

}
