package forme;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RettangoloTest {
	
	private Punto origine;
	private Rettangolo rettangolo;

	@Before
	public void setUp() {
		
		this.origine = new Punto(0,0);
		this.rettangolo = new Rettangolo (origine, 1, 2);
	}

	@Test
	public void testTrasla_asseX() {
		fail("Not yet implemented");
	}

}
