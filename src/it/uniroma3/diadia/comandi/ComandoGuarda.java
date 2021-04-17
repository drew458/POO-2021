package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;


/**
 * stampa le informazioni sulla stanza corrente e sullo stato della partita
 *
 */
public class ComandoGuarda implements Comando {
	
	static final private String NOME = "guarda";
	
	private IO io;

	@Override
	public void esegui(Partita partita) {
		if(partita.isFinita() || partita.giocatoreIsVivo()==false)
			return;
		this.io.mostraMessaggio("La partita è in corso. Il giocatore è vivo e si trova nella stanza " + partita.getStanzaCorrente().getDescrizione() +""
				+ " con " + partita.getCfu() + " CFU a disposizione.");
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIO(IO io) {
		this.io = io;

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
