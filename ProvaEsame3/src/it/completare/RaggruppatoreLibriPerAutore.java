package it.completare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Scrivere il metodo autore2libri() della classe RaggruppatoreLibriPerAutore che restituisce una mappa
 * le cui chiavi sono i nomi di autori di libri; 
 * la mappa associa ad ogni nome un valore che risulta essere la lista di tutti gli oggetti Libro scritti da tale autore
 * @return
 */
public class RaggruppatoreLibriPerAutore {
	private List<Libro> elencoLibri;

    public RaggruppatoreLibriPerAutore(){
        this.elencoLibri = new ArrayList<Libro>();
    }

    public void aggiungiLibro(Libro libro) {
        this.elencoLibri.add(libro);
    }

    public Map<String, List<Libro>> autore2libri() {
        Map<String, List<Libro>> autore2libri = new HashMap<String, List<Libro>>();
        List<String> elencoAutori = new ArrayList<String>();
        for(Libro l : elencoLibri){
            elencoAutori.add(l.getAutore());
        }
        Iterator<String> i = elencoAutori.iterator();
        if(i.hasNext()){
            for()
        }
        return autore2libri;
    }
}
