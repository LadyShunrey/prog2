package libreria;

public class Producto {
	
	protected String nombre;
	protected String autor;
	protected double precio;
	//arraylist de generos?
	
	public Producto(String nombre, String autor, double precio) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) { 
	}

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public double getPrecio(Cliente comprador) {
		if(comprador!=null){
			return precio - ((comprador.getDescuento()/100)*precio);
		}
		else{
			return precio;	
		}
	}

	public boolean equals(Object o1){
		try{
			Producto p1 = (Producto) o1;
			return p1.getNombre().equals(nombre) && 
					p1.getAutor().equals(autor);
		}
		catch (Exception exc){
			return false;
		}
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}	
	
