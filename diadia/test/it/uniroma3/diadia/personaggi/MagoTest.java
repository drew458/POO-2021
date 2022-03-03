package it.uniroma3.diadia.personaggi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class MagoTest {
	
	private static final String NOME_MAGO = "Merlino";
	private static final String DESCRIZIONE_MAGO= "Posso fare delle magie";
	private static final String NOME_ATTREZZO = "Spada";
	
	Labirinto labirinto;
	Partita partita;
	Attrezzo attrezzo;
	Mago mago;

	@Before
	public void setUp() throws Exception {
		this.labirinto = new Labirinto();
		this.partita = new Partita(labirinto);
		this.attrezzo = new Attrezzo(NOME_ATTREZZO, 4);
		this.mago = new Mago(NOME_MAGO, DESCRIZIONE_MAGO, attrezzo);
	}

	@Test
	public void testAgisci() {
		this.mago.agisci(this.partita);
		assertTrue(this.partita.getGiocatore().getBorsa().hasAttrezzo(NOME_ATTREZZO));
	}
	
	@Test
	public void testAgisciAttrezzoNullo() {
		String MESSAGGIO_SCUSE = "Mi spiace, ma non ho piu' nulla...";
		this.mago = new Mago(NOME_MAGO, DESCRIZIONE_MAGO, null);
		this.mago.agisci(this.partita);
		assertEquals(MESSAGGIO_SCUSE, this.mago.agisci(partita));
	}

}
