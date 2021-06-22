package it.classi;

/*
 * Scrivere il metodo aggiungiInCoda(String nuovaStringa) che aggiunge la stringa nuovaStringa in coda 
 * all'array sequenza, che compare come variabile d'istanza, se e solo se l'array non ha già 
 * raggiunto la sua capacità massima.
 */
public class SequenzaDiStringhe {
	public String[] sequenza;

	public SequenzaDiStringhe(int dimensione) {
		this.sequenza = new String[dimensione];
	}

	public void aggiungiStringa(String stringa, int posizione) {
		this.sequenza[posizione] = stringa;
	}

	public void aggiungiInCoda(String nuovaStringa) {
		//Implementare questo metodo
		//secondo la specifica riportata
		//nel testo dell'esercizio
	}
}
