package libreria;

import java.util.ArrayList;

public class Cliente {

	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected long dni;
	protected double descuento;
	
	protected ArrayList<String> autoresFavoritos;
	protected ArrayList<String> generosFavoritos;
	protected ArrayList<Producto> compras;
	
	private Comportamiento comport;
	
	public Cliente(String nombre, String apellido, String direccion, long dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		autoresFavoritos = new ArrayList<String>();
		generosFavoritos = new ArrayList<String>();
		compras = new ArrayList<Producto>();
		//el comportamiento por defecto es autor
		comport = new ComportamientoAutor();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	//NUNCA HACEMOS GET NI SET DE ARRAYLIST PORQUE LA PUEDEN ACCEDER DE AFUERA!!!!!!!!!!!
	//ENTONCES HACEMOS ESTO:
	
	public void addAutorFavorito(String nombre){
		if (!autoresFavoritos.contains(nombre)){ //"contains" funciona usando el equals del tipo elemento
			autoresFavoritos.add(nombre);
		}
	}
	
	public void addGeneroFavorito(String genero){
		if (!generosFavoritos.contains(genero)){ //"contains" funciona usando el equals del tipo elemento
			generosFavoritos.add(genero);
		}
	}
	
	public void addProductoComprado(Producto producto){
			compras.add(producto);
	}
	
	/*public ArrayList<Producto> getProductosComprados(){
		//OPCION 1 MUY MAL:
		//HACER UN return compras; ROMPE ENCAPSULAMIENTO
		//OPCION 2:
		//En este caso no hay tanto problema, es crear un new arraylist producto y pasarle de parametro compras
	}*/
	
	public boolean comprasteProducto(Producto pp){ 
		/*
		for (int i = 0; i <compras.size();i++){ //La ventaja más grande que tenemos es que esto con el equals redefinido no es otra cosa que el contains de array
			Producto p1= compras.get(i);
			if(p1.equals(pp)){
				return true;
			}
		}
		return false;
		*/
		return compras.contains(pp);
	}
	
	public boolean leGustaGenero(String genero){
		return generosFavoritos.contains(genero);
	}
	public boolean leGustaAutor(String autor){
		return autoresFavoritos.contains(autor);
	}
	
	public boolean leGusta(Libro l1){
		return comport.leGusta(l1, this);
	}
	
	public void setComportamiento(Comportamiento cc){
		comport = cc;
	}
}
