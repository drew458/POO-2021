

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Implementare il metodo unisci che accetta due liste l1 e l2 e restituisce una mappa in cui all'i-esimo elemento di l1 viene
 * associato l'i-esimo elemento di l2. Il metodo deve lanciare un'eccezion di tipo DimensioneDiversaException se le liste non sono
 * di pari lunghezza. Si assuma che la lista l1 non possa avere duplicati
 */

public class Es7 {
	public static Map<Integer, Integer> unisci(List<Integer> l1, List<Integer> l2) throws DimensioneDiversaException{
		Map<Integer, Integer> map = new HashMap<>();
		
		if(l1.size() != l2.size())
			throw new DimensioneDiversaException();
		
		for (Integer element : l1) {
			map.put(element, l2.get(l1.indexOf(element)));
		}
		
		return map;
	}
}
