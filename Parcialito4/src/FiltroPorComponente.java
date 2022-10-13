
public class FiltroPorComponente extends Filtro {
	
	private String componente;

	public FiltroPorComponente(String componente) {
		this.componente = componente;
	}

	@Override
	public boolean cumpleCondicion(Producto p) {
		return p.tieneComponente(componente);
	}
}
