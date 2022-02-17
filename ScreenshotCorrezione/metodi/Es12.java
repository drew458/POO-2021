

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Implementare il metodo statico controllaDoppioni in modo che, data una lista in input, ritorni una mappa che ha:
 * * come chiavi tutti e soli gli elementi della lista
 * * come valori true se la chiave appare due volte nella lista, false altrimenti
 */

public class Es12 {
	public static <T> Map<T, Boolean> controllaDoppioni (List<T> l1){
		Map<T, Boolean> map = new HashMap<>();
		
		for(T elem : l1) {
			if(map.containsKey(elem))
				map.put(elem, true);
			else map.put(elem, false);
		}	
		return map;
	}
}
