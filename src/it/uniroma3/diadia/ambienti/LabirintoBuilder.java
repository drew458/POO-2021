package it.uniroma3.diadia.ambienti;

import java.util.HashMap;
import java.util.Map;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class LabirintoBuilder {
	
	private Labirinto labirinto;
	private Stanza ultimaStanza;
	private Map<String, Stanza> nome2stanza;
	
	public LabirintoBuilder() {
		this.labirinto = new Labirinto();
		this.nome2stanza = new HashMap<>();
	}
	
	/**
	 * Aggiunge una stanza, che sarà anche iniziale
	 * @param stanzaIniziale
	 */
	public void addStanzaIniziale(String stanzaIniziale) {
		Stanza stanza = new Stanza(stanzaIniziale);
		this.labirinto.setStanzaCorrente(stanza);
		this.nome2stanza.put(stanzaIniziale, stanza);
		this.ultimaStanza = stanza;
	}
	
	/**
	 * Specifica quale stanza sarà vincente
	 * @param stanzaVincente
	 */
	public void addStanzaVincente(String stanzaVincente) {
		Stanza stanza = new Stanza(stanzaVincente);
		this.labirinto.setStanzaVincente(stanza);
		this.nome2stanza.put(stanzaVincente, stanza);
		this.ultimaStanza = stanza;
	}
	
	public void addStanza(String nomeStanza) {
		Stanza stanza = new Stanza(nomeStanza);
		this.nome2stanza.put(nomeStanza, stanza);
		this.ultimaStanza = stanza;
	}
	
	/**
	 * dove? fa riferimento all’ultima stanza aggiunta
	 * @param nomeAttrezzo
	 * @param peso
	 */
	public void addAttrezzo(String nomeAttrezzo, int peso) {
		Attrezzo attrezzo = new Attrezzo(nomeAttrezzo, peso);
		this.ultimaStanza.addAttrezzo(attrezzo);
	}
	
	/**
	 * EXAMPLE addAdiacenza(“salotto”, ”camera”, “nord”) MEANS camera si trova a nord di salotto
	 * @param nomeStanzaDiPartenza
	 * @param nomeStanzaDiArrivo
	 * @param direzione
	 */
	public void addAdiacenza(String nomeStanzaDiPartenza, String nomeStanzaDiArrivo, String direzione) {
		Stanza stanzaDiPartenza = new Stanza(nomeStanzaDiPartenza);
		Stanza stanzaDiArrivo = new Stanza(nomeStanzaDiArrivo);
		stanzaDiPartenza.impostaStanzaAdiacente(direzione, stanzaDiArrivo);
	}
	
	/**
	 * restituisce il Labirinto così creato
	 * @return
	 */
	public Labirinto getLabirinto() {
		return this.labirinto;
	}
	
	public Map<String, Stanza> getStanze(){
		return this.nome2stanza;
	}
}
