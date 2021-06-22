package it.classi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/*
 * Utilizzando l'interfaccia Comparable, modificare la classe Persona ed implementare il metodo statico 
 * getInsiemeOrdinato() in modo che i test vadano a buon fine. Tale metodo, data una lista di persone, 
 * ritorna un insieme nel quale le persone sono ordinate in ordine alfabetico inverso.
 */
public class Persona implements Comparable<Persona> {
	private String cognome;

	public Persona(String cognome) {
		this.cognome = cognome;
	}

	public String getCognome() { return this.cognome; }
	
	public int compareTo(Persona that){
		return that.getCognome().compareTo(this.getCognome());
    }
    
    public boolean equals(Object o){
        Persona that = (Persona) o;
        return this.getCognome() == that.getCognome();
    }
    
    public int hashCode(){
        return this.getCognome().hashCode();
    }

	public static TreeSet<Persona> getInsiemeOrdinato(List<Persona> listaPersone) {
		//DA COMPLETARE
		List<Persona> personeOrdinate = new ArrayList<>();
		personeOrdinate.addAll(listaPersone);
		Collections.sort(personeOrdinate);
		TreeSet<Persona> risultato = new TreeSet<>();
		risultato.addAll(personeOrdinate);
		return risultato;
	}
}
