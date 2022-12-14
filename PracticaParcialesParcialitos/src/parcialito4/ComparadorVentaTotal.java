package parcialito4;

import java.time.LocalDate;

public class ComparadorVentaTotal extends ComparadorVendedor{

	public ComparadorVentaTotal(LocalDate inicio, LocalDate fin) {
		super(inicio, fin);
	}

	@Override
	public int compare(Vendedor v1, Vendedor v2) {
		//return (int) (v1.ventasTotales(inicio, fin) - v2.ventasTotales(inicio, fin));
	
		/*Si no te acord?s c?mo hacerlo podes hacer lo siguiente*/
		double ventas1 = v1.ventasTotales(getInicio(),getFin());
		double ventas2 = v2.ventasTotales(getInicio(),getFin());
		if(ventas1<ventas2){
			return -1;
		}
		else if(ventas1>ventas2){
			return 1; //es exactamente lo mismo poder return 54789 (cualquier numero positivo)
		}
		return 0;
	}
	
}
