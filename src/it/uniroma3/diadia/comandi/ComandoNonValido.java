package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {
	
	public IOConsole console;

	@Override
	public void esegui(Partita partita) {
		this.console.mostraMessaggio("Comando non valido!");

	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIO(IOConsole console) {
		// TODO Auto-generated method stub

	}

}
