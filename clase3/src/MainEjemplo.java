
public class MainEjemplo {
	
	public static void Imprimir(Figura ff){
		System.out.println(ff.getNombre()+": "+ff.getArea());
	}
	
	public static void main(String[]args){
		Figura ff1 = new Figura("Figura");
		Circulo cc1 = new Circulo(23);
		Rectangulo rr1 = new Rectangulo(10,15);
		
		System.out.println(cc1.getRadio());
		System.out.println(cc1.getArea());
		System.out.println(cc1.getNombre());
		
		ff1 = cc1;
		System.out.println(ff1.getArea());
		
		Imprimir(cc1);
		Imprimir(rr1);
		Imprimir(ff1);
		
		MedioCirculo medio = new MedioCirculo(10);
		
		Imprimir(medio);
	}
}
