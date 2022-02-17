package es1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Es1 {}

class DimensioneDiversaException extends Exception {}

class Persone<T, S> {
	/**
	 * metodo che crea una mappa<T,S> con parametri List <T> l1, List <S> l2, dove ogni iesimo
	 * elemento T della l1 deve corrisponere all iesimo elemento S della l2 . Se le liste hanno dimensioni diverse 
	 * tira un eccezione (non mi ricordo come l'aveva chiamata)
	 * @throws Exception 
	 */
	public Map<T, S> listeUguali(List<T> l1, List<S> l2) throws Exception{
		Map<T, S> lista12lista2 = new HashMap<>();
		
		if(l1.size()!=l2.size())
			throw new DimensioneDiversaException();
		
		for(T elem : l1) {
			lista12lista2.put(elem, l2.get(l1.indexOf(elem)));
		}
		return lista12lista2;
	}
}
