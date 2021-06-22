package it.classi;

public class Libro {
	private String titolo;

	public Libro(String titolo) {
		this.titolo = titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return this.titolo;
	}

	public static void main(String[] argc) {
		Libro[] scaffale = new Libro[3];
		Libro l1;

		scaffale[0] = new Libro("I Pirati della Malesia");
		l1 = scaffale[0];
		scaffale[1] = l1;
		l1 = new Libro("Le Due Tigri");
		scaffale[2] = l1;
		l1.setTitolo("Il Corsaro Nero");
		scaffale[2].setTitolo("La Regina dei Caraibi");
		for (Libro libro : scaffale)
			System.out.print(libro.getTitolo() + "; ");
	}
}
