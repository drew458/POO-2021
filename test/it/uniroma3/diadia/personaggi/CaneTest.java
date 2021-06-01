package it.uniroma3.diadia.personaggi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;

public class CaneTest {

	Partita partita;
	Labirinto labirinto;
	Cane cane;
	
	@Before
	public void setUp() throws Exception {
		this.cane = new Cane("jack", "sono arrabbiato!");
		this.labirinto = new Labirinto();
		this.partita = new Partita(this.labirinto);
		this.partita.setCfu(10);
	}

	@Test
	public void testAgisci() {
		this.cane.agisci(partita);
		assertEquals(9, this.partita.getCfu());
	}
	
	@Test
	public void testAgisciNoCfu() {
		this.partita.setCfu(0);
		this.cane.agisci(partita);
		assertEquals(0, this.partita.getCfu());
	}
	
	@Test
	public void testAgisciCfuNegativi() {
		this.partita.setCfu(-2);
		this.cane.agisci(partita);
		assertEquals(-2, this.partita.getCfu());
	}

}
