package es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Es2 {

	/**
	 * metodo che ritorna booleano. Se la lista List<Integer> passata come parametro è strettamente crescente allora true se no false
	 */
	public Boolean isStrettamenteCrescente(List<Integer> l1) {
		List<Integer> l2 = new ArrayList<>();
		l2.addAll(l1);
		Collections.sort(l2);
		for (int i=0; i<l1.size(); i++) {
			if (l1.get(i) != l2.get(i)) {
				return false;
			}
		}
		return true;
	}
}
