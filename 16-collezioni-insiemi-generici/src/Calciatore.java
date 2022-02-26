public class Calciatore {
	
	private String nome;
	private String cognome;
	private int numeroMaglia; 
	
	… // metodi getter omessi
	
	@Override
	public boolean equals(Object o) {
		Calciatore that = (Calciatore)o;
		return this.getNome().equals(that.getNome()) && 
				this.getCognome().equals(that.getCognome()) &&
				this.getNumeroMaglia()== that.getNumeroMaglia();
	}
	
	@Override
	public int hashCode() {
		return this.getNome().hashCode()
				+ this.getCognome().hashCode() 
				+ this.getNumeroMaglia();
	}
}
