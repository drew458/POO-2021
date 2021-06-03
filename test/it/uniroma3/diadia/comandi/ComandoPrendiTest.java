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

public class ComandoPrendiTest {

	private static final String NOME_ATTREZZO_INIZIALE = "attrezzo iniziale";

	private AbstractComando comandoPrendi;
	private Partita partita;



	@Before
	public void setUp() throws Exception {
		this.comandoPrendi = new ComandoPrendi();
		this.comandoPrendi.setIO(new IOConsole());
		Labirinto labirinto = new LabirintoBuilder()
				.addStanzaIniziale("iniziale")
				.getLabirinto();
		this.partita = new Partita(labirinto);
		Attrezzo attrezzo = new Attrezzo(NOME_ATTREZZO_INIZIALE, 5);
		this.partita.getStanzaCorrente().addAttrezzo(attrezzo);
	}

	@Test
	public void testEseguiAttrezzoPresente() {
		this.comandoPrendi.setParametro(NOME_ATTREZZO_INIZIALE);
		this.comandoPrendi.esegui(partita);
		assertTrue(this.partita.getGiocatore().getBorsa().hasAttrezzo(NOME_ATTREZZO_INIZIALE));
		assertFalse(this.partita.getStanzaCorrente().hasAttrezzo(NOME_ATTREZZO_INIZIALE));
	}

	@Test
	public void testEseguiAttrezzoNonPresente() {
		String attrezzoModificato = "attrezzo modificato";
		this.comandoPrendi.setParametro(attrezzoModificato);
		this.comandoPrendi.esegui(partita);
		assertFalse(this.partita.getGiocatore().getBorsa().hasAttrezzo(attrezzoModificato));
		assertTrue(this.partita.getStanzaCorrente().hasAttrezzo(NOME_ATTREZZO_INIZIALE));
	}

	@Test
	public void testEseguiAttrezzoNull() {
		String attrezzoModificato = null;
		this.comandoPrendi.setParametro(attrezzoModificato);
		this.comandoPrendi.esegui(partita);
		assertFalse(this.partita.getGiocatore().getBorsa().hasAttrezzo(attrezzoModificato));
		assertTrue(this.partita.getStanzaCorrente().hasAttrezzo(NOME_ATTREZZO_INIZIALE));
	}

}
