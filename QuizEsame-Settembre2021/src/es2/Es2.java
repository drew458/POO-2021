package es2;

import java.util.HashMap;
import java.util.Map;

/* Scrivere il metodo statico invertiMappa che restituisce una nuova mappa, ottenuta invertendo chiavi
 * e valori della mappa mappaVecchia passata come parametro.
 * Se mappaVecchia contiene valori duplicati, allora, al fine di creare i valori della nuova mappa, le chiavi
 * di mappaVecchia, associate ai valori duplicati, devono essere sommate tra loro.
 * Suggerimento: i test sono utili come esempio!
 */

class Es2 {}

class OperazioniSuMappe {
	public static Map<String, Integer> invertiMappa(Map<Integer, String> mappaVecchia) {
		//DA COMPLETARE
		
		Map<String, Integer> mappaNuova = new HashMap<>();
		
		for(int chiaveMappaVecchia : mappaVecchia.keySet()) {		
			if(mappaNuova.containsKey(mappaVecchia.get(chiaveMappaVecchia))) {
				int newValue = mappaNuova.get(mappaVecchia.get(chiaveMappaVecchia)) + chiaveMappaVecchia;
				mappaNuova.put(mappaVecchia.get(chiaveMappaVecchia), newValue);
			}
			else {
				mappaNuova.put(mappaVecchia.get(chiaveMappaVecchia), chiaveMappaVecchia);
			}	
		}
		return mappaNuova;
	}
}
