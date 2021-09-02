package calcolatori;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalcolatoreMediaTest {
	private CalcolatoreMedia calcolatore;

	@Before
	public void setUp() {
		this.calcolatore = new CalcolatoreMedia();
	}
	
	@Test(timeout=200)
	public void testCalcolaMedia() {
		int[] sequenza = {1, 2, 3, 4, 5};
		double media = (1 + 2 + 3 + 4 + 5) / 5.;
		assertEquals(media, this.calcolatore.calcolaMedia(sequenza), 0.0001);
	}
	
	@Test(timeout=200)
	public void testCalcolaMediaTuttiNegativi() {
		int[] sequenza = {-1, -2, -3, -4, -5};
		double media = ((-1) + (-2) + (-3) + (-4) + (-5)) / 5.;
		assertEquals(media, this.calcolatore.calcolaMedia(sequenza), 0.0001);
	}
	
	@Test(timeout=200)
	public void testCalcolaMediaNegativiPositivi() {
		int[] sequenza = {1, -1, 2, -2, 3};
		double media = (1 + (-1) + 2 + (-2) + 3) / 5.;
		assertEquals(media, this.calcolatore.calcolaMedia(sequenza), 0.0001);
	}
	
	@Test(timeout=200)
	public void testCalcolaMediaZero() {
		int[] sequenza = {-1, 0, 3, 4, -5};
		double media = ((-1) + 0 + 3 + 4 + (-5)) / 5.;
		assertEquals(media, this.calcolatore.calcolaMedia(sequenza), 0.0001);
	}

}
