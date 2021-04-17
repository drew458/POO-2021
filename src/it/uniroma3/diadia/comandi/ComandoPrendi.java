package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

/**
 *  gli attrezzi presi vengono rimossi dalla stanza e aggiunti alla borsa
 *
 */
public class ComandoPrendi implements Comando {
	
	static final private String NOME = "prendi";

	private IO io;
	private String attrezzo;

	@Override
	public void esegui(Partita partita) {
		Attrezzo attrezzoDaPrendere = partita.getStanzaCorrente().getAttrezzo(this.attrezzo);

		if(attrezzoDaPrendere == null) {
			io.mostraMessaggio("Attrezzo non presente nella stanza!");
			return;
		}
		partita.getStanzaCorrente().removeAttrezzo(attrezzoDaPrendere);
		partita.getGiocatore().getBorsa().addAttrezzo(attrezzoDaPrendere);
		this.io.mostraMessaggio("Attrezzo " + this.attrezzo + " preso!");

	}

	@Override
	public void setParametro(String parametro) {
		this.attrezzo = parametro;
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
