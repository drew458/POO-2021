package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza{
	
	private String nomeAttrezzo;
	
	public StanzaBuia(String nome, String nomeAttrezzo) {
		super(nome);
		this.nomeAttrezzo = nomeAttrezzo;
	}
	
	@Override
	public String getDescrizione() {
		if(!super.hasAttrezzo(nomeAttrezzo))
			return "Qui c'è buio pesto";
		return super.getDescrizione();
		
	}

}
