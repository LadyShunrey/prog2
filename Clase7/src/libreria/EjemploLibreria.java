package libreria;

public class EjemploLibreria {

	public static void main(String[] args) {
		//Producto pp = new Producto("Luis", "Luis", 0);

		Cliente c1 = new Cliente("Melisa", "Burlando", null, 1);
		
		c1.addAutorFavorito("Maggie Stiefvater");
		c1.addAutorFavorito("Tiffany Calligaris");
		c1.addAutorFavorito("MS");
		c1.addGeneroFavorito("Fantasía");
		c1.addGeneroFavorito("Aventura");
		
		Libro l1 = new Libro("Lalala", "MS", 154.2, 352, "Misterio", "Lalallalalalal");
		
		System.out.println(c1.leGusta(l1));
		
		Cliente c2ElArrayAtril = c1;
		
		System.out.println(c2ElArrayAtril.leGusta(l1));
		
		c1.setComportamiento(new ComportamientoGenero());
		
		System.out.println(c2ElArrayAtril.leGusta(l1));
	}

}
