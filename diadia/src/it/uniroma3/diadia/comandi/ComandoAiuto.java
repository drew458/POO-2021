package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;


/**
 * Stampa informazioni di aiuto.
 */
public class ComandoAiuto extends AbstractComando {
	
	static final private String[] elencoComandi = {"vai", "aiuto", "fine", "prendi", "posa"};

	@Override
	public void esegui(Partita partita) {
		for(int i=0; i<elencoComandi.length; i++) 
			this.getIO().mostraMessaggio(elencoComandi[i]+" ");
		this.getIO().mostraMessaggio(" ");
		this.getIO().mostraMessaggio("NOTA: il comando Guarda ha 3 varianti: ");
		this.getIO().mostraMessaggio("Guarda 1 ->  contenuto borsa ordinato per nome");
		this.getIO().mostraMessaggio("Guarda 2 ->  contenuto borsa ordinato per peso");
		this.getIO().mostraMessaggio("Guarda 3 ->  contenuto borsa raggruppato per peso");
	}
}
