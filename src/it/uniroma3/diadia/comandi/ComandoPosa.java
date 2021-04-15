package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {
	
	private IOConsole console;
	private String attrezzo;

	@Override
	public void esegui(Partita partita) {
		if(this.attrezzo==null)
			console.mostraMessaggio("Che attrezzo vuoi prendere?");
		if(partita.getStanzaCorrente().hasAttrezzo(this.attrezzo) == false)
			console.mostraMessaggio("Attrezzo non presente nella stanza!");
		else {
			partita.getGiocatore().getBorsa().removeAttrezzo(this.attrezzo);
			partita.getStanzaCorrente().addAttrezzo(partita.getStanzaCorrente().getAttrezzo(this.attrezzo));
			this.console.mostraMessaggio("Attrezzo" + this.attrezzo + " posato!");
		}

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
