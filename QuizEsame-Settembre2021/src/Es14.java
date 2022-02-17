import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Implementare il corpo del metodo statico isOrdinataSecondo(...) che prende in input un comparatore ed una lista. 
 *  Tale metodo deve ritornare true se la lista è già ordinata secondo l'ordinamento definito dal comparatore, false altrimenti.
 *  ATTENZIONE: non è necessario ordinare la lista in input o definire un nuovo comparatore.
 */
public class Es14 {
	public static <T> boolean isOrdinataSecondo(Comparator<T> cmp, List<T> l1) {
		List<T> l2 = new ArrayList<>();
		l2.addAll(l1);
		Collections.sort(l2, cmp);
		
		for(T elem : l1) {
			if (elem != l2.get(l1.indexOf(elem))) {
				return false;
			}
		}
		return true;
	}
}
