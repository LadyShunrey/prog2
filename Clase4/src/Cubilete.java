
public class Cubilete {

	//atributos
	private Dado d1;
	private Dado d2;
	private Dado d3;
	private Dado[] dados;
	
	//constructores
	public Cubilete(int cantidadDeDados){
		dados = new Dado[cantidadDeDados]; //creo un arreglo de x cantidad de dados
		for (int i=0; i<dados.length; i++){    // es lo mismo poner cantidadDeDados==dados.length
			dados[i] = new Dado(6);
		}
	}
	
	public Cubilete(int cantidadDeDados, int cantidadCaras){
		dados = new Dado[cantidadDeDados]; //creo un arreglo de x cantidad de dados
		for (int i=0; i<dados.length; i++){    // es lo mismo poner cantidadDeDados==dados.length
			dados[i] = new Dado(cantidadCaras);
		}
	}

	//ESTE TOMAR CON PINZAS porque no sé si ese arreglo viene bien creado o si tiene null porque no lo hice yo
	public Cubilete(Dado[] dadosAfuera){
		dados = dadosAfuera;
	}
	
	//métodos
	public int tirar(){
		int suma = 0;
		for(int i=0; i<dados.length; i++){
			suma += dados[i].tirar();
		}
		return suma;
	}
	
	public Dado getDadoEn(int pos){
		if((pos>=0)&&(pos<dados.length)){
			return dados[pos];
		}
		else{
			return null;
		}
	}
	
	public void setDadoEn(int pos, Dado nuevo){
		if((pos>=0)&&(pos<dados.length)&&(nuevo!=null)){
			dados[pos] = nuevo;
		}
	}
}
