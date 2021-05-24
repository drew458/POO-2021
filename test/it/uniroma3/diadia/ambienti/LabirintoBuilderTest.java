package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class LabirintoBuilderTest {
	
	private static final String NOME_STANZA_INIZIALE = "Stanza inziale";
	private static final String NOME_STANZA_VINCENTE = "Stanza finale";
	private static final String NOME_STANZA_GENERICA = "Stanza generica";
	private static final String NOME_STANZA_GENERICA_DUE = "Stanza generica due";
	private static final String NOME_ATTREZZO = "Martello";
	
	private static final int PESO_ATTREZZO = 3;
	
	private LabirintoBuilder labirintoBuilder;

	@Before
	public void setUp() {
		this.labirintoBuilder = new LabirintoBuilder();
		
	}

	@Test
	public void testAddStanzaIniziale() {
		Stanza stanza = new Stanza(NOME_STANZA_INIZIALE);
		this.labirintoBuilder.addStanzaIniziale(NOME_STANZA_INIZIALE);
		Stanza stanzaCreata = this.labirintoBuilder.getLabirinto().getStanzaCorrente();
		assertEquals(stanza.getNome(), stanzaCreata.getNome());
	}
	
	@Test
	public void testAddStanzaInizialeNull() {
		this.labirintoBuilder.addStanzaIniziale(null);
		Stanza stanzaCreata = this.labirintoBuilder.getLabirinto().getStanzaCorrente();
		assertNull(stanzaCreata.getNome());
	}
	
	@Test
	public void testAddStanzaFinale() {
		Stanza stanza = new Stanza(NOME_STANZA_VINCENTE);
		this.labirintoBuilder.addStanzaVincente(NOME_STANZA_VINCENTE);
		Stanza stanzaCreata = this.labirintoBuilder.getLabirinto().getStanzaVincente();
		assertEquals(stanza.getNome(), stanzaCreata.getNome());
	}
	
	@Test
	public void testAddStanzaFinaleNull() {
		this.labirintoBuilder.addStanzaVincente(null);
		Stanza stanzaCreata = this.labirintoBuilder.getLabirinto().getStanzaVincente();
		assertNull(stanzaCreata.getNome());
	}
	
	@Test
	public void testAddStanza() {
		Map<String, Stanza> nome2stanza = new HashMap<>();
		Stanza stanza = new Stanza(NOME_STANZA_GENERICA);
		nome2stanza.put(NOME_STANZA_GENERICA, stanza);
		this.labirintoBuilder.addStanza(NOME_STANZA_GENERICA);
		assertEquals(nome2stanza.get(NOME_STANZA_GENERICA).getNome(), this.labirintoBuilder.getStanze().get(NOME_STANZA_GENERICA).getNome());
	}
	
	@Test
	public void testAddAttrezzo() {
		this.labirintoBuilder.addStanzaIniziale(NOME_STANZA_INIZIALE);
		this.labirintoBuilder.addAttrezzo(NOME_ATTREZZO, PESO_ATTREZZO);
		assertEquals(NOME_ATTREZZO, this.labirintoBuilder.getLabirinto().getStanzaCorrente().getAttrezzo(NOME_ATTREZZO).getNome());
	}
	
	@Test
	public void testAddAttrezzoDueStanze() {
		this.labirintoBuilder.addStanzaIniziale(NOME_STANZA_INIZIALE);
		this.labirintoBuilder.addStanzaVincente(NOME_STANZA_VINCENTE);
		this.labirintoBuilder.addAttrezzo(NOME_ATTREZZO, PESO_ATTREZZO);
		assertEquals(NOME_ATTREZZO, this.labirintoBuilder.getStanze().get(NOME_STANZA_VINCENTE).getAttrezzo(NOME_ATTREZZO).getNome());
	}
	
	@Test
	public void testAddAttrezzoQuattroStanze() {
		this.labirintoBuilder.addStanza(NOME_STANZA_INIZIALE);
		this.labirintoBuilder.addStanza(NOME_STANZA_VINCENTE);
		this.labirintoBuilder.addStanza(NOME_STANZA_GENERICA);
		this.labirintoBuilder.addStanza(NOME_STANZA_GENERICA_DUE);
		this.labirintoBuilder.addAttrezzo(NOME_ATTREZZO, PESO_ATTREZZO);
		assertEquals(NOME_ATTREZZO, this.labirintoBuilder.getStanze().get(NOME_STANZA_GENERICA_DUE).getAttrezzo(NOME_ATTREZZO).getNome());
	}
	
	@Test
	public void testAddAttrezzoStanzaNonUltima() {
		this.labirintoBuilder.addStanza(NOME_STANZA_INIZIALE);
		this.labirintoBuilder.addStanza(NOME_STANZA_VINCENTE);
		this.labirintoBuilder.addStanza(NOME_STANZA_GENERICA);
		this.labirintoBuilder.addStanza(NOME_STANZA_GENERICA_DUE);
		this.labirintoBuilder.addAttrezzo(NOME_ATTREZZO, PESO_ATTREZZO);
		assertNull(this.labirintoBuilder.getStanze().get(NOME_STANZA_VINCENTE).getAttrezzo(NOME_ATTREZZO));
	}

}