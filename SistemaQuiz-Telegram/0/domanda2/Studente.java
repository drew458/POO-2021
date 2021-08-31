package domanda2;

public class Studente {

	private String nome;

	public Studente(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public String cambiaNome(String nome){
		String vecchioNome;
		vecchioNome = this.nome;
		this.nome = nome;
		return vecchioNome;
	}

	public static void main(String[] args) {
		Studente a1 = new Studente("Paolo");
		Studente a2 = new Studente("Luca");

		a1.cambiaNome(a2.cambiaNome("Anna"));
		a1 = a2;
		System.out.println(a1.getNome());
		System.out.println(a2.getNome());

		a2.cambiaNome(a1.cambiaNome("Luigi"));
		a2 = new Studente("Mario");
		System.out.println(a1.getNome());
		System.out.println(a2.getNome());
	}

}
