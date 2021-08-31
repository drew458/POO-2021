package it.classi;

public class Strada {
	private String nome;

    public Strada (String nome) {
        this.nome = nome;
    }

    public void setNome (String n) {
        nome = n;
    }

    public String getNome(){
        return nome;
    }
}
