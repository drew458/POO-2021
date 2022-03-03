package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;


/**
 * stampa le informazioni sulla stanza corrente e sullo stato della partita
 *
 */
public class ComandoGuarda extends AbstractComando {

	@Override
	public void esegui(Partita partita) {
		if(partita.isFinita() || partita.giocatoreIsVivo()==false)
			return;
		this.getIO().mostraMessaggio("La partita è in corso. Il giocatore è vivo e si trova nella stanza " + partita.getStanzaCorrente().getDescrizione() +""
				+ " con " + partita.getCfu() + " CFU a disposizione.");
	}

}
