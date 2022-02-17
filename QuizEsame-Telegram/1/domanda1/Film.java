package domanda1;

public class Film {
	private String titolo;

	public Film(String titolo) {
		this.titolo = titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return this.titolo;
	}

	public static void main(String[] argc) {
		Film[] films = new Film[3];
		Film f1;

		films[0] = new Film("ResidentEvil");
		f1 = films[0];
		films[1] = f1;
		f1 = new Film("Batman");
		films[1].setTitolo("StarWars");
		f1 = new Film("ET");
		films[2] = f1;
		f1.setTitolo("LOTR");

		for (Film film : films)
			System.out.print(film.getTitolo() + " ");
	}

}

/* 
 * StarWars StarWars LOTR
 *
*/