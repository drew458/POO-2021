package it.uniroma3.diadia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IOSimulator implements IO {
	
	private List<String> messaggiProdotti;
	private List<String> righeDaLeggere;
	private Iterator<String> indiceRigheDaLeggere;
	private Iterator<String> indiceMessaggiProdotti;
		
	
	public IOSimulator(String[] righeDaLeggere) {
		this.righeDaLeggere = new ArrayList<>();
		this.messaggiProdotti = new ArrayList<>();
		this.indiceRigheDaLeggere = this.righeDaLeggere.iterator();
		this.indiceMessaggiProdotti = this.messaggiProdotti.iterator();
	}

	@Override
	public void mostraMessaggio(String messaggio) {
		if(indiceMessaggiProdotti.hasNext())
			messaggio = this.indiceMessaggiProdotti.next();
	}

	@Override
	public String leggiRiga() {
		String rigaLetta = this.indiceRigheDaLeggere.next();
		return rigaLetta;
	}
	
	public String nextMessaggio() {
		return indiceMessaggiProdotti.next();
	}
	
	public boolean hasNextMessaggio() {
		return this.indiceMessaggiProdotti.hasNext();
	}

}
