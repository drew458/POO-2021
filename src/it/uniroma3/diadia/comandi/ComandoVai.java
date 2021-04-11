package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class ComandoVai implements Comando {

	private String direzione;
	private IOConsole console;

	@Override
	public void esegui(Partita partita) {
		if(direzione==null)
			console.mostraMessaggio("Dove vuoi andare ?");
		Stanza prossimaStanza = null;
		prossimaStanza = partita.getStanzaCorrente().getStanzaAdiacente(direzione);
		if (prossimaStanza == null)
			console.mostraMessaggio("Direzione inesistente");
		else {
			partita.setStanzaCorrente(prossimaStanza);
			int cfu = partita.getCfu();
			partita.setCfu(cfu--);
		}
		this.console.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
	}


	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
	
		this.direzione=parametro;
	}

	@Override
	public void setIO(IOConsole console) {
		// TODO Auto-generated method stub
		this.console = console;
		
	}

}
