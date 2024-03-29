package contatori;

/*
Implementare il metodo verificaDuplicati(String nome) che restituisce true se
la variabile di istanza nomi contiene due o pi� occorrenze della stringa nome passata
come parametro al metodo. Ritorna false altrimenti.
 */

class Persone {
	private String[] nomi;
	private int duplicati;

	public Persone(int numeroPersone) {
		this.nomi = new String[numeroPersone];
	}

	public void aggiungiNome(String nome, int indice) {
		this.nomi[indice] = nome;
	}

	public boolean verificaDuplicati(String nome) {     
		for(int i=0;i<nomi.length;i++)
			if(nome.equals(nomi[i]))
					duplicati++;
			if(duplicati>=2)
				return true;
			return false;

	}

}

public class VerificaDuplicati {}
