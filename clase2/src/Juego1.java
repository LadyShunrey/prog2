
public class Juego1 {
	//Atributos
	private int puntosJugador1;
	private int puntosJugador2;
	private int cantidadCaras;
	private int cantidadDeRondas;
	private int minimoDePuntos;
	
	//Constructor
	public Juego1(){ 
		this(7);
	}
	
	public Juego1(int minimoDePuntos){ 
		this(minimoDePuntos, 6);
	}
	
	public Juego1(int minimoDePuntos, int cantidadCaras){ 
		this(minimoDePuntos, cantidadCaras, 10);
	}
	
	public Juego1(int minimoDePuntos, int cantidadCaras, int cantidadDeRondas){ 
		puntosJugador1 = 0;
		puntosJugador2 = 0;
		this.minimoDePuntos = minimoDePuntos;
		this.cantidadCaras = cantidadCaras;
		this.cantidadDeRondas = cantidadDeRondas;
	}
	
	public int getPuntosJugador1(){
		return puntosJugador1;
	}
	
	public int getPuntosJugador2(){
		return puntosJugador2;
	}
	
	private int tirarDado(){
		//random devuelve un valor entre 0 y 1, entonces lo multiplico por 6 para que devuelva enre 0 y 6,
		//y le sumo 1 para que no salga 0... y después devuelvo solo la parte entera poniendo INT.
		return (int) ((Math.random()*cantidadCaras)+1);
	}
	
	public String ganador(){
		if (puntosJugador1>puntosJugador2){
			return "Jugador 1";
		}
		else if (puntosJugador2>puntosJugador1){
			return "Jugador 2";
		}
		else{
			return "Es un empate";
		}
	}
	
	public String jugar(){
		int puntos1;
		int puntos2;
		for(int i=0; i<cantidadDeRondas; i++){
			puntos1 = tirarDado() + tirarDado();
			puntos2 = this.tirarDado() + this.tirarDado();
			if ((puntos1>minimoDePuntos)&&(puntos1>puntos2)){
				puntosJugador1++;
			}
			else if((puntos2>minimoDePuntos)&&(puntos2>puntos1)){
				puntosJugador2++;
			}
		}
		return this.ganador();
	}
	
	
}
