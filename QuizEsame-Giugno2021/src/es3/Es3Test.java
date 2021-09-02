package es3;

import static org.junit.Assert.*;

import java.io.Serial;
import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import es4.Persona;

public class Es3Test {
	
	Es3 es3;
	Persona mario = new Persona("mario");;
	Persona giacomo = new Persona("giacomo");
	Persona antonio = new Persona("antonio");
	Persona zorro = new Persona("zorro");
	TreeSet<Persona> personeNonOrdinate = new TreeSet<>(new Comparator<Persona>() {
		public int compare(Persona o1, Persona o2) {
			return o1.hashCode();
		};
	});

	@Test
	public void testPersoneOrdineAlfabetico() {
		TreeSet<Persona> personeOrdinate = new TreeSet<>();
		personeOrdinate.add(antonio);
		personeOrdinate.add(giacomo);
		personeOrdinate.add(mario);
		personeOrdinate.add(zorro);
		assertEquals(personeOrdinate, es3.ordinatorePersone(personeNonOrdinate));
	}

}
