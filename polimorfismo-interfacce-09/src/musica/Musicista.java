package musica;

public class Musicista {

	private String nome;
	
	public Musicista(String nome) {
		this.nome = nome;
	}
	
	public void suona(Strumento s) {
		s.produciSuono();
	}
	
}
