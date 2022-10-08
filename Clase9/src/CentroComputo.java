import java.util.ArrayList;


public class CentroComputo {
	private ColaEspera computadoras;
	private ColaEspera procesos;

	public CentroComputo() {
		this.computadoras = new ColaEspera();
		this.procesos = new ColaEspera();
	}
	
	public void addComputadora(Computadora compu){
		computadoras.addElemento(compu);
	}
	
	public void addProceso(Proceso proc){
		procesos.addElemento(proc);
	}
	
	public ArrayList<Computadora> getComputadoras(){
		return new ArrayList<>(computadoras);
	}
	public ArrayList<Proceso> getProcesos(){
		return new ArrayList<>(procesos);
	}
}
