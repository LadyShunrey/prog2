package parcial2022;

import java.util.ArrayList;

public abstract class ElementoPortal {
	public abstract String getCategoria();
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract ArrayList<Noticia> buscarNoticiasPorFiltro(Filtro f1);
}
