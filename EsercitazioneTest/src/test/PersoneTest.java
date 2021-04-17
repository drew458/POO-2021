package test;

import static org.junit.Assert.*;

import org.junit.Test;

import esercitazione.Persone;

public class PersoneTest {

	@Test
	public void testOmonimiPersoneVuote() {
		assertEquals(0, persone().contaOmonimiDi("Alice"));
	}
	
	@Test
	public void testUnOmonimo() {
		assertEquals(1, persone("Alice").contaOmonimiDi("Alice"));
	}
	
	@Test
	public void testZeroOmonimi() {
		assertEquals(0, persone("Bob", "Carlo").contaOmonimiDi("Alice"));
	}


	private Persone persone(String... nomi) {
		Persone p = new Persone(nomi.length);
		for(int i=0; i<nomi.length; i++)
			p.aggiungiNome(i, nomi[i]);
		return p;
	}
	
}