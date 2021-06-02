import static org.junit.Assert.*;

import org.junit.Test;

public class TestSaluta {

	public class InnerTest {
		@Test
		public void testSaluta() {
			Outer outer = new Outer();
			Outer.Inner inner = outer.new Inner();
			assertEquals("inner outer", inner.saluta());
		}
	}

}

}
