
public class MainJuego1 {

	public static void main(String[] args) {
		Juego1 jj = new Juego1();
		
		System.out.println(jj.getPuntosJugador1());
		System.out.println(jj.getPuntosJugador2());
		System.out.println(jj.jugar());
		System.out.println(jj.getPuntosJugador1());
		System.out.println(jj.getPuntosJugador2());
		
		Juego1 jj2 = new Juego1(3);
		
		System.out.println(jj2.getPuntosJugador1());
		System.out.println(jj2.getPuntosJugador2());
		System.out.println(jj2.jugar());
		System.out.println(jj2.getPuntosJugador1());
		System.out.println(jj2.getPuntosJugador2());
		
		Juego1 jj3 = new Juego1(9,4);
		
		System.out.println(jj3.getPuntosJugador1());
		System.out.println(jj3.getPuntosJugador2());
		System.out.println(jj3.jugar());
		System.out.println(jj3.getPuntosJugador1());
		System.out.println(jj3.getPuntosJugador2());
	}

}
