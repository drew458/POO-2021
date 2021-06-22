package it.completare;

public class Studente implements Comparable<Studente>{
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
