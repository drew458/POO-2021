
public class Persona {

	private String nome;
	
	public Persona(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return this.getNome();
	}
}
