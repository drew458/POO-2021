package domanda2;

class SegreteriaDidattica {
	public void cambiaNome(Corso corso, String nuovoNome) {
		corso.setNome(nuovoNome);
	}
}

public class Corso {
	private String nome;

	public Corso(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public static void main(String[] args) {
		SegreteriaDidattica segreteria = new SegreteriaDidattica();
		Corso c1; 
		Corso c2;

		c1 = new Corso("Programmazione Orientata Agli Oggetti");
		c2 = new Corso("Analisi");
		segreteria.cambiaNome(c1, "POO");
		c1 = c2;
		System.out.println(c1.getNome());
		System.out.println(c2.getNome());
	}
}

/*
 * Analisi
 * Analisi
 * 
 */

