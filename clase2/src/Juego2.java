
public class Juego2 {
		//Atributos
		private Jugador jugador1;
		private Jugador jugador2;
		private int cantidadDeRondas;
		private int minimoDePuntos;
		private Dado d1;
		private Dado d2;
		
		//Constructores
		public Juego2(String n1, String n2, int cantidadDeRondas, int minimo, int cantidadCaras){ 
			jugador1 = new Jugador(n1);
			jugador2 = new Jugador(n2);
			this.cantidadDeRondas = cantidadDeRondas;
			minimoDePuntos = minimo;
			d1 = new Dado(cantidadCaras);
			d2 = new Dado(cantidadCaras);
		}
		
		public Juego2(Jugador j1, Jugador j2, int cantidadRondas, int minimo, Dado d1, Dado d2){
			jugador1 = j1;
			jugador2 = j2;
			cantidadDeRondas = cantidadRondas;
			minimoDePuntos = minimo;
			this.d1 = d1;
			this.d2 = d2;
		}
		
		//m�todos
		public int getPuntosJugador1(){
			return jugador1.getPuntos();
		}
		
		public Jugador getJugador1(){
			return jugador1;
		}
		
		public int getPuntosJugador2(){
			return jugador2.getPuntos();
		}
		
		public Jugador getJugador2(){
			return jugador2;
		}
		
		public Jugador ganador(){
			if (jugador1.getPuntos()>jugador2.getPuntos()){
				return jugador1;
			}
			else if (jugador2.getPuntos()>jugador1.getPuntos()){
				return jugador2;
			}
			else{
				return null; //en caso de empate devuelvo null
			}
		}
		
		public Jugador jugar(){
			int puntos1;
			int puntos2;
			for(int i=0; i<cantidadDeRondas; i++){
				puntos1 = jugador1.tirarDados(d1, d2);
				puntos2 = jugador2.tirarDados(d1, d2);
				if ((puntos1>=minimoDePuntos)&&(puntos1>puntos2)){
					jugador1.sumarPuntos();
				}
				else if((puntos2>=minimoDePuntos)&&(puntos2>puntos1)){
					jugador2.sumarPuntos();
				}
			}
			return this.ganador();
		}
		
}
