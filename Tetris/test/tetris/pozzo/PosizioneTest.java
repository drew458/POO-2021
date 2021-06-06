package tetris.pozzo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class PosizioneTest {

	@Test
	public void testEquals() {
		assertEquals(new Posizione(1, 1), new Posizione(1, 1));
	}

	@Test
	public void testYDiversa() {
		assertNotEquals(new Posizione(1, 1), new Posizione(1, 2));
	}

	@Test
	public void testTuttoDiverso() {
		assertNotEquals(new Posizione(1, 1), new Posizione(2, 2));
	}

	@Test
	public void testCompareToYMaggiore() {
		Posizione posYMaggiore = new Posizione(1,2);
		Posizione posYMinore = new Posizione(1,1);
		assertEquals(1,posYMaggiore.compareTo(posYMinore));
	}

	@Test
	public void testCompareToXMaggiore() {
		Posizione posXMaggiore = new Posizione(2,1);
		Posizione posXMinore = new Posizione(1,1);
		assertEquals(1,posXMaggiore.compareTo(posXMinore));
	}

}