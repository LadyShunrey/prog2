package libreria;

import java.util.ArrayList;

public class Libreria {

	ArrayList<Producto> productos;
	ArrayList<Cliente> clientes;
	
	public Libreria() {
		productos = new ArrayList<Producto>();
		clientes = new ArrayList<Cliente>();
	}

	public double getPrecio(Producto p, Cliente c){
		return p.getPrecio(c);
	}
	
	public boolean comproProducto(Cliente cl, Producto pp){
		return cl.comprasteProducto(pp);
	}

	public boolean leGustaLibro(Cliente cl, Libro l1){
		/*
		 * Si el cliente es comun controlo lista de autores,
		 * 			Le pido el listado de autores y controlo que el autor del libro este en ese listado 
		 * pero 
		 * si es exigente controlo lista de autores y lista de generos*/
		return cl.leGusta(l1); 
	}

}
