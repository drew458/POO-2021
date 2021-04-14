package forme;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RettangoloTest {
	
	private Punto vertice;
	private Rettangolo rettangolo;

	@Before
	public void setUp() {
		this.vertice = new Punto(0,0);
		this.rettangolo = new Rettangolo(vertice, 1, 2);
	}
	
	@Test
	public void testTrasla_asseX() {
		rettangolo.trasla(1, 0);
		assertEquals(1, rettangolo.getVertice().getX());
		assertEquals(0, rettangolo.getVertice().getY());
	}
	
	@Test
	public void testTrasla_asseY() {
		rettangolo.trasla(0, 1);
		assertEquals(0, rettangolo.getVertice().getX());
		assertEquals(1, rettangolo.getVertice().getY());
	}

}
