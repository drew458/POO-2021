package it.completare;

/*
 * Cambiare la classe Studente completando il metodo compareTo(), e la classe Immatricolazioni completando 
 * il metodo elencoOrdinatoPerEtaMatricola() affinche' quest'ultimo restituisca l'elenco degli studenti 
 * ordinato per eta' ed in subordine, a parita' di eta', per matricola.
 */
public class Studente implements Comparable<Studente> {

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
    	if(this.getEta()==that.getEta())
            return this.getMatricola().compareTo(that.getMatricola());
        return this.getEta()-that.getEta();
    }

}
