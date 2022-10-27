import java.util.ArrayList;


public class Grupo extends ElementoEmpresa{
	private ArrayList<ElementoEmpresa> elementos;

	public Grupo() {
		elementos = new ArrayList<ElementoEmpresa>();
	}
	
	public void add(ElementoEmpresa e){
		elementos.add(e);
	}
	
}
