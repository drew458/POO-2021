package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagicaTest {
	
	private static final String NOME_ATTREZZO = "chiave";
	private static final String NOME_ATTREZZO_MODIFICATO = "evaihc";
	
	StanzaMagica stanzaMagica;
	StanzaMagica stanzaMagicaSoglia0;
	StanzaMagica stanzaMagicaSoglia2;
	Attrezzo attrezzo;

	@Before
	public void setUp() throws Exception {
		this.stanzaMagica = new StanzaMagica("stanza magica");
		this.stanzaMagicaSoglia0 = new StanzaMagica("stanza magica con soglia", 0);
		this.stanzaMagicaSoglia2 = new StanzaMagica("stanza magica con soglia", 2);
		this.attrezzo = new Attrezzo(NOME_ATTREZZO, 2);
	}

	@Test
	public void testAddAttrezzoEsistente() {
		this.stanzaMagica.addAttrezzo(attrezzo);
		assertTrue(this.stanzaMagica.hasAttrezzo(NOME_ATTREZZO));
	}
	
	/*
	@Test
	public void testAddAttrezzoNullo() {
		this.stanzaMagica.addAttrezzo(null);
		assertFalse(this.stanzaMagica.hasAttrezzo(NOME_ATTREZZO));
	} */
	
	@Test
	public void testAddAttrezzoOltreSoglia0() {
		this.stanzaMagicaSoglia0.addAttrezzo(attrezzo);
		assertFalse(this.stanzaMagica.hasAttrezzo(NOME_ATTREZZO));
	}
	
	@Test
	public void testAddAttrezzoOltreSoglia2() {
		Attrezzo attrezzo1 = new Attrezzo("attrezzo 1", 3);
		Attrezzo attrezzo2 = new Attrezzo("attrezzo 2", 6);
		this.stanzaMagicaSoglia2.addAttrezzo(attrezzo1);
		this.stanzaMagicaSoglia2.addAttrezzo(attrezzo2);
		this.stanzaMagicaSoglia2.addAttrezzo(attrezzo); //quando si aggiunge questo attrezzo, la soglia della stanza è già stata raggiunta
		assertFalse(this.stanzaMagica.hasAttrezzo(NOME_ATTREZZO));
	}
	
	@Test
	public void testModificaAttrezzoEsistente() {
		Attrezzo attrezzoModificato = new Attrezzo(NOME_ATTREZZO_MODIFICATO, 4);
		Attrezzo attrezzoModificatoDaTest = this.stanzaMagica.modificaAttrezzo(attrezzo);
		assertEquals(attrezzoModificato.getNome(), attrezzoModificatoDaTest.getNome());
		assertEquals(attrezzoModificato.getPeso(), attrezzoModificatoDaTest.getPeso());
	}

}
