package it.classi;

/* 
 * Implementare i metodi equals() e hashCode() della classe Spedizione in modo che i test vadano a buon fine
 */
public class Spedizione {
	private String destinazione;
    private int codice;
    
    public Spedizione(String destinazione, int codice) {
        this.destinazione = destinazione;
        this.codice = codice;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public int getCodice() {
        return codice;
    }
    
    public boolean equals(Spedizione that){
        return this.getCodice() == that.getCodice() && this.getDestinazione()
            == that.getDestinazione();
    }
    
    public int hashCode(){
        return this.getCodice() + this.getDestinazione().hashCode()*31;
    }
}
