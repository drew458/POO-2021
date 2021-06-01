package it.uniroma3.diadia.personaggi;

import java.util.SortedSet;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Cane extends AbstractPersonaggio {
	
	private static final String MESSAGGIO_ADDIO = "Hai appena incontrato un cane molto arrabbiato!";
	private static final String MESSAGGIO_ERRORE = "Sei già in fin di vita, per questa volta lascerò perdere...";
	private static final String MESSAGGIO_GRAZIE = "Grazie!";
	
	private Attrezzo attrezzoPreferito;
	
	public Cane(String nome, String presentazione, Attrezzo attrezzoPreferito) {
		super(nome, presentazione);
		this.attrezzoPreferito = attrezzoPreferito;
	}

	@Override
	public String agisci(Partita partita) {
		int cfuCorrenti = partita.getCfu();
		if(cfuCorrenti <= 0) 
			return MESSAGGIO_ERRORE;
		int cfuAggiornati = cfuCorrenti-1;
		partita.setCfu(cfuAggiornati);
		return MESSAGGIO_ADDIO;
	}

	@Override
	public String riceviRegalo(Attrezzo attrezzo, Partita partita) {
		if(attrezzo.equals(this.attrezzoPreferito)) {
			SortedSet<Attrezzo> attrezzi = partita.getGiocatore().getBorsa().getContenutoOrdinatoPerNome();
			partita.getGiocatore().getBorsa().removeAttrezzo(attrezzi.last().getNome()); 
			partita.getGiocatore().getBorsa().addAttrezzo(attrezzo);
			return MESSAGGIO_GRAZIE;
		}
		else
			return this.agisci(partita);
	}
}
