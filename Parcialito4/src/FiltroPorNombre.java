
public class FiltroPorNombre extends Filtro {
	private String nombre;
	
	public FiltroPorNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumpleCondicion(Producto p) {
		if(p.getNombre()!=null){
			return p.getNombre().equals(this.nombre);
		}
		return false;
	}

}
