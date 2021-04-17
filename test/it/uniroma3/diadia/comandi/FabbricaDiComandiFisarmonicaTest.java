package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.IOConsole;

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
	private IOConsole console;
	private Comando comandoVai;
	private Comando comandoPrendi;
	private Comando comandoPosa;
	private Comando ComandoAiuto;
	private Comando ComandoFine;
	private Comando ComandoGuarda;
	private Comando comandoNonValido;
	

	@Before
	public void setUp() throws Exception {
		this.factory = new FabbricaDiComandiFisarmonica();
		this.console = new IOConsole();
		this.comandoVai = new ComandoVai();
		this.comandoPrendi = new ComandoPrendi();
		this.comandoPosa = new ComandoPosa();
		this.ComandoAiuto = new ComandoAiuto();
		this.ComandoFine = new ComandoFine();
		this.ComandoGuarda = new ComandoGuarda();
		this.comandoNonValido = new ComandoNonValido();
	}

	@Test
	public void testCostruisciComandoVai() {
		Comando comando = this.factory.costruisciComando(COMANDO_VAI, console);
		assertEquals(COMANDO_VAI_RETURN, comando.getNome());
	}
	
	@Test
	public void testCostruisciComandoPrendi() {
		Comando comando = this.factory.costruisciComando(COMANDO_PRENDI, console);
		assertEquals(COMANDO_PRENDI_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoPosa() {
		Comando comando = this.factory.costruisciComando(COMANDO_POSA, console);
		assertEquals(COMANDO_POSA_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoAiuto() {
		Comando comando = this.factory.costruisciComando(COMANDO_AIUTO, console);
		assertEquals(COMANDO_AIUTO_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoFine() {
		Comando comando = this.factory.costruisciComando(COMANDO_FINE, console);
		assertEquals(COMANDO_FINE_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoGuarda() {
		Comando comando = this.factory.costruisciComando(COMANDO_GUARDA, console);
		assertEquals(COMANDO_GUARDA_RETURN, comando.getNome());	}
	
	@Test
	public void testCostruisciComandoNonValido() {
		Comando comando = this.factory.costruisciComando(COMANDO_NON_VALIDO, console);
		assertEquals(COMANDO_NON_VALIDO_RETURN, comando.getNome());	}

}
