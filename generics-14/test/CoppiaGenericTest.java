import static org.junit.Assert.*;

import org.junit.Test;

public class CoppiaGenericTest {

	@Test
	public void testCoppiaDiPersone() {
		CoppiaGeneric<Persona> coppia;
		
		Persona p1 = new Persona("Stanlio");
		Persona p2 = new Persona("Olio");
		coppia = new CoppiaGeneric<Persona>(p1, p2);
		
		assertSame(p1,coppia.getPrimo());
		assertSame(p2,coppia.getSecondo());
	}


}
