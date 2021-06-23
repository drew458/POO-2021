import static org.junit.Assert.*;
import org.junit.Test;

import verifiche.Sequenza;

public class ComandoTest {

	@Test
	public void testMassimoPositivi() {

		 Sequenza seq = new Sequenza(5);
		 seq.setElemento(0,1);
		 seq.setElemento(1,5);
		 seq.setElemento(2,8);
		 seq.setElemento(3,3);
		 seq.setElemento(4,4);
		 assertEquals(8, seq.massimo());

	}


	@Test
	public void testMassimoegativi() {
		//...
	}
}