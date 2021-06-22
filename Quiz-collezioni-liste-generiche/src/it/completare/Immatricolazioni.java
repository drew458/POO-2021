package it.completare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        // scrivere il codice di questo metodo
        elencoOrdinato.addAll(this.elenco);
        Collections.sort(elencoOrdinato, new ComparatoreStudentePerEtaMatricola());
        return elencoOrdinato;
    }
}
