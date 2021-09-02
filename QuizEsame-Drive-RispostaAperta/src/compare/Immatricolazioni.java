package compare;

/*
Cambiare la classe Studente completando il metodo compareTo(), e la classe Immatricolazioni
completando il metodo elencoOrdinatoPerEtaMatricola() affinche' quest'ultimo restituisca
l'elenco degli studenti ordinato per eta' ed in subordine, a parita' di eta', per matricola.
*/

import java.util.*;

class Studente implements Comparable<Studente> {
    private String matricola;
    private int eta;

    public Studente(String matricola, int eta) {
        this.matricola = matricola;
        this.eta = eta;
    }

    public String getMatricola() {
        return this.matricola;
    }

    public int getEta() {
        return this.eta;
    }

    public int compareTo(Studente that) {
    	int val = this.getEta()-that.getEta();
		if(val==0)
			val = this.getMatricola().compareTo(that.getMatricola());
		return val;
    }
}

public class Immatricolazioni {
    private List<Studente> elenco;

    public Immatricolazioni() {
        this.elenco = new ArrayList<Studente>();
    }

    public void aggiungiStudente(Studente studente) {
        this.elenco.add(studente);
    }

    public List<Studente> elencoOrdinatoPerEtaMatricola() {
        List<Studente> elencoOrdinato = new ArrayList<Studente>(this.elenco);
        Collections.sort(elencoOrdinato);
        return elencoOrdinato;
    }
}
