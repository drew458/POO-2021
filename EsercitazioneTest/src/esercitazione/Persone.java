package esercitazione;

public class Persone {
	private String[] nomi;
	public Persone(int n) {
		this.nomi = new String[n];
	}
	public int contaOmonimiDi(String nome) {
		// metodo da scrivere
		int omonimi=0;
		for(String persona:this.nomi)
			if(persona.equals(nome))
				omonimi++;
		return omonimi;
	}
	public void aggiungiNome(int indice, String nome){
		this.nomi[indice] = nome;
	}
}