
public class Studente extends Persona {

	private String matricola;

	public Studente(String nome, String matricola) {
		super(nome);
		this.matricola = matricola;
	}

	public String getMatricola() { 
		return this.matricola; 
	}

	@Override 
	public boolean equals(Object o) {
		return super.equals(o) && this.getMatricola().equals(((Studente)o).getMatricola());
	}
	
	@Override 
	public int hashCode() {
		return super.hashCode()+this.getMatricola().hashCode();
	}
}
