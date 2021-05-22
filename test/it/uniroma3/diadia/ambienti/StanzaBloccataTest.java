package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBloccataTest {
	
	private static final String NOME_STANZA_BLOCCATA = "stanza bloccata";
	private static final String NOME_STANZA_ADIACENTE = "stanza adiacente";
	
	private static final String NOME_DIREZIONE_BLOCCATA = "nord";
	
	private static final String NOME_ATTREZZO_SBLOCCA = "passepartout";
	private static final String NOME_ATTREZZO_SBLOCCA_SBAGLIATO = "torcia";
	private static final String NOME_ATTREZZO_PASSEPARTOUT = "passepartout";
	
	private static final String STANZA_BLOCCATA_RETURN = "Qui è tutto bloccato!";
	private static final String GET_DESCRIZIONE_RETURN = "stanza bloccata\n" + "Uscite: [nord]\n" + "Attrezzi nella stanza: [passepartout (2kg)]";
	
	private StanzaBloccata stanzaBloccata;
	private Stanza stanzaAdiacente;
	private Attrezzo attrezzoPassepartout;

	@Before
	public void setUp() throws Exception {
		this.attrezzoPassepartout = new Attrezzo(NOME_ATTREZZO_PASSEPARTOUT, 2);
		this.stanzaBloccata = new StanzaBloccata(NOME_STANZA_BLOCCATA, NOME_DIREZIONE_BLOCCATA, NOME_ATTREZZO_SBLOCCA);
		this.stanzaAdiacente = new Stanza(NOME_STANZA_ADIACENTE);
		this.stanzaBloccata.impostaStanzaAdiacente(NOME_DIREZIONE_BLOCCATA, stanzaAdiacente);
	}

	@Test
	public void testGetStanzaAdiacenteAttrezzoGiusto() {
		this.stanzaBloccata.addAttrezzo(attrezzoPassepartout);
		assertEquals(this.stanzaAdiacente, this.stanzaBloccata.getStanzaAdiacente(NOME_DIREZIONE_BLOCCATA));
	}
	
	@Test
	public void testGetStanzaAdiacenteAttrezzoSbagliato() {
		Attrezzo attrezzoSbagliato = new Attrezzo(NOME_ATTREZZO_SBLOCCA_SBAGLIATO, 5); 
		this.stanzaBloccata.addAttrezzo(attrezzoSbagliato);
		assertEquals(this.stanzaBloccata, this.stanzaBloccata.getStanzaAdiacente(NOME_DIREZIONE_BLOCCATA));
	}
	
	@Test
	public void testGetStanzaAdiacenteSenzaAttrezzo() {
		assertEquals(this.stanzaBloccata, this.stanzaBloccata.getStanzaAdiacente(NOME_DIREZIONE_BLOCCATA));
	}
	
	@Test
	public void testGetDescrizioneStanzaNonBloccata() {
		this.stanzaBloccata.addAttrezzo(attrezzoPassepartout);
		assertEquals(GET_DESCRIZIONE_RETURN, this.stanzaBloccata.getDescrizione());
	}
	
	@Test
	public void testGetDescrizioneStanzaBloccata() {
		assertEquals(STANZA_BLOCCATA_RETURN, this.stanzaBloccata.getDescrizione());
	}
	
	@Test
	public void testGetDescrizioneStanzaBloccataConAttrezzoSbagliato() {
		Attrezzo attrezzoSbagliato = new Attrezzo(NOME_ATTREZZO_SBLOCCA_SBAGLIATO, 3);
		this.stanzaBloccata.addAttrezzo(attrezzoSbagliato);
		assertEquals(STANZA_BLOCCATA_RETURN, this.stanzaBloccata.getDescrizione());
	}

}
