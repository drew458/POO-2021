

import java.util.List;

/* Scrivere il metodo statico isStrettamenteDecrescente che ritorna true se la lista passata come parametro è strettamente
 * decrescente, false altrimenti. Una lista con uno o zero elementi è strettamente decrescente */

public class Es5 {
	public static boolean isStrettamenteDecrescente(List<Integer> l1) {
		if(l1.size() < 2) {
			return true;
		}
		
		for(int i=0; i<l1.size(); i++) {
			try {
				if(l1.get(i) < l1.get(i+1)) {
					return false;
				}
			}
			catch (IndexOutOfBoundsException e) {
				return true;
			}
		}
		
		return true;
	}
}
