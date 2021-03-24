package it.uniroma3.diadia;

/** 
 * Questa classe rappresenta il labirinto
 * 
 * @see Stanza
 * @version base 
 */

public class Labirinto {
	
	public Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	
	public void creaStanze() {
		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");
		
		/* collega le stanze */
		atrio.impostaStanzaAdiacente("nord", biblioteca);
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("sud", aulaN10);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", laboratorio);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nord", atrio);
		aulaN10.impostaStanzaAdiacente("est", aulaN11);
		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
		biblioteca.impostaStanzaAdiacente("sud", atrio);
		
		// il gioco comincia nell'atrio
	    stanzaCorrente = atrio;  
		stanzaVincente = biblioteca;
	}
	
	public Stanza getStanzaVincente() {
    	return stanzaVincente;
    }

    public void setStanzaCorrente(Stanza stanzaCorrente) {
    	this.stanzaCorrente = stanzaCorrente;
    }

    public Stanza getStanzaCorrente() {
    	return this.stanzaCorrente;
    }
}


