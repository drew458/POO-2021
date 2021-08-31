package it.completare;

/* Scrivere il metodo autore2canzoni() della classe RaggruppatoreCanzoniPerAutore che restituisce una mappa 
 * le cui chiavi sono i nomi di autori di canzoni; 
 * la mappa associa ad ogni autore un valore che risulta essere la lista di tutti gli oggetti Canzone scritti da tale autore
 */
public class Canzone {

    private String titolo;

    private String autore;

    public Canzone(String titolo, String autore) {
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