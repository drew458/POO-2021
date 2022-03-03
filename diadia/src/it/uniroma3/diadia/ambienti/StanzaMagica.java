package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

/**
 * Una stanza magica ha delle particolarità, che la rendono diversa dalla stanza ordinaria:
 * – dopo N volte che in tale stanza viene posato (aggiunto) 
 * un qualsiasi attrezzo da parte del giocatore, la stanza inizierà a comportarsi «magicamente»
 * – quando la stanza si comporta magicamente, ogni volta che posiamo un attrezzo, la stanza "inverte" il nome 
 * dell'attrezzo e ne raddoppia il peso. Ad esempio: se posiamo (togliamo dalla borsa e aggiungiamo alla stanza) 
 * l'attrezzo con nome 'chiave' e peso 2, la stanza memorizza un attrezzo con nome 'evaihc' e peso 4
 * – quando la stanza non si comporta magicamente, il comportamento rimane quello usuale.
 *
 */
public class StanzaMagica extends Stanza {

	private static final int SOGLIA_MAGICA_DEFAULT = 3;

	private int contatoreAttrezziPosati;
	private int sogliaMagica;

	public StanzaMagica(String nome) {
		this(nome, SOGLIA_MAGICA_DEFAULT);
	}

	public StanzaMagica(String nome, int soglia) {
		super(nome);
		this.contatoreAttrezziPosati = 0;
		this.sogliaMagica = soglia;
	}

	@Override
	public boolean addAttrezzo(Attrezzo attrezzo) { 
		this.contatoreAttrezziPosati++;
		if (this.contatoreAttrezziPosati>this.sogliaMagica) 
			attrezzo = this.modificaAttrezzo(attrezzo);
		
		return super.addAttrezzo(attrezzo);
	}
	
	public Attrezzo modificaAttrezzo(Attrezzo attrezzo) {
		StringBuilder nomeInvertito;
		int pesoX2 = attrezzo.getPeso() * 2;
		nomeInvertito = new StringBuilder(attrezzo.getNome());
		nomeInvertito = nomeInvertito.reverse();
		attrezzo = new Attrezzo(nomeInvertito.toString(), pesoX2);
		
		return attrezzo;
	}

}
