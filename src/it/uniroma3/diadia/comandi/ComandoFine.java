package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;


/**
 * Comando "Fine".
 */
public class ComandoFine implements Comando {
	
	static final private String NOME = "fine";
	static final public String MESSAGGIO_FINE = "Grazie di aver giocato!";
	
	private IO io;

	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio(MESSAGGIO_FINE);  // si desidera smettere
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setIO(IO io) {
		this.io = io;
	}

	@Override
	public String getParametro() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNome() {
		return NOME;		
	}

}
