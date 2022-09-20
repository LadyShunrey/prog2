
public class JugadorTramposo extends Jugador {
	private DadoCargado d1;
	private DadoCargado d2;
	
	public JugadorTramposo(String nombre) {
		super(nombre);
		d1 = new DadoCargado(6, 6);
		d2 = new DadoCargado(6, 5);
	}

	public DadoCargado getD1() {
		return d1;
	}

	public void setD1(DadoCargado d1) {
		this.d1 = d1;
	}

	public DadoCargado getD2() {
		return d2;
	}

	public void setD2(DadoCargado d2) {
		this.d2 = d2;
	}
	
	public int tirarDados(Cubilete cub){
		
		//Sacamos dados viejos
		Dado viejo1 = cub.getDadoEn(0);
		Dado viejo2 = cub.getDadoEn(1);
		
		//Ponemos nuestros dados tramposos
		cub.setDadoEn(0, this.d1);
		cub.setDadoEn(1, this.d2);
		
		//Tiramos como si no pasó nada
		int tirada = cub.tirar(); //no puedo hacer el return acá sino se corta la ejecución
		
		//Ahora disimuladamente volvemos a poner los dados viejos
		cub.setDadoEn(0, viejo1);
		cub.setDadoEn(1, viejo2);
		
		return tirada;
		
	}
	
}
