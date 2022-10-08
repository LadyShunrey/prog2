import java.util.ArrayList;


public class ColaEspera {
	private ArrayList<Computadora> elementos;
	
	
	
	public ColaEspera() {
		elementos = new ArrayList<>();
	}



	public void addElemento(ElementoCola elemento){
		boolean inserto = false;
		int i = 0;
		while (!inserto && i<elementos.size()){
			//se fije la velocidad e inserte
			if ( elemento.esMayor(elementos.get(i)) ){
				elementos.add(i, elemento);
				inserto = true;
			}
			i++;
		}
		if (!inserto){
			elementos.add(elemento);
		}
	}
	
//	public void addProceso(){
//		boolean inserto = false;
//		int i = 0;
//		while (!inserto && i<procesos.size()){
//			if (proc.getMemoriaRequerida() > procesos.get(i).getMemoriaRequerida()){
//				procesos.add(i, proc);
//				inserto = true;
//			}
//			i++;
//		}
//		if (!inserto){
//			procesos.add(proc);
//		}
//	}
}
