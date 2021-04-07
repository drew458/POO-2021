package forme;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerchioTest {
	
	private Punto origine;
	private Cerchio unitario;

	@Before
	public void setUp() {
		this.origine = new Punto(0,0);
		this.unitario = new Cerchio
	}
	
	
	
	@Test
	public void testTrasla() {
		final Punto origine = new Punto(0,0);
		final Cerchio unitario = new Cerchio(origine, 1);
		assertEquals(0, unitario.getCentro().getX());
		assertEquals(0, unitario.getCentro().getY());
		unitario.trasla(+1, 0);
		assertEquals(1, unitario.getCentro().getX());
		assertEquals(0, unitario.getCentro().getY());
		
		fail("Not yet implemented");
	}

}
