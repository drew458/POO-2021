package it.completare;

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
		// scrivere il codice di questo metodo
		return 0;
	}
}