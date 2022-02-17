package es3;

import static org.junit.Assert.assertEquals;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import es4.Persona;

public class Es3Test {
	
	Es3 es3;
	Persona mario;
	Persona giacomo; 
	Persona antonio;
	Persona zorro;
	TreeSet<Persona> personeNonOrdinate;
	
	
	@Before
	public void setup() {
		this.es3 = new Es3();
		this.mario = new Persona("mario");;
		this.giacomo = new Persona("giacomo");
		this.antonio = new Persona("antonio");
		this.zorro = new Persona("zorro");
		this.personeNonOrdinate = new TreeSet<>(new Comparator<Persona>() {
			public int compare(Persona o1, Persona o2) {
				return o1.hashCode();
			};
		});
	}
	
	@Test
	public void testPersoneOrdineAlfabetico() {
		TreeSet<Persona> personeOrdinate = new TreeSet<>(new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona that) {
				return p1.getNome().compareTo(that.getNome());
			}
		});
		personeOrdinate.add(antonio);
		personeOrdinate.add(giacomo);
		personeOrdinate.add(mario);
		personeOrdinate.add(zorro);
		assertEquals(personeOrdinate, es3.ordinatorePersone(personeOrdinate));
	}

}
