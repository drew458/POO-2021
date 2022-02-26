
public abstract class Persona {

	private String nome;

	public Persona(String nome) { 
		this.nome = nome; 
	}

	public String getNome() { 
		return this.nome; 
	}

	@Override 
	public boolean equals(Object o) {
		if (o==null || o.getClass() != this.getClass()) 
			return false;
		return this.getNome().equals(((Persona)o)).getNome());
	}
	
	@Override 
	public int hashCode() {
		return this.getClass().hashCode()+this.getNome().hashCode();
	}
}
