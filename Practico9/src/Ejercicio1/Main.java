package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
		Noticia n1 = new Noticia("noti Policial", "intro", "texto", "autor", "link");
		Noticia n2 = new Noticia("Policial", "intro", "texto", "autor", "link");
		Noticia n3 = new Noticia("nombre", "intro", "texto", "autor", "link");
		Noticia n4 = new Noticia("Deporta", "intro", "texto", "autor", "link");
		Noticia n5 = new Noticia("nombre", "intro", "texto", "autor", "link");
		Noticia n6 = new Noticia("nombre", "intro", "texto", "autor", "link");
		Noticia n7 = new Noticia("Actualidad", "intro", "texto", "autor", "link");
		Noticia n8 = new Noticia("nombre", "intro", "texto", "autor", "link");
		Noticia n9 = new Noticia("nombre", "intro", "texto", "autor", "link");
		Noticia n10 = new Noticia("Historias", "intro", "texto", "autor", "link");
		Noticia n11 = new Noticia("nombre", "intro", "texto", "autor", "link");
		Noticia n12 = new Noticia("Chistes", "intro", "texto", "autor", "link");
		Noticia n13 = new Noticia("nombre", "intro", "texto", "autor", "link");
		
//		Noticia n14 = new Noticia("nombre", "intro", "texto", "autor", "link");
//		Noticia n15 = new Noticia("nombre", "intro", "texto", "autor", "link");
		
		Categoria policiales = new Categoria("policiales","imagen");
		Categoria historias = new Categoria("historias","imagen");
		Categoria actualidad = new Categoria("actualidad","imagen");
		
		Seccion seccion1 = new Seccion("subpoliciales","imagen");
		Seccion seccion2 = new Seccion("subpoliciales","imagen");
		
		Seccion seccion3 = new Seccion("subactualidad","imagen");
		
		Seccion seccion4 = new Seccion("subsubactualidad","imagen");
		Seccion seccion5 = new Seccion("subsubactualidad","imagen");
		Seccion seccion6 = new Seccion("subsubactualidad","imagen");
		
		seccion1.addElemento(n1);
		seccion1.addElemento(n2);
		seccion1.addElemento(n3);
		
		seccion2.addElemento(n4);
		
		policiales.addElemento(seccion1);
		policiales.addElemento(seccion2);
		policiales.addElemento(n5);
		policiales.addElemento(n6);
		
		historias.addElemento(n7);
		historias.addElemento(n8);
		
		seccion4.addElemento(n9);
		seccion4.addElemento(n10);
		seccion4.addElemento(n11);
		
		seccion3.addElemento(seccion4);
		seccion3.addElemento(seccion5);
		seccion3.addElemento(seccion6);
		seccion3.addElemento(n12);
		
		actualidad.addElemento(seccion3);
		actualidad.addElemento(n13);
		
		System.out.println("La cantidad de noticias en la categoria 1 es: " + policiales.contarNoticias());
		System.out.println("La cantidad de noticias en la categoria 1 es: " + historias.contarNoticias());
		System.out.println("La cantidad de noticias en la categoria 1 es: " + actualidad.contarNoticias());
		
		
		System.out.println("La cantidad de noticias en la seccion 4 es: " + seccion4.contarNoticias());
		
		List<Seccion> lista = new ArrayList<Seccion>();
		Set<Seccion> conjunto = new HashSet<Seccion>();
		
		conjunto.addAll(lista);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
