package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;


/**
 * stampa le informazioni sulla stanza corrente e sullo stato della partita
 *
 */
public class ComandoGuarda implements Comando {
	
	private IOConsole console;

	@Override
	public void esegui(Partita partita) {
		if(partita.isFinita() || partita.giocatoreIsVivo()==false)
			return;
		this.console.mostraMessaggio("La partita è in corso. Il giocatore è vivo e si trova nella stanza " + partita.getStanzaCorrente().getDescrizione() +""
				+ " con " + partita.getCfu() + " CFU a disposizione.");
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIO(IOConsole console) {
		this.console = console;

	}

}
