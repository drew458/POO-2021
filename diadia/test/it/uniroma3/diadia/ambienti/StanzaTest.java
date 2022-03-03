package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	
	private Stanza stanza;
	private Stanza bagno = new Stanza("bagno");

	@Before
	public void setUp() {
		this.stanza = new Stanza("stanza");
	}

	@Test
	public void testImpostaStanzaAdiacente() {
		this.stanza.impostaStanzaAdiacente("nord", bagno);
		assertEquals(bagno, this.stanza.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testImpostaStanzaAdiacenteUnCambio() {
		this.bagno = new Stanza("bagno");
		Stanza cucina = new Stanza("cucina");
		this.stanza.impostaStanzaAdiacente("nord", bagno);
		this.stanza.impostaStanzaAdiacente("nord", cucina);
		assertEquals(cucina, this.stanza.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testImpostaStanzaAdiacenteDueCambi() {
		this.bagno = new Stanza("bagno");
		Stanza cucina = new Stanza("cucina");
		Stanza ripostiglio = new Stanza("ripostiglio");
		this.stanza.impostaStanzaAdiacente("nord", bagno);
		this.stanza.impostaStanzaAdiacente("nord", cucina);
		this.stanza.impostaStanzaAdiacente("nord", ripostiglio);
		assertEquals(ripostiglio, this.stanza.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testGetStanzaAdiacenteNonEsiste() {
		assertNull(this.stanza.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testGetStanzaAdiacenteDirezioneInesistente() {
		assertNull(this.stanza.getStanzaAdiacente("sudovest"));
	}
	
	@Test
	public void testAddAttrezzo() {
		Attrezzo martello = new Attrezzo("martello", 5);
		this.bagno.addAttrezzo(martello);
		assertEquals(martello, this.bagno.getAttrezzo("martello"));
	}
	
	@Test
	public void testAddAttrezzoMultiplo() {
		Attrezzo martello = new Attrezzo("martello", 5);
		Attrezzo spada = new Attrezzo("spada", 7);
		this.bagno.addAttrezzo(martello);
		this.bagno.addAttrezzo(spada);
		assertEquals(spada, this.bagno.getAttrezzo("spada"));
	}
	
	@Test
	public void testHasAttrezzoPresente() {
		Attrezzo martello = new Attrezzo("martello", 5);
		this.bagno.addAttrezzo(martello);
		assertTrue(this.bagno.hasAttrezzo("martello"));
	}
	
	@Test
	public void testHasAttrezzoStanzaVuota() {
		assertFalse(this.bagno.hasAttrezzo("spada"));
	}
	
	@Test
	public void testHasAttrezzoAssente() {
		Attrezzo martello = new Attrezzo("martello", 5);
		this.bagno.addAttrezzo(martello);
		assertFalse(this.bagno.hasAttrezzo("spada"));
	}
	
}
