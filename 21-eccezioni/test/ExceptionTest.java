import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import junit.framework.Test;

public class ExceptionTest {

	@Test (expected=NoSuchElementException.class)
	public void testMinOfEmptyCollectionNotDefined() {
		final List<Comparable<Object>> empty = 
				Collections.emptyList();
		Collections.min(empty);
	}
}
