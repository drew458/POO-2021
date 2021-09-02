package es1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Es1Test {
	
	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();
	
	Persone<Integer, Integer> persone = new Persone<>();

	/* @Test
	public void testListeDimensioniDiverse() throws Exception {
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(10);
		list2.add(20);
		list2.add(30);
		assertNull(persone.listeUguali(list1, list2));
	} */
	
	@Test
	public void testListeDimensioniUguali() throws Exception {
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		Map<Integer, Integer> risultato = new HashMap<>();
		risultato.put(1, 10);
		risultato.put(2, 20);
		risultato.put(3, 30);
		risultato.put(4, 40);

		assertEquals(persone.listeUguali(list1, list2), risultato);
	}

}
