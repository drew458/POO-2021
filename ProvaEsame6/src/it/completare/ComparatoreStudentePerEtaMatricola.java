package it.completare;

import java.util.Comparator;

/*
 * Senza cambiare la classe Studente, riscrivere il metodo compare() di ComparatoreStudentePerEtaMatricola
 * ed il metodo elencoOrdinatoPerEtaMatricola() di Immatricolazioni affinche' quest'ultimo restituisca l'elenco
 * degli studenti ordinato per eta' ed in subordine, a parita' di eta', per matricola
 */
public class ComparatoreStudentePerEtaMatricola implements Comparator<Studente> {
	public int compare(Studente p1, Studente p2) {
		if(p1.getEta()!=p2.getEta())
            return p1.getEta()-p2.getEta();
        return p1.getMatricola().compareTo(p2.getMatricola());
    }
}
