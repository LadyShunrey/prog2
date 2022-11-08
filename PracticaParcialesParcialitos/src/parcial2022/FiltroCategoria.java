package parcial2022;

public class FiltroCategoria extends Filtro {
	private String categoria;
	
	public FiltroCategoria(String categoria){
		this.categoria = categoria;
	}
	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getCategoria().equals(categoria);
	}

}
