

public class Studente extends Persona {

	private String matricola;
	
	public Studente(String nome, String matricola) {
		super(nome);
		this.matricola = matricola;
	}
	
	public void setMatricola (String matricola) {
		this.matricola = matricola;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	@Override
	public String toString() {
		return this.getNome() + " " + this.getMatricola();
	}

}
