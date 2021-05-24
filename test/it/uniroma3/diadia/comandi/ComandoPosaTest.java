package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.LabirintoBuilder;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosaTest {
	
	private static final String NOME_ATTREZZO_INIZIALE = "attrezzo iniziale";
	
	private Comando comandoPosa;
	private Partita partita;
	

	@Before
	public void setUp() throws Exception {
		this.comandoPosa = new ComandoPosa();
		this.comandoPosa.setIO(new IOConsole());
		Labirinto labirinto = new LabirintoBuilder()
				.addStanzaIniziale("iniziale")
				.getLabirinto();
		this.partita = new Partita(labirinto);
		Attrezzo attrezzoIniziale = new Attrezzo(NOME_ATTREZZO_INIZIALE, 3);
		this.partita.getGiocatore().getBorsa().addAttrezzo(attrezzoIniziale);
	}
	
	@Test
	public void testEseguiAttrezzoPresente() {
		this.comandoPosa.setParametro(NOME_ATTREZZO_INIZIALE);
		this.comandoPosa.esegui(partita);
		assertFalse(this.partita.getGiocatore().getBorsa().hasAttrezzo(NOME_ATTREZZO_INIZIALE));
		assertTrue(this.partita.getStanzaCorrente().hasAttrezzo(NOME_ATTREZZO_INIZIALE));
	}
	
	@Test
	public void testEseguiAttrezzoNonPresente() {
		String attrezzoAssente = "attrezzo modificato";
		this.comandoPosa.setParametro(attrezzoAssente);
		this.comandoPosa.esegui(partita);
		assertTrue(this.partita.getGiocatore().getBorsa().hasAttrezzo(NOME_ATTREZZO_INIZIALE));
		assertFalse(this.partita.getStanzaCorrente().hasAttrezzo(attrezzoAssente));
	}
	
	@Test
	public void testEseguiAttrezzoNull() {
		String attrezzoModificato = null;
		this.comandoPosa.setParametro(attrezzoModificato);
		this.comandoPosa.esegui(partita);
		assertTrue(this.partita.getGiocatore().getBorsa().hasAttrezzo(NOME_ATTREZZO_INIZIALE));
		assertFalse(this.partita.getStanzaCorrente().hasAttrezzo(attrezzoModificato));
	}

}
