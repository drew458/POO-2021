package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando {
	
	private IOConsole console;
	private String attrezzo;

	@Override
	public void esegui(Partita partita) {
		if(partita.getStanzaCorrente().getAttrezzo(this.attrezzo)==null)
			console.mostraMessaggio("Che attrezzo vuoi prendere?");
		if(partita.getStanzaCorrente().hasAttrezzo(this.attrezzo) == false) {
			console.mostraMessaggio("Attrezzo non presente nella stanza!");
			return;
		}
		else {
			Attrezzo attrezzoDaPrendere = partita.getStanzaCorrente().getAttrezzo(this.attrezzo);
			partita.getStanzaCorrente().removeAttrezzo(attrezzoDaPrendere);
			partita.getGiocatore().getBorsa().addAttrezzo(attrezzoDaPrendere);
			this.console.mostraMessaggio("Attrezzo " + this.attrezzo + " preso!");
		}

	}

	@Override
	public void setParametro(String parametro) {
		this.attrezzo = parametro;
	}

	@Override
	public void setIO(IOConsole console) {
		this.console = console;
	}

}
