

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Implementare il metodo unisci che accetta due liste l1 e l2 e restituisce una mappa in cui all'i-esimo elemento di l1
 * viene associato l'iesimo elemento di l2. Il metodo deve lanciare un'eccezione di tipo DimensioneDiversaException se le
 * liste non sono di pari lunghezza. Si assuma che la lista l1 non possa avere duplicati.
 */

class DimensioneDiversaException extends Exception {}

public class Es1  {
	
	public <T> Map<T, T> unisci (List<T> l1, List<T> l2) throws DimensioneDiversaException{
		Map<T, T> map = new HashMap<>();
		
		if(l1.size() != l2.size()) {
			throw new DimensioneDiversaException();
		}
		for (T elem : l1) {
			map.put(elem, l2.get(l1.indexOf(elem)));
		}
		
		return map;
	}
}
