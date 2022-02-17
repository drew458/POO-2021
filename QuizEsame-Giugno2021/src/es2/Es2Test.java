package es2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Es2Test {

	Es2 esercizio2 = new Es2();

	@Test
	public void testListaStrettamenteDecrescente() {
		List<Integer> listaStrettamenteDecrescente = new ArrayList<>();
		listaStrettamenteDecrescente.add(18);
		listaStrettamenteDecrescente.add(23);
		listaStrettamenteDecrescente.add(8);
		listaStrettamenteDecrescente.add(4);
		listaStrettamenteDecrescente.add(3);
		listaStrettamenteDecrescente.add(2);
		listaStrettamenteDecrescente.add(1);
		listaStrettamenteDecrescente.add(0);
		
		assertFalse(esercizio2.isStrettamenteCrescente(listaStrettamenteDecrescente));
	}
	
	@Test
	public void testListaStrettamenteCrescente() {
		List<Integer> listaStrettamenteCrescente = new ArrayList<>();
		listaStrettamenteCrescente.add(1);
		listaStrettamenteCrescente.add(2);
		listaStrettamenteCrescente.add(3);
		listaStrettamenteCrescente.add(4);
		listaStrettamenteCrescente.add(5);
		listaStrettamenteCrescente.add(6);
		listaStrettamenteCrescente.add(13);
		listaStrettamenteCrescente.add(18);
		
		assertTrue(esercizio2.isStrettamenteCrescente(listaStrettamenteCrescente));
	}

}
