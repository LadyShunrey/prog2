package parcial2022;

public class FiltroContenido extends Filtro {
	private String contenido;

	public FiltroContenido(String contenido){
		this.contenido = contenido;
	}
	
	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getContenido().contains(contenido);
	}
}
