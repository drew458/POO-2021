package it.classi;

/* Implementare il costruttore della classe Soldato. */
public class Soldato extends Persona {
	private String grado;

    public Soldato(String nome, String cognome, String grado) {
      super(nome, cognome);
      this.grado=grado;
    }

    public String getGrado() {
        return this.grado;
    }
}
