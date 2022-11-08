package parcial2022;

import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends Seccion {
	private String categoria;
	private ArrayList<ElementoPortal> elementos;
	private int limite;
	
	public SeccionEspecial(String categoria, int limite){
		super(0,"Sin definir");
		this.categoria = categoria;
		this.limite = limite;
		elementos = new ArrayList<>();
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	public ArrayList<String> getPalabrasClaves(){
		ArrayList<String> copiaDePalabrasClaves = new ArrayList<>();
		ArrayList<String> auxiliar = new ArrayList<>();
		auxiliar.addAll(super.getPalabrasClaves());
		Collections.sort(auxiliar);
		for(int i = 0; i < limite; i++){
			copiaDePalabrasClaves.add(auxiliar.get(i));
		}
		return copiaDePalabrasClaves;
	}

}
