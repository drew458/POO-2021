package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {
	
	private String nomeDirezioneBloccata;
	private String nomeAttrezzoSblocca;
	
	public StanzaBloccata(String nome, String nomeDirezioneBloccata, String nomeAttrezzoSblocca) {
		super(nome);
		this.nomeDirezioneBloccata = nomeDirezioneBloccata;
		this.nomeAttrezzoSblocca = nomeAttrezzoSblocca;
	}
	
	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(!super.hasAttrezzo(nomeAttrezzoSblocca))
			return this;
		return super.getStanzaAdiacente(direzione);
	}
	
	@Override
	public String getDescrizione() {
		if(!super.hasAttrezzo(nomeAttrezzoSblocca))
			return "Qui è tutto bloccato!";
		return super.getDescrizione();
	}

}
