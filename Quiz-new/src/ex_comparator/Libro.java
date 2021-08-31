package ex_comparator;

public class Libro {

	public int anno;
	public String titolo;

	public Libro(String titolo, int anno) {
		this.anno = anno;
		this.titolo = titolo;
	}

	public int compareTo(Libro o) {
		return this.titolo.compareTo(o.getTitolo());
	}

	public int getAnno(){
		return this.anno;
	}

	public String getTitolo(){
		return this.titolo;
	}
}
