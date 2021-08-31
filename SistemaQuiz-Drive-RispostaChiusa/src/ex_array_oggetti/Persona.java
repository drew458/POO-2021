package ex_array_oggetti;

//Cosa stampa?
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


	public static void main(String args[]) {
		Persona[] aula = new Persona[10];
		Persona p1 = new Persona("paolo");

		aula[0] = p1;
		p1.setNome("ambrogio");
		aula[1] = p1;
		aula[2] = new Persona("luigi");
		aula[3] = new Persona("anna");

		Persona docente = new Persona("anna");

		for(int i = 0; i<4; i++)
			if (aula[i] != docente)
				System.out.println(aula[i].getNome()+" ");
	}
}

/**
Il programma stampa:
ambrogio ambrogio luigi anna

SPIEGAZIONE
aula[0] punta allo stesso elemento cui punta p1.
Il nome viene cambiato paolo ad ambrogio.
Anche aula[1] punta lo stesso elemento di p1.
aula[0] e aula[1] hanno nome ambrogio.
aula[2] punta ad un oggetto con nome luigi.
aula[3] punta ad un oggetto con nome anna.

aula[3] e docente hanno lo stesso nome, ma sono due oggetti distinti!

------Altre Risposte------
Il programma non compila 
*/