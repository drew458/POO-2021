package it.completare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Scrivere il metodo autore2canzoni() della classe RaggruppatoreCanzoniPerAutore che restituisce una mappa 
 * le cui chiavi sono i nomi di autori di canzoni; 
 * la mappa associa ad ogni autore un valore che risulta essere la lista 
 * di tutti gli oggetti Canzone scritti da tale autore
 */
public class RaggruppatoreCanzoniPerAutore {
	private List<Canzone> elencoCanzoni;

    public RaggruppatoreCanzoniPerAutore(){
        this.elencoCanzoni = new ArrayList<Canzone>();
    }

    public void aggiungiCanzone(Canzone canzone) {
        this.elencoCanzoni.add(canzone);
    }

    public Map<String, List<Canzone>> autore2canzoni() {
    	Map<String, List<Canzone>> autore2canzoni = new HashMap<String, List<Canzone>>();
        for(Canzone canzone : elencoCanzoni){
            if(!autore2canzoni.keySet().contains(canzone.getAutore())){
                List<Canzone> l = new ArrayList<>();
                l.add(canzone);
                autore2canzoni.put(canzone.getAutore(), l);
            }
            else
                autore2canzoni.get(canzone.getAutore()).add(canzone);
        }

        return autore2canzoni;
    }
}
