

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Es5Test {
	
	List<Integer> lista;

	@Before
	public void setUp() throws Exception {
		lista = new ArrayList<>();
	}

	@Test
	public void testListaDecrescente() {
		lista.add(10);
		lista.add(9);
		lista.add(8);
		lista.add(7);
		
		assertEquals(true, Es5.isStrettamenteDecrescente(lista));
	}
	
	@Test
	public void testListaUnElemento() {
		lista.add(10);
		
		assertEquals(true, Es5.isStrettamenteDecrescente(lista));
	}
	
	@Test
	public void testListaZeroElementi() {
		assertEquals(true, Es5.isStrettamenteDecrescente(lista));
	}

}
