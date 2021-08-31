package compare;

/*
Senza cambiare la classe Studente, riscrivere il metodo compare() di ComparatoreStudentePerEtaMatricola
ed il metodo elencoOrdinatoPerEtaMatricola() di Immatricolazioni affinche' quest'ultimo restituisca
l'elenco degli studenti ordinato per eta' ed in subordine, a parita' di eta', per matricola
*/

import java.util.*;

class Studente2 implements Comparable<Studente2> {
    //NON toccare il codice di questa classe
    private String matricola;
    private int eta;

    public Studente2(String matricola, int eta) {
        this.matricola = matricola;
        this.eta = eta;
    }
    //NON toccare il codice di questa classe
    public String getMatricola() {
        return this.matricola;
    }

    public int getEta() {
        return this.eta;
    }

    public int compareTo(Studente2 studente) {
        return this.getEta() - studente.getEta();
    }
    //NON toccare il codice di questa classe
}

class ComparatoreStudentePerEtaMatricola implements Comparator<Studente2> {

    public int compare(Studente2 p1, Studente2 p2) {
        if(p1.getEta()-p2.getEta() != 0)
        	return p1.getEta()-p2.getEta();
        return p1.getMatricola().compareTo(p2.getMatricola());
		
    }
}

public class Immatricolazioni2 {
    private List<Studente2> elenco;

    public Immatricolazioni2() {
        this.elenco = new ArrayList<Studente2>();
    }

    public void aggiungiStudente(Studente2 studente) {
        this.elenco.add(studente);
    }

    public List<Studente2> elencoOrdinatoPerEtaMatricola() {
        List<Studente2> elencoOrdinato = new ArrayList<Studente2>(this.elenco);
        Collections.sort(elencoOrdinato, new ComparatoreStudentePerEtaMatricola());
        return elencoOrdinato;
    }
}

