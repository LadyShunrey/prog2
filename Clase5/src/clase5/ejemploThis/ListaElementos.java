package clase5.ejemploThis;

public class ListaElementos {
	
	private Object[] elementos;
	private int contador;
	private int capacidad = 50;
	
	public ListaElementos(){
		this(50);
		contador = 0;
	}
	
	public ListaElementos(int capacidadInicial){
		elementos = new Object [capacidadInicial];
		capacidad = capacidadInicial;
		contador = 0;
	}
	
	public int getCantidadElementos(){
		return contador;
	}
	
	//CREARLA
	
	//PEDIR UN ELEMENTO POR POSICION
	public Object getElementoEn(int pos){
		if(pos>0 && pos<contador){
			return elementos[pos];
		} else{
			return null;
		}
	}
	
	//AGREGAR ELEMENTO
	public void agregar(Object o1){
		elementos[contador] = o1;
		contador++;
		if(contador==capacidad){
			//SE ME LLENO DE OBJETOS LA LISTA
			Object[] auxiliar = new Object[capacidad*2];
			for (int i = 0; i < contador; i++){ //puede ser contador o capacidad ya que valen lo mismo
				auxiliar[i] = elementos[i]; 
			}
			
			elementos = auxiliar;
			capacidad = capacidad*2;
		}
	}
	
	//ELIMINAR UN ELEMENTO
	//Eliminar por pos
	public void eliminar(int pos){
		if(pos>0 && pos<contador){
			for(int i = pos; i<contador-1; i++){
				elementos[i]=elementos[i+1];
			}
			contador--;
		}
	}

	//eliminar por objecto
	public void eliminar(Object elementoABorrar){
		for(int i = 0; i<contador; i++){
			if(elementos[i].equals(elementoABorrar)){
				this.eliminar(i);
				return;
			}
		}
	}
}
