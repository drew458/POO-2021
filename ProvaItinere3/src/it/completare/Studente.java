package it.completare;


/**
 * Se si prova ad eseguire il test sul codice fornito si noter� che questo
 * non andr� a buon fine: Completare e correggere la classe fornita di modo
 * che i test vengano eseguiti correttamente.
 *
 */
public class Studente {
	private String nome;
	private int matricola;
	
	public Studente(String nome, int matricola) {
		this.nome = nome;
		this.matricola = matricola;
	}
	
	@Override
	public boolean equals(Object o) {
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	
	
}
