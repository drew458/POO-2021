package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Giocatore;

public class ComandoRegala {
	
	Giocatore giocatore;

	public void regala(Partita partita, String nomeAttrezzo) {
		Attrezzo attrezzo = partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
		partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
		partita.getStanzaCorrente().getPersonaggio().riceviRegalo(attrezzo, partita);
	}
}