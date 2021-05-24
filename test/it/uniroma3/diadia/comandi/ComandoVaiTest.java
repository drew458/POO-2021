package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class ComandoVaiTest {
	
	private static final String DIREZIONE_NORDOVEST = "nordovest";
	private static final String DIREZIONE_NORD = "nord";
	
	private Comando comandoDaEseguire;
	private Partita partita;
	private Stanza stanzaIniziale;

	@Before
	public void setUp() {
		this.comandoDaEseguire = new ComandoVai();
		this.partita = new Partita();
		this.stanzaIniziale = new Stanza("stanza iniziale");
		this.partita.setStanzaCorrente(this.stanzaIniziale);
		this.comandoDaEseguire.setIO(new IOConsole());
	}
	
	@Test
	public void testEseguiStanzaPresente() {
		Stanza stanzaVincente = new Stanza("stanza vincente");
		this.stanzaIniziale.impostaStanzaAdiacente(DIREZIONE_NORD, stanzaVincente);
		this.comandoDaEseguire.setParametro(DIREZIONE_NORD);
		this.comandoDaEseguire.esegui(this.partita);
		assertEquals("stanza vincente", this.partita.getStanzaCorrente().getNome());
	}
		
	@Test
	public void testEseguiDirezioneInesistenteStanzaNonPresente() {
		this.comandoDaEseguire.setParametro(DIREZIONE_NORDOVEST);
		this.comandoDaEseguire.esegui(this.partita);
		assertEquals("stanza iniziale", this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testEseguiDirezioneInesistenteStanzaPresente() {
		Stanza stanzaVincente = new Stanza("stanza vincente");
		this.stanzaIniziale.impostaStanzaAdiacente(DIREZIONE_NORD, stanzaVincente);
		this.comandoDaEseguire.setParametro(DIREZIONE_NORDOVEST);
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
	
	/*
	@Test
	public void testPartitaConComandoVai() {
		String[] comandiDaEseguire = {"vai sud", "fine"};
		LabirintoBuilder labirinto = new LabirintoBuilder();
		labirinto.addStanzaIniziale("iniziale");
		labirinto.addStanza("Aula N10");
		labirinto.addAdiacenza("iniziale", "Aula N10", "sud");
		labirinto.getLabirinto();
		IOSimulator io = Fixture.creaSimulazionePartitaEGioca(comandiDaEseguire);
		assertTrue(io.hasNextMessaggio());
		assertEquals(DiaDia.MESSAGGIO_BENVENUTO, io.nextMessaggio());
		assertTrue(io.hasNextMessaggio());
		assertContains("Aula N10", io.nextMessaggio());
		assertTrue(io.hasNextMessaggio());
		assertEquals(ComandoFine.MESSAGGIO_FINE, io.nextMessaggio());
	} */
	
	public void assertContains(String expected, String interaRiga) {
		assertTrue(interaRiga.contains(expected));
	}

}
