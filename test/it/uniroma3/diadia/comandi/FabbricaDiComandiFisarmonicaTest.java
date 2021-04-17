package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.IO;

public class FabbricaDiComandiFisarmonicaTest {
	
	private final static String COMANDO_VAI = "vai nord";
	private final static String COMANDO_PRENDI = "prendi martello";
	private final static String COMANDO_POSA = "prendi ascia";
	private final static String COMANDO_AIUTO = "aiuto";
	private final static String COMANDO_FINE = "fine";
	private final static String COMANDO_GUARDA = "guarda";
	private final static String COMANDO_NON_VALIDO = "ciao";
	
	private final static String COMANDO_VAI_RETURN = "vai";
	private final static String COMANDO_PRENDI_RETURN = "prendi";
	private final static String COMANDO_POSA_RETURN = "prendi";
	private final static String COMANDO_AIUTO_RETURN = "aiuto";
	private final static String COMANDO_FINE_RETURN = "fine";
	private final static String COMANDO_GUARDA_RETURN = "guarda";
	private final static String COMANDO_NON_VALIDO_RETURN = "non valido";
	
	
	private FabbricaDiComandiFisarmonica factory;
	private IO io;
	

	@Before
	public void setUp() throws Exception {
		this.factory = new FabbricaDiComandiFisarmonica();
	}

	@Test
	public void testCostruisciComandoVai() {
		Comando comando = this.factory.costruisciComando(COMANDO_VAI, io);
		assertEquals(COMANDO_VAI_RETURN, comando.getNome());
	}
	
	@Test
	public void testCostruisciComandoPrendi() {
		Comando comando = this.factory.costruisciComando(COMANDO_PRENDI, io);
		assertEquals(COMANDO_PRENDI_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoPosa() {
		Comando comando = this.factory.costruisciComando(COMANDO_POSA, io);
		assertEquals(COMANDO_POSA_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoAiuto() {
		Comando comando = this.factory.costruisciComando(COMANDO_AIUTO, io);
		assertEquals(COMANDO_AIUTO_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoFine() {
		Comando comando = this.factory.costruisciComando(COMANDO_FINE, io);
		assertEquals(COMANDO_FINE_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoGuarda() {
		Comando comando = this.factory.costruisciComando(COMANDO_GUARDA, io);
		assertEquals(COMANDO_GUARDA_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoNonValido() {
		Comando comando = this.factory.costruisciComando(COMANDO_NON_VALIDO, io);
		assertEquals(COMANDO_NON_VALIDO_RETURN, comando.getNome());	}

}
