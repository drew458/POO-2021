package tetris.pozzo;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class CellaTest {

	@Test
	public void testEquals() {
		assertEquals(new Cella(1,1, Color.BLACK), new Cella(1,1, Color.BLACK));
	}

	@Test
	public void testDiversaPosizione() {
		assertNotEquals(new Cella(2, 2, Color.BLACK), new Cella(1,1, Color.BLACK));
	}

	@Test
	public void testDiversoColore() {
		assertNotEquals(new Cella(1, 1, Color.BLACK), new Cella(1,1, Color.WHITE));
	}

	@Test
	public void testDiversoTutto() {
		assertNotEquals(new Cella(1, 1, Color.BLACK), new Cella(2,2, Color.WHITE));
	}

	@Test
	public void testCompareToYMaggiore() {
		Cella cellaYMaggiore = new Cella(1,2,Color.BLACK);
		Cella cellaYMinore = new Cella(1,1,Color.BLACK);
		assertEquals(1,cellaYMaggiore.compareTo(cellaYMinore));
	}

	@Test
	public void testCompareToXMaggiore() {
		Cella cellaXMaggiore = new Cella(2,1,Color.BLACK);
		Cella cellaXMinore = new Cella(1,1,Color.BLACK);
		assertEquals(1,cellaXMaggiore.compareTo(cellaXMinore));
	}
}