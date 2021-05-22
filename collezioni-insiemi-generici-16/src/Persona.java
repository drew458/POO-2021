public class Persona {
	private String nome;
	
	Persona(String nome) { this.nome = nome; }
	
	public String toString() { return this.nome; }
	
	public String getNome() { return this.nome; }
	
	// aggiungo il metodo opportuno hashCode per far funzionare i test
	@Override
	public int hashCode() {
	 return this.getNome().hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		Persona that = (Persona)o;
		return this.getNome().equals(that.getNome());
	}
}