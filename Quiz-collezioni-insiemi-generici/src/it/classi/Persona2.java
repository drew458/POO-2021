package it.classi;

public class Persona2 implements Comparable<Persona2> {

	private String nome;

	private int eta;

	public Persona2(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	public String getNome() { return this.nome; }
	public int getEta()     { return this.eta;  }

	@Override
	public int compareTo(Persona2 that) {
		return this.getNome().compareTo(that.getNome());
	}

	@Override
	public boolean equals(Object o) {
		Persona2 that = (Persona2) o;
		return this.getNome().equals(that.getNome()) && this.getEta()==that.getEta();
	}

}