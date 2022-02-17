import java.util.HashMap;
import java.util.Map;

/* Scrivere il metodo statico invertiMappa che restituisce una nuova mappa, ottenuta invertendo chiavi
 * e valori della mappa mappaVecchia passata come parametro.
 * Se mappaVecchia contiene valori duplicati, allora, al fine di creare i valori della nuova mappa, le chiavi
 * di mappaVecchia, associate ai valori duplicati, devono essere sommate tra loro.
 * Suggerimento: i test sono utili come esempio!
 */
class OperazioniSuMappe {
	public static Map<String, Integer> invertiMappa(Map<Integer, String> mappaVecchia) {
		//DA COMPLETARE
		
		Map<String, Integer> mappaNuova = new HashMap<>();
		
		for(int chiave : mappaVecchia.keySet()) {		
			if(mappaNuova.containsKey(mappaVecchia.get(chiave))) {
				int newValue = mappaNuova.get(mappaVecchia.get(chiave)) + chiave;
				mappaNuova.put(mappaVecchia.get(chiave), newValue);
			}
			else {
				mappaNuova.put(mappaVecchia.get(chiave), chiave);
			}	
		}
		return mappaNuova;
	}
}
