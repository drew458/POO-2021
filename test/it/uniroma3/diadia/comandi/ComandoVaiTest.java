package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class ComandoVaiTest {
	
	private static final String DIREZIONE_NORD_OVEST = "nordovest";
	private static final String DIREZIONE_NORD = "nord";
	
	private Comando comandoDaEseguire;
	private Partita partita;
	private Stanza stanzaIniziale;

	@Before
	public void setUp() throws Exception {
		this.comandoDaEseguire = new ComandoVai();
		this.partita = new Partita();
		this.stanzaIniziale = new Stanza("stanza iniziale");
		this.partita.setStanzaCorrente(this.stanzaIniziale);
		this.comandoDaEseguire.setIO(new IOConsole());
	}
		
	@Test
	public void testEseguiDirezioneInesistenteStanzaNonPresente() {
		this.comandoDaEseguire.setParametro(DIREZIONE_NORD_OVEST);
		this.comandoDaEseguire.esegui(this.partita);
		assertEquals("stanza iniziale", this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testEseguiDirezioneInesistenteStanzaPresente() {
		Stanza stanzaVincente = new Stanza("stanza vincente");
		this.stanzaIniziale.impostaStanzaAdiacente(DIREZIONE_NORD, stanzaVincente);
		this.comandoDaEseguire.setParametro(DIREZIONE_NORD_OVEST);
		this.comandoDaEseguire.esegui(this.partita);
		assertEquals("stanza iniziale", this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testEseguiDirezioneNull() {
		this.comandoDaEseguire.setParametro(null);
		this.comandoDaEseguire.esegui(this.partita);
		assertEquals("stanza iniziale", this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testVaiStanzaNonPresente() {
		this.comandoDaEseguire.setParametro(DIREZIONE_NORD);
		this.comandoDaEseguire.esegui(this.partita);
		assertEquals("stanza iniziale", this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testEseguiStanzaPresente() {
		Stanza stanzaVincente = new Stanza("stanza vincente");
		this.stanzaIniziale.impostaStanzaAdiacente(DIREZIONE_NORD, stanzaVincente);
		this.comandoDaEseguire.setParametro(DIREZIONE_NORD);
		this.comandoDaEseguire.esegui(this.partita);
		assertEquals("stanza vincente", this.partita.getStanzaCorrente().getNome());
	}

}
