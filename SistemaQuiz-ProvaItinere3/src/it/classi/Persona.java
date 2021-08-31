package it.classi;

public class Persona {
	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Persona(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
}
