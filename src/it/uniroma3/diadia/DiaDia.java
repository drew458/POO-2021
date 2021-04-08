package it.uniroma3.diadia;

import java.util.Scanner;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Borsa;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Classe principale di diadia, un semplice gioco di ruolo ambientato al dia.
 * Per giocare crea un'istanza di questa classe e invoca il metodo gioca.
 *
 * Questa � la classe principale: crea e istanzia tutte le altre.
 *
 * @author  docente di POO 
 *         (da un'idea di Michael Kolling and David J. Barnes) 
 *          
 * @version base
 */

public class DiaDia {

	static final private String MESSAGGIO_BENVENUTO = ""+
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chiss�!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";
	
	static final private String[] elencoComandi = {"vai", "aiuto", "fine", "prendi", "posa"};

	private Partita partita;
	//private Labirinto labirinto = new Labirinto();
	//private Giocatore giocatore = new Giocatore();
	//private Borsa borsa;
	//private Stanza stanza;
	private IOConsole console; //= new IOConsole();

	public DiaDia(IOConsole console) {
		this.partita = new Partita();
		this.console = console;
	}

	public void gioca() {
		String istruzione; 

		console.mostraMessaggio(MESSAGGIO_BENVENUTO);	
		do
			istruzione = this.console.leggiRiga();
		while (!processaIstruzione(istruzione));
	}   


	/**
	 * Processa un istruzione 
	 *
	 * @return true se l'istruzione � eseguita e il gioco continua, false altrimenti.
	 */
	private boolean processaIstruzione(String istruzione) {
		Comando comandoDaEseguire = new Comando(istruzione);
		
		if(comandoDaEseguire.getNome().equals(null))
			return false;
		if (comandoDaEseguire.getNome().equals("fine")) {
			this.fine(); 
			return true;
		} else if (comandoDaEseguire.getNome().equals("vai"))
			this.vai(comandoDaEseguire.getParametro());
		else if (comandoDaEseguire.getNome().equals("aiuto"))
			this.aiuto();
		else if (comandoDaEseguire.getNome().equals("prendi"))
			this.prendi(comandoDaEseguire.getParametro());
		else if (comandoDaEseguire.getNome().equals("posa"))
			this.posa(comandoDaEseguire.getParametro());
		else
			this.console.mostraMessaggio("Comando sconosciuto");
		if (this.partita.vinta()) {
			this.console.mostraMessaggio("Hai vinto!");
			return true;
		} else
			return false;
	}   

	// implementazioni dei comandi dell'utente:

	/**
	 * Stampa informazioni di aiuto.
	 */
	private void aiuto() {
		for(int i=0; i< elencoComandi.length; i++) 
			console.mostraMessaggio(elencoComandi[i]+" ");
		//console.mostraMessaggio(" ");
	}

	/**
	 * Cerca di andare in una direzione. Se c'� una stanza ci entra 
	 * e ne stampa il nome, altrimenti stampa un messaggio di errore.
	 */
	private void vai(String direzione) {
		if(direzione==null)
			console.mostraMessaggio("Dove vuoi andare ?");
		Stanza prossimaStanza = null;
		prossimaStanza = this.partita.getStanzaCorrente().getStanzaAdiacente(direzione);
		if (prossimaStanza == null)
			console.mostraMessaggio("Direzione inesistente");
		else {
			this.partita.setStanzaCorrente(prossimaStanza);
			int cfu = this.partita.getCfu();
			this.partita.setCfu(cfu--);
		}
		console.mostraMessaggio(this.partita.getStanzaCorrente().getDescrizione());
	}
	
	private void prendi(String attrezzo) {
		if(attrezzo==null)
			console.mostraMessaggio("Che attrezzo vuoi prendere?");
		if(partita.getStanzaCorrente().hasAttrezzo(attrezzo) == false)
			console.mostraMessaggio("Attrezzo non presente nella stanza!");
		else {
			this.partita.getStanzaCorrente().removeAttrezzo(attrezzo);
			this.partita.getStanzaCorrente().addAttrezzo(this.partita.getStanzaCorrente().getAttrezzo(attrezzo));
			this.console.mostraMessaggio("Attrezzo " + attrezzo + " preso!");
		}
	}
	
	private void posa(String attrezzo) {
		if(attrezzo==null)
			console.mostraMessaggio("Che attrezzo vuoi prendere?");
		if(this.partita.getStanzaCorrente().hasAttrezzo(attrezzo) == false)
			console.mostraMessaggio("Attrezzo non presente nella stanza!");
		else {
			this.partita.getStanzaCorrente().removeAttrezzo(attrezzo);
			this.partita.getStanzaCorrente().addAttrezzo(this.partita.getStanzaCorrente().getAttrezzo(attrezzo));
			this.console.mostraMessaggio("Attrezzo" + attrezzo + " posato!");
		}
			
	}
	

	/**
	 * Comando "Fine".
	 */
	private void fine() {
		System.out.println("Grazie di aver giocato!");  // si desidera smettere
	}

	public static void main(String[] argc) {
		IOConsole console = new IOConsole();
		DiaDia gioco = new DiaDia(console);
		gioco.gioca();
	}
}