package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;


/**
 * Stampa informazioni di aiuto.
 */
public class ComandoAiuto implements Comando {
	
	static final private String[] elencoComandi = {"vai", "aiuto", "fine", "prendi", "posa"};
	static final private String NOME = "aiuto";
	
	private IO io;

	@Override
	public void esegui(Partita partita) {
		for(int i=0; i<elencoComandi.length; i++) 
			io.mostraMessaggio(elencoComandi[i]+" ");
		io.mostraMessaggio(" ");

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
