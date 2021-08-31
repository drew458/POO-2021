package it.completare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Cambiare la classe Studente completando il metodo compareTo(), e la classe Immatricolazioni 
 * completando il metodo elencoOrdinatoPerEtaMatricola() 
 * affinche' quest'ultimo restituisca l'elenco degli studenti ordinato per eta' 
 * ed in subordine, a parita' di eta', per matricola.
 */
public class Immatricolazioni {
	private List<Studente> elenco;

	public Immatricolazioni() {
		this.elenco = new ArrayList<Studente>();
	}

	public void aggiungiStudente(Studente studente) {
		this.elenco.add(studente);
	}

	public List<Studente> elencoOrdinatoPerEtaMatricola() {
		List<Studente> elencoOrdinato = new ArrayList<Studente>();
        Collections.sort(elenco);
        elencoOrdinato.addAll(elenco);
        return elencoOrdinato;
	}
}
