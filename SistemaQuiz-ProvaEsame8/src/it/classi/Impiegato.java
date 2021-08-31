package it.classi;

public class Impiegato implements Comparable<Impiegato> {
	public String nome;
	public String matricola;

	public Impiegato(String n, String m) {
		this.nome = n;
		this.matricola = m;	
	}

	public int compareTo(Impiegato i) {
		return this.nome.compareTo(i.getNome());
	}

	public String getMatricola(){
		return this.matricola;
	}
	
	public String getNome(){
		return this.nome;
	}
}
