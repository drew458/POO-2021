import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class Es7Test {
	
	List<Integer> l1;
	List<Integer> l2;
	Map<Integer, Integer> map;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws DimensioneDiversaException {
		l1 = new ArrayList<>();
		l2 = new ArrayList<>();
		map = new HashMap<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		
		assertEquals(this.map, Es7.unisci(l1, l2));
	}

}
