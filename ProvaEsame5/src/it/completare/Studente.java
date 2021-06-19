package it.completare;

/*
 * Senza cambiare la classe Studente, riscrivere il metodo compare() di ComparatoreStudentePerEtaMatricola 
 * ed il metodo elencoOrdinatoPerEtaMatricola() di Immatricolazioni affinche' quest'ultimo restituisca l'elenco
 * degli studenti ordinato per eta' ed in subordine, a parita' di eta', per matricola
 */
public class Studente implements Comparable<Studente> {
	//NON toccare il codice di questa classe
    private String matricola;
    private int eta;

    public Studente(String matricola, int eta) {
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

    public int compareTo(Studente studente) {
        return this.getEta() - studente.getEta();
    }
    //NON toccare il codice di questa classe
}
