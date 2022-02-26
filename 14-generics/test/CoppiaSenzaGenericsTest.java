import static org.junit.Assert.assertSame;

import org.junit.Test;

public class CoppiaSenzaGenericsTest {

	
	/**
	 * Compila e funziona correttamente
	 */
	@Test
	public void testCheCompilaEdEsegue() {
		Coppia coppia = new Coppia();
		String pippo = new String("Pippo");
		String pluto = new String("Pluto");
		Persona p1 = new Persona(pippo);
		coppia.setPrimo(p1);
		Persona p2 = new Persona (pluto);
		coppia.setSecondo(p2);
		Persona persona = (Persona)coppia.getPrimo();
		assertSame(pippo, persona.getNome());
	}
	
	
	/**
	 * NON COMPILA!
	 *  Il tipo statico Object non possiede il metodo getNome()
	 */
	@Test
	public void testCheNonCompila() {
	Coppia coppia = new Coppia();
	String pippo = new String("Pippo");
	String pluto = new String("Pluto");
	Persona p1 = new Persona(pippo);
	coppia.setPrimo(p1);
	Persona p2 = new Persona(pluto);
	coppia.setSecondo(p2);
	assertSame(pippo, coppia.getPrimo().getNome());
	}
	
	/**
	 * Al contrario, il seguente codice compila correttamente ma l’esecuzione fallisce:
	 *  ClassCastException a tempo di esecuzione!
	 */
	@Test
	public void testCheCompilaMaNonEsegue() {
	Coppia coppia = new Coppia();
	String pippo = new String("Pippo");
	String pluto = new String("Pluto");
	Persona p1 = new Persona(pippo);
	Persona p2 = new Persona(pluto);
	coppia.setPrimo(pippo);
	coppia.setSecondo(pluto);
	assertSame(pippo,((Persona)coppia.getPrimo()).getNome());
	}

}
