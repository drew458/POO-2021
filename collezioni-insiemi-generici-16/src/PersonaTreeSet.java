public class PersonaTreeSet implements Comparable<PersonaTreeSet> {
	private String nome;
	
	PersonaTreeSet(String nome) { this.nome = nome; }
	
	public String toString() { return this.nome; }
	
	public String getNome() { return this.nome; }
	
	@Override
	public int hashCode() {
		return this.getNome().hashCode();
	}
	
	// La classe ora viene modifcata per implementare Comparable<PersonaTreeSet>
	@Override
	public int compareTo(PersonaTreeSet that) {
	 return this.getNome().compareTo(that.getNome());
	}
	
	@Override
	public boolean equals(Object p) {
		return this.getNome().equals(((Persona)p).getNome());
	}
}
