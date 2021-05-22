import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HashSetTest {

	@Test public void testAddDuplicatiEnon() {
		Set<Persona> s = new HashSet<>();
		assertEquals(0, s.size());
		Persona paolo = new Persona("Paolo");
		Persona valter = new Persona("Valter");
		assertTrue(s.add(paolo));
		assertEquals(1, s.size());
		assertTrue(s.add(valter));
		assertEquals(2, s.size());
		assertFalse(s.add(paolo));
		assertEquals(2, s.size());
		Persona paolo2 = new Persona("Paolo");
		assertFalse(s.add(paolo2));
		assertEquals(2, s.size());
	}

}
