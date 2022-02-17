/* Cosa stampa questo programma? */

class Anagrafe {
	public Persona cambiaNome(Persona persona, String nuovoNome) {
		Persona e = new Persona(persona.getNome());
		e.setNome(nuovoNome);
		return e;
	}	
}

class Persona {
	private String nome;
	
	public Persona(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {
		Anagrafe anagrafe = new Anagrafe();
		Persona p = new Persona("Mario");
		
		System.out.println(p.getNome());
		System.out.println("-");
		anagrafe.cambiaNome(p, "Luigi");
		System.out.println(p.getNome());
	}
}

/* Mario-Mario <-
 * Luigi-Luigi
 * Mario-Luigi
 * Luigi-Mario
 * nessuna delle altre
 */





