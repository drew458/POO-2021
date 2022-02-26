import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TreeSetTest {

	@Test public void testAddDuplicatiEnonConClassCastExc() {
		Set<PersonaTreeSet> s = new TreeSet<PersonaTreeSet>();
		PersonaTreeSet paolo = new PersonaTreeSet(“Paolo”);
		PersonaTreeSet valter = new PersonaTreeSet(“Valter”);
		assertTrue(s.add(paolo));
		assertTrue(s.add(valter));
		assertFalse(s.add(valter));
		assertEquals(2, s.size());
		Iterator<PersonaTreeSet> it = s.iterator();
		assertSame(paolo, it.next());
		assertSame(valter, it.next());
	}


}
