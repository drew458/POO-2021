package it.completare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementare il metodo statico conta in modo che, data una lista in input,
 * ritorni una mappa che ha:
 * - come chiavi tutti e soli gli elementi della lista
 * - come valori il numero delle loro occorrenze nella lista
 *
 */
public class ContatoreOccorrenze {
	public static <T> Map<T, Integer> conta(List<T> ll) {
		Map<T, Integer> elementi2occorrenze = new HashMap<>();
		Integer contatore;
		
		for(T elemento : ll) {
			if(elementi2occorrenze.containsKey(elemento)) {
				contatore = elementi2occorrenze.get(elemento);
				elementi2occorrenze.put(elemento, contatore++);
			}
			else {
				elementi2occorrenze.put(elemento, 1);
			}
		}
		return elementi2occorrenze;
	}
}
