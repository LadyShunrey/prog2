package recuperatorio2021tema1;

public class Main {
	public static void main(String[]args){
		Filtro filtroMetros = new FiltroSuperficieMayorQue(12.0);
		Filtro filtroComodidad = new FiltroComodidades("aire acondicionado");
		
		Ordenador ordenMetros = new OrdenadorSuperficieMayor();
		
		CadenaHotelera hilton = new CadenaHotelera("Hilton");
		
		Agrupacion a1 = new Agrupacion();
		Agrupacion a2 = new Agrupacion();
		
		Habitacion h1 = new Habitacion(1, 12.3, 3, null, false);
		Habitacion h2 = new Habitacion(2, 30.3, 3, null, false);
		Habitacion h3 = new Habitacion(3, 13.3, 3, null, false);
		
		h2.addComodidad("vista al mar");
		h2.addComodidad("aire acondicionado");
		h3.addComodidad("aire acondicionado");
		
		a1.addElemento(h1);
		a1.addElemento(h2);
		
		a2.addElemento(h3);
		
		hilton.addElemento(a1);
		hilton.addElemento(a2);
		
		System.out.println(hilton.buscarHabitacionFiltro(filtroMetros, ordenMetros));
		
		System.out.println(hilton.buscarHabitacionFiltro(filtroComodidad, ordenMetros));
		
		System.out.println(hilton.getDimensionTotal());
	}
}