import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

	private List<String> vuota;
	private List<String> singoletto;
	private String solitario;

	@Before
	public void setUp() {
		this.vuota = new ArrayList<>();
		this.singoletto = new ArrayList<String>();
		this.solitario = new String("solitario");
		this.singoletto.add(this.solitario);
	}

	@Test
	public void testHasNext_noListaVuota() {
		Iterator<String> it = this.vuota.iterator();
		assertNotNull(it);
		assertFalse(it.hasNext());
	}

	@Test
	public void testHasNext_primaSiPoiNoSuSingoletto() {
		Iterator<String> it = this.singoletto.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		it.next();
		assertFalse(it.hasNext());
	}

	@Test
	public void testNext_singoletto() {
		Iterator<String> it = this.singoletto.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		assertSame(this.solitario, it.next());
	}

	@Test 
	public void testNext_suListaDiDueElementi() {
		List<String> doppietta = new ArrayList<>();
		doppietta.add(new String("primo"));
		doppietta.add(new String("secondo"));
		Iterator<String> it = doppietta.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		assertEquals("primo", it.next());
		assertTrue(it.hasNext());
		assertEquals("secondo", it.next());
		assertFalse(it.hasNext());
	}

	@Test(expected = NoSuchElementException.class)
	public void testNext_oltreLaFineSollevaEccezione() {
		Iterator<String> it = this.vuota.iterator();
		it.next();
	}
	
	@Test 
	public void testRemove() {
	 Iterator<String> it = 
	this.singoletto.iterator();
	 String solitario = it.next();
	 assertFalse(this.singoletto.isEmpty());
	 it.remove();
	 assertTrue(this.singoletto.isEmpty());
	}
}
