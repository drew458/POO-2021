package it.interferenza;

public class Persona {
	private String nome;
	
	private Coppia<Persona> coppia;
	
	public Persona(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCoppia(Coppia<Persona> coppia) {
		this.coppia = coppia;
	}
	
	public boolean isSposata() {
		return (this.coppia != null );
	}
}
