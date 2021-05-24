package it.uniroma3.diadia;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.LabirintoBuilder;
import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {
	
	private Partita partita;
	private Labirinto labirinto;
	
	@Before
	public void setUp() {
		this.partita = new Partita(this.labirinto);
		this.labirinto = new LabirintoBuilder()
				.addStanzaIniziale("iniziale")
				.addStanzaVincente("vincente")
				.getLabirinto();
	}
	
	@Test
	public void testNonVintaDiDefault () {
		assertFalse(this.partita.vinta());
	}

	@Test
	public void testVintaConStanzaVincente() {
		this.partita.setStanzaCorrente(this.partita.getStanzaVincente());
		assertTrue(this.partita.vinta());
	}
	
	@Test
	public void testVintaConStanzaNonVincente() {
		this.partita.setStanzaCorrente(new Stanza("bagno"));
		assertFalse(this.partita.vinta());
	}
	
	@Test
	public void testVinta() {
		Stanza bagno = new Stanza("bagno");
		this.partita.setStanzaCorrente(bagno);
		assertFalse(this.partita.vinta());
	}
	
	@Test
	public void testFinitaSeCfuFiniti() {
		this.partita.setCfu(0);
		assertTrue(this.partita.isFinita());
	}
	
	@Test
	public void testFinitaSeCfuNonFiniti() {
		this.partita.setCfu(3);
		assertFalse(this.partita.isFinita());
	}
	
	@Test
	public void testFinitaSePartitaVinta() {
		this.partita.setStanzaCorrente(this.partita.getStanzaVincente());
		assertTrue(this.partita.isFinita());
	}
	
	@Test
	public void testFinitaSeFinita() {
		this.partita.setFinita();
		assertTrue(this.partita.isFinita());
	}

}
