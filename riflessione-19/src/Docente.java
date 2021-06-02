public class Docente extends Persona {
	private String cf;
	
	public Docente(String nome, String cf) {
		super(nome);
		this.cf = cf;
	}
	
	public String getCF() {
		return this.cf;
	}
	
	@Override 
	public boolean equals(Object o) {
		return super.equals(o) && this.getCF().equals(((Docente)o).getCF());
	}
	
	@Override 
	public int hashCode() {
		return super.hashCode()+this.getCF().hashCode();
	}
}