package it.quiz;

import it.classi.Coppia;
import it.classi.DueTorri;
import it.classi.RitornoDelRe;
import it.classi.SignoreDegliAnelli;

public class Quiz7 {
	public static void main(String[] args) {
		SignoreDegliAnelli r = new RitornoDelRe();
		SignoreDegliAnelli d = new DueTorri();
		stampa(new Coppia(r, d));
	}
	
	static void stampa(Coppia< ? extends SignoreDegliAnelli> c) {
		c.getSecondo().stampa();
	}
}

/**
 * Il codice non compila
 * Il signore degli Anelli
 * Il Ritorno del Re
 * - Le Due Torri
 * Nessuna delle altre 
*/