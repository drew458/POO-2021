package it.completare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Senza cambiare la classe Studente, riscrivere il metodo compare() di ComparatoreStudentePerEtaMatricola 
 * ed il metodo elencoOrdinatoPerEtaMatricola() di Immatricolazioni affinche' quest'ultimo restituisca l'elenco
 * degli studenti ordinato per eta' ed in subordine, a parita' di eta', per matricola
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
        elencoOrdinato.addAll(this.elenco);
        Collections.sort(elencoOrdinato, new ComparatoreStudentePerEtaMatricola());
        return elencoOrdinato;
    }
}
