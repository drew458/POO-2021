package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBuiaTest {
	
	private static final String NOME_ATTREZZO_LANTERNA = "lanterna";
	private static final String NOME_STANZA_BUIA = "stanza buia";
	private static final String STANZA_NONBUIA_RETURN = "stanza buia\n" + "Uscite: []\n" + "Attrezzi nella stanza: [lanterna (4kg)]";
	private static final String STANZA_BUIA_RETURN = "Qui c'è buio pesto";
	
	private StanzaBuia stanzaBuia;
	private Attrezzo attrezzoLanterna;

	@Before
	public void setUp() throws Exception {
		this.attrezzoLanterna = new Attrezzo(NOME_ATTREZZO_LANTERNA, 4);
	}
	
	@Test
	public void testGetDescrizioneStanzaNonBuia() {
		this.stanzaBuia = new StanzaBuia(NOME_STANZA_BUIA, NOME_ATTREZZO_LANTERNA);
		this.stanzaBuia.addAttrezzo(attrezzoLanterna);
		assertEquals(STANZA_NONBUIA_RETURN, this.stanzaBuia.getDescrizione());
		
	}
	
	@Test
	public void testGetDescrizioneStanzaBuia() {
		this.stanzaBuia = new StanzaBuia(NOME_STANZA_BUIA, NOME_ATTREZZO_LANTERNA);
		assertEquals(STANZA_BUIA_RETURN, this.stanzaBuia.getDescrizione());
	}
	
	@Test
	public void testGetDescrizioneStanzaBuiaConAttrezzoSbagliato() {
		this.stanzaBuia = new StanzaBuia(NOME_STANZA_BUIA, NOME_ATTREZZO_LANTERNA);
		Attrezzo attrezzoSbagliato = new Attrezzo("attrezzo sbagliato", 5);
		this.stanzaBuia.addAttrezzo(attrezzoSbagliato);
		assertEquals(STANZA_BUIA_RETURN, this.stanzaBuia.getDescrizione());
	}

}
