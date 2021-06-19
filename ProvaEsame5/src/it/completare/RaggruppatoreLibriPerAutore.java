package it.completare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * Scrivere il metodo autore2libri() della classe RaggruppatoreLibriPerAutore che restituisce una mappa le cui chiavi 
 * sono i nomi di autori di libri; 
 * la mappa associa ad ogni nome un valore che risulta essere la lista di tutti gli oggetti Libro scritti da tale autore
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
        for(Libro l : elencoLibri){
            if(autore2libri.containsKey(l.getAutore())){
                autore2libri.get(l.getAutore()).add(l);
            }
            else{
                List<Libro> libri = new ArrayList<>();
                libri.add(l);
                autore2libri.put(l.getAutore(), libri);
            }
        }
        return autore2libri;
    }
}
