package parcialito4;

public class FiltroProducto extends Filtro {
	private String codigo;

	public FiltroProducto(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public boolean cumple(Vendedor v) {
		
		return v.vendio(codigo);
	}

}
