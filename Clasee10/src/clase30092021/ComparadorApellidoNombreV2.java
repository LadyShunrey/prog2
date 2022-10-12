package clase30092021;

import java.util.Comparator;

public class ComparadorApellidoNombreV2 implements Comparator<Persona>{
	private ComparadorApellido compAp;
	private ComparadorNombre compNom;
	
	public ComparadorApellidoNombreV2(){
		this.compAp = new ComparadorApellido();
		this.compNom = new ComparadorNombre();
	}
	
	@Override
	public int compare(Persona per1, Persona per2){
		int aux = compAp.compare(per1, per2);
		if (aux == 0){
			return compNom.compare(per1, per2);
		}
		else return aux;
	}

}
