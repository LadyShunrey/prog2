
public class EjemploObject {
	public static void main (String [] args){
		Object xx = new Dado(6);
		xx = new Jugador("Kevin");
		xx = new DadoCargado (6,6);
		//xx.setProb(0.1); ESTO NO SE PUEDE PORQUE OBJECT NO TIENE EL METODO SETPROB 
		
		System.out.println("Hola " + new Jugador("Lucas")); //ESTO ME DEVUELVE "Hola Jugador@1db9742"
		
		Jugador j1 = new Jugador ("Gonzalo");
		Jugador j2 = new Jugador ("Gonzalo");
		
		//j1 = j2; ESTO VA A DAR IGUALES
		 
		if (j1 == j2){
			System.out.println("Iguales 1");
		}
		else { 
			System.out.println("Distintos 1");
		}
		
		if (j1.equals(j2)){
			System.out.println("Iguales 2");
		}
		else {
			System.out.println("Distintos 2");
		}
	}
}
