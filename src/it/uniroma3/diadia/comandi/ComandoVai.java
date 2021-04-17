package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

/**
 * Cerca di andare in una direzione. Se c'e' una stanza ci entra 
 * e ne stampa il nome, altrimenti stampa un messaggio di errore
 */
public class ComandoVai implements Comando {
	
	static final private String NOME = "vai";

	private String direzione;
	private IOConsole console;

	@Override
	public void esegui(Partita partita) {
		Stanza stanzaCorrente = partita.getStanzaCorrente();
		Stanza prossimaStanza = null;
		if(this.direzione==null) {
			this.console.mostraMessaggio("Dove vuoi andare? Devi specificare una direzione");
			return;
		}
		prossimaStanza = stanzaCorrente.getStanzaAdiacente(this.direzione);
		if(prossimaStanza==null) {
			this.console.mostraMessaggio("Direzione inesistente");
			return;
		}
		partita.setStanzaCorrente(prossimaStanza);
		this.console.mostraMessaggio(partita.getStanzaCorrente().getNome());
		partita.getGiocatore().setCfu(partita.getGiocatore().getCfu()-1);
	}


	@Override
	public void setParametro(String parametro) {
		this.direzione=parametro;
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
