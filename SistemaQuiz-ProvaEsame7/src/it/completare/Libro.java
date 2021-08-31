package it.completare;

/*
 * Scrivere il metodo autore2libri() della classe RaggruppatoreLibriPerAutore che restituisce una mappa 
 * le cui chiavi sono i nomi di autori di libri; la mappa associa ad ogni nome un valore che risulta essere
 * la lista di tutti gli oggetti Libro scritti da tale autore
 */
public class Libro {
	private String titolo;

    private String autore;

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getAutore() {
        return this.autore;
    }

    public String getTitolo() {
        return this.titolo;
    }
}
