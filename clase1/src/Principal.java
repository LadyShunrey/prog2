
public class Principal {
	
	public static void main (String[] args){
		
		Avion air314 = new Avion();
		Avion air315 = new Avion(10);
		Avion air316 = new Avion(10, 20, 5, "celeste");
		
		System.out.println(air314.getColor());
		System.out.println(air315.getColor());
		System.out.println(air316.getColor());
		System.out.println(air316.getBalance());
		System.out.println(air314);
		System.out.println(air315);
		System.out.println(air316);
		
		System.out.println(air316.getPiloto().getNombre());
	}
	
}
