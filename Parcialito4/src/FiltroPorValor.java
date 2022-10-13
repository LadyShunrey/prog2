
public class FiltroPorValor extends Filtro {
	protected double precio;
	
	public FiltroPorValor(double precio) {
		this.precio = precio;
	}

	@Override
	public boolean cumpleCondicion(Producto p) {
		
		return this.precio < p.getPrecio();
	}

}
