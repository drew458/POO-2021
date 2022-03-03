package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

/**
 *  gli attrezzi presi vengono rimossi dalla stanza e aggiunti alla borsa
 *
 */
public class ComandoPrendi extends AbstractComando {

	@Override
	public void esegui(Partita partita) {
		if(partita.getLabirinto().getStanzaCorrente().hasAttrezzo(this.getParametro())) {
			partita.getGiocatore().getBorsa().addAttrezzo(partita.getLabirinto().getStanzaCorrente().getAttrezzo(this.getParametro()));
			partita.getLabirinto().getStanzaCorrente().removeAttrezzo(partita.getLabirinto().getStanzaCorrente().getAttrezzo(this.getParametro()));
			this.getIO().mostraMessaggio("Oggetto inserito nella borsa!");
		}
		else {
			this.getIO().mostraMessaggio("Non è presente nella stanza!");
		}
	}
}
