package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;


/**
 * Comando "Fine".
 */
public class ComandoFine extends AbstractComando {
	
	static final public String MESSAGGIO_FINE = "Grazie per aver giocato!";

	@Override
	public void esegui(Partita partita) {
		this.getIO().mostraMessaggio(MESSAGGIO_FINE);	// si desidera smettere
		partita.setFinita();
	}

}
