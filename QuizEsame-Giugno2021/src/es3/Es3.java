package es3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import es4.Persona;

public class Es3 {
	
	/**
	 * metodo che ritorna TreeSet<Persona> con tutte persone ordinate 
	 * per ordine alfabetico senza poter cambiare niente in persona (ergo fai il comparatore esterno)
	 */ 
	
	public TreeSet<Persona> ordinatorePersone(TreeSet<Persona> persone){
		List<Persona> personeOrdinate = new ArrayList<Persona>();
		personeOrdinate.addAll(persone);
		Collections.sort(personeOrdinate, new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getNome().compareTo(p2.getNome());
			}
		});
		TreeSet<Persona> risultato = new TreeSet<>();
		risultato.addAll(personeOrdinate);
		return risultato;
	}
	
	public TreeSet<Persona> ordinatorePersone2(TreeSet<Persona> persone){
		TreeSet<Persona> risultato = new TreeSet<>(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNome().compareTo(o2.getNome());
			}

		});
		risultato.addAll(persone);
		return risultato;
	}
	
}
