import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EraMultiCoreTest {
	
	@Test
	public void testPossiedoUnMultiCoreEmagariNonLoSapevo() {
		 assertTrue(Runtime.getRuntime().availableProcessors()>0);
	}

}
