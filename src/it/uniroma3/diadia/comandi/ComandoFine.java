package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;


/**
 * Comando "Fine".
 */
public class ComandoFine implements Comando {
	
	static final private String NOME = "fine";
	
	private IOConsole console;

	@Override
	public void esegui(Partita partita) {
		console.mostraMessaggio("Grazie di aver giocato!");  // si desidera smettere
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setIO(IOConsole console) {
		this.console = console;
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
