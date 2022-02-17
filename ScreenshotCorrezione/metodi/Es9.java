

import java.util.HashMap;
import java.util.Map;

/* Scrivere il metodo getProdotto2Quantita() della classe OperazioniProdotti. Tale metodo riceve in input due mappe.
 * La prima mappa, cod2prod, associa un codice di tipo String ad un oggetto di tipo prodotto. La seconda, cod2qta, associa 
 * un codice di tipo String ad una quantit� di tipo Integer.
 * Il metodo deve restituire una mappa che associa i prodotti della prima mappa alle quantit� della seconda mappa usando la 
 * corrispondenza fra codici (le chiavi delle mappe).
 * E' possibile che per alcuni prodotti non siano riportate le quantit�. In quel caso il prodotto deve essere riportato con +
 * quantit� pari a null.
 * N.B. Non modificare la classe prodotto.
 */

public class Es9 { }

class Prodotto {
	//NON MODIFICARE QUESTA CLASSE
	private String codice;
	private int peso;
	
	public Prodotto(String codice, int peso) {
		this.codice = codice;
		this.peso = peso;
	}
	
	public String getCodice() { return codice; }
	
	public int getPeso() { return peso; }
	
	@Override
	public int hashCode() {
		return this.codice.hashCode();	//Il codice � univoco
	}
	
	public boolean equals(Object o) {
		Prodotto that = (Prodotto) o;
		return this.getCodice().equals(that.getCodice()); //Il codice � univoco
	}
	//INIZIA A MODIFICARE DA QUI...
	
	public class OperazioniProdotti{
		public Map<Prodotto, Integer> getProdotto2quantita(Map<String, Prodotto> cod2prod, Map<String, Integer> cod2qta){
			Map<Prodotto, Integer> prod2qta = new HashMap<>();
			
			for(String codice : cod2prod.keySet()) {
				if(cod2qta.containsKey(codice))
					prod2qta.put(cod2prod.get(codice), cod2qta.get(codice));
				else prod2qta.put(cod2prod.get(codice), -1);
			}
			return prod2qta;
		}
	}
}
