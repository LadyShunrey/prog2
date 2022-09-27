package libreria;

public class Libro extends Producto {

	protected int cantPaginas;
	protected String resumen;
	protected String generoLiterario;
	
	

	public Libro(String nombre, String autor, double precio, int cantPaginas,String generoLiterario, String resumen) {
		super(nombre, autor, precio);
		this.cantPaginas = cantPaginas;
		this.generoLiterario = generoLiterario;
		this.resumen = resumen;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}


	public void setCantPaginas(int paginas) {
		this.cantPaginas = paginas;
	}


	public String getResumen() {
		return resumen;
	}


	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
}
