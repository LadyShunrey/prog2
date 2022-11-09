package recuperatorio2021tema1;

import java.util.ArrayList;

public abstract class ElementoHotel {
	public abstract ArrayList<Habitacion> getHabitacionesDisponibles();
	public abstract int totalHabitacionesCondicion(Filtro filtro);
	public abstract double getDimensionTotal();
	public abstract ArrayList<Habitacion> buscarHabitacionFiltro(Filtro filtro);
}
