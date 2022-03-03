package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

/**
 * gli attrezzi posati vengono rimossi dalla borsa e aggiunti alla stanza
 *
 */
public class ComandoPosa extends AbstractComando {

	@Override
	public void esegui(Partita partita) {
		if(partita.getGiocatore().getBorsa().hasAttrezzo(this.getParametro())) {
			partita.getLabirinto().getStanzaCorrente().addAttrezzo(partita.getGiocatore().getBorsa().getAttrezzo(this.getParametro()));
			partita.getGiocatore().getBorsa().removeAttrezzo(this.getParametro());
			this.getIO().mostraMessaggio("Oggetto rimosso dalla borsa!");
		}
		else {
			this.getIO().mostraMessaggio("Non è presente nella stanza!");
		}
	}
}
