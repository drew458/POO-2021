package contatori;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerificaDuplicatiTest {	
	
	@Test(timeout=200)
	public void testVerificaDuplicatiTuttiNulli() {
		Persone persone = new Persone(3);
		assertFalse(persone.verificaDuplicati("paolo"));
	}
	
	@Test(timeout=200)
	public void testVerificaDuplicatiDuePaolo() {
		Persone persone = new Persone(3);
		persone.aggiungiNome("paolo",0);
		persone.aggiungiNome("damiano", 1);
		persone.aggiungiNome("paolo", 2);
		assertTrue(persone.verificaDuplicati("paolo"));
	}
	
	@Test(timeout=200)
	public void testVerificaDuplicatiNonDuePaolo() {
		Persone persone = new Persone(3);
		persone.aggiungiNome("paolo",0);
		persone.aggiungiNome("damiano", 1);
		persone.aggiungiNome("fabrizio", 2);
		assertFalse(persone.verificaDuplicati("paolo"));
	}
	
	@Test(timeout=200)
	public void testVerificaDuplicatiDuePaoloConNulli() {
		Persone persone = new Persone (5);
		persone.aggiungiNome("paolo",0);
		persone.aggiungiNome("damiano", 3);
		persone.aggiungiNome("paolo", 4);
		assertTrue(persone.verificaDuplicati("paolo"));
	}

}
