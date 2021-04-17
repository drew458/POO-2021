package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

/**
 * gli attrezzi posati vengono rimossi dalla borsa e aggiunti alla stanza
 *
 */
public class ComandoPosa implements Comando {

	private IOConsole console;
	private String attrezzo;

	@Override
	public void esegui(Partita partita) {
		Attrezzo attrezzoDaPosare = partita.getGiocatore().getBorsa().getAttrezzo(this.attrezzo);

		if(attrezzoDaPosare == null) {
			console.mostraMessaggio("Attrezzo non presente nella stanza!");
			return;
		}
		partita.getGiocatore().getBorsa().removeAttrezzo(this.attrezzo);
		partita.getStanzaCorrente().addAttrezzo(attrezzoDaPosare);
		this.console.mostraMessaggio("Attrezzo " + this.attrezzo + " posato!");
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
