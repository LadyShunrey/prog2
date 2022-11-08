package parcial2022;

public class Main {

	public static void main(String[] args) {
		PortalNoticias portal = new PortalNoticias("El Portal");
		
		Noticia n1 = new Noticia("1 Este es el contenido", "Este es el policia titulo", "Este es el autor", "Sociales");
		Noticia n2 = new Noticia("2 Este es el contenido", "Este es el titulo", "Este es el autor", "Esta es la categoria");
		Noticia n3 = new Noticia("3 Este es en 1930 el contenido", "Este es el tandil titulo", "Ricardo Ruben", "Esta es la categoria");
		Noticia n4 = new Noticia("4 Este es en 1930 el contenido", "Este es el titulo", "Ricardo Ruben", "Esta es la categoria");
		Noticia n5 = new Noticia("5 Este es en 1930 el contenido", "Este es el policia titulo", "Este es el autor", "Esta es la categoria");
		Noticia n6 = new Noticia("6 Este es el contenido", "Este es el tandil titulo", "Ricardo Ruben", "Esta es la categoria");
		Noticia n7 = new Noticia("7 Este es el contenido", "Este es el policia titulo", "Este es el autor", "Sociales");
		Noticia n8 = new Noticia("8 Este es el contenido", "Este es el policia titulo", "Este es el autor", "Sociales");
		Noticia n9 = new NoticiaPatrocinada(" PATROCINADA 9 Este  el contenido", "Este es el titulo", "456", "Esta es la categoria");
		Noticia n10 = new NoticiaPatrocinada("PATROCINADA 10 Este es el contenido", "Este es el  titulo", "456", "Esta es la categoria");
		Noticia n11 = new Noticia("11 Este es el contenido de la noticia deportiva", "Noticia Deportiva", "Ernesto Cherq", "Deportes");
		
		n1.addPalabraClave("zzzz");
		n1.addPalabraClave("gggg");
		n1.addPalabraClave("aaa");
		n1.addPalabraClave("ccccc");
		n1.addPalabraClave("aaa");
		n1.addPalabraClave("bbbb");
		n1.addPalabraClave("iiiii");
		n8.addPalabraClave("zzzz");
		n8.addPalabraClave("gggg");
		n8.addPalabraClave("aaa");
		n8.addPalabraClave("ccccc");
		n8.addPalabraClave("aaa");
		n8.addPalabraClave("bbbb");
		n8.addPalabraClave("iiiii");
		n8.addPalabraClave("rrrrr");
		n8.addPalabraClave("yyyyy");
		n8.addPalabraClave("asdasdad");
		
		Seccion s1 = new Seccion(0, "Sin Definir");
		Seccion s2 = new Seccion(1, "Sin Definir");
		Seccion s3 = new Seccion(5, "Sin Definir");
		Seccion s4 = new SeccionEspecial("ultimo momento", 5);
		Seccion s5 = new SeccionEspecial("Qatar 2022", 3);
		
		s1.addElemento(n1);
		s1.addElemento(n2);
		
		s2.addElemento(n3);
		s2.addElemento(n4);
		s2.addElemento(s3);
		
		s3.addElemento(n5);
		s3.addElemento(n6);
		s3.addElemento(s4);
		
		s4.addElemento(n8);
		s4.addElemento(n11);
		
		s5.addElemento(n8);
		s5.addElemento(n9);
		s5.addElemento(n10);
		
		portal.addElemento(s1);
		portal.addElemento(s2);
		portal.addElemento(n7);
		portal.addElemento(s4);
		portal.addElemento(s5);
		
		Filtro f1 = new FiltroTitulo("policia");
		Filtro f2 = new FiltroTitulo("tandil");
		Filtro f3 = new FiltroContenido("en 1930");
		Filtro f4 = new FiltroCategoria("Sociales");
		Filtro f5 = new FiltroAutor("Ricardo Ruben");
		Filtro f6 = new FiltroAND(f1, f4);
		Filtro f7 = new FiltroCategoria("Deportes");
		
		
		System.out.println("Noticias con el filtro titulo policia");
		System.out.println(portal.buscarNoticias(f1));
		
		System.out.println("Noticias con el filtro titulo tandil");
		System.out.println(portal.buscarNoticias(f2));
		
		System.out.println("Noticias con el filtro contenido en 1930");
		System.out.println(portal.buscarNoticias(f3));
		
		System.out.println("Noticias con el filtro categoria Sociales");
		System.out.println(portal.buscarNoticias(f4));
		
		System.out.println(s1.getCategoria());
		System.out.println(s2.getCategoria());
		System.out.println(s3.getCategoria());
		
		System.out.println("Noticias con el filtro autor Ricardo Ruben");
		System.out.println(portal.buscarNoticias(f5));
		
		System.out.println("Noticias con ambos filtros titulo policia y categoria sociales");
		System.out.println(portal.buscarNoticias(f6));
		
		System.out.println("Las palabras claves de la noticia 1 son: " + n1.getPalabrasClaves());
		
		System.out.println("Las palabras claves de la noticia 8 son: " + n8.getPalabrasClaves());
		
		System.out.println("Las palabras claves de la seccion especial 4 de categoria: "+s4.getCategoria()+" son: " + s4.getPalabrasClaves());
		
		System.out.println("Las palabras claves de la seccion especial 5 de categoria: "+s5.getCategoria()+" son: " + s5.getPalabrasClaves());
		
		System.out.println("Noticias con el filtro categoria Deportes: ");
		System.out.println(portal.buscarNoticias(f7));
		
	}

}
