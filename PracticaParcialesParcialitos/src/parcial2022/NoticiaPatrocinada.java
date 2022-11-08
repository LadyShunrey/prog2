package parcial2022;

import java.util.ArrayList;

public class NoticiaPatrocinada extends Noticia {

	public NoticiaPatrocinada(String contenido, String titulo, String autor, String categoria) {
		super(contenido, titulo, autor, categoria);
	}

	@Override
	public ArrayList<Noticia> buscarNoticiasPorFiltro(Filtro f1){
		ArrayList<Noticia> noticiasEncontradas = new ArrayList<>();
		noticiasEncontradas.add(this);
		return noticiasEncontradas;
	}
}
