package it.uniroma3.diadia.personaggi;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Strega extends AbstractPersonaggio {
	
	private static final String MESSAGGIO_ADDIO_SALUTATO = "Sono stata clemente solo perché mi hai salutata...";
	private static final String MESSAGGIO_ADDIO_NON_SALUTATO = "Non salutarmi ti è costato caro...";
	private static final String MESSAGGIO_GRAZIE = "Grazie! Ah Ah Ah Ah...";
	private static final String MESSAGGIO_ERRORE = "Sono piena, non posso...";
	
	public Strega(String nome, String presentazione) {
		super(nome, presentazione);
	}

	@Override
	public String agisci(Partita partita) {
		Set<String> direzioni = partita.getStanzaCorrente().getDirezioni();
		Iterator<String> it = direzioni.iterator();
		Collection<Attrezzo> attrezziPresentiIniziali = partita.getStanzaCorrente().getStanzaAdiacente(it.next()).getAttrezzi();
		
		Stanza stanzaConPiuAttrezzi = partita.getStanzaCorrente();
		Stanza stanzaConMenoAttrezzi = partita.getStanzaCorrente();
		
		int numeroAttrezziMassimo = attrezziPresentiIniziali.size();
		int numeroAttrezziMinimo = attrezziPresentiIniziali.size();
		
		
		for(String direzione : direzioni) {
			Collection<Attrezzo> attrezziPresenti = partita.getStanzaCorrente().getStanzaAdiacente(direzione).getAttrezzi();
			if(attrezziPresenti.size() > numeroAttrezziMassimo)
				stanzaConPiuAttrezzi = partita.getStanzaCorrente().getStanzaAdiacente(direzione);
		}
		
		for(String direzione : direzioni) {
			Collection<Attrezzo> attrezziPresenti = partita.getStanzaCorrente().getStanzaAdiacente(direzione).getAttrezzi();
			if(attrezziPresenti.size() < numeroAttrezziMinimo)
				stanzaConMenoAttrezzi = partita.getStanzaCorrente().getStanzaAdiacente(direzione);
		}
		
		if(this.haSalutato() == true) {
			partita.setStanzaCorrente(stanzaConPiuAttrezzi);
			return MESSAGGIO_ADDIO_SALUTATO;
		}
		partita.setStanzaCorrente(stanzaConMenoAttrezzi);
		return MESSAGGIO_ADDIO_NON_SALUTATO;
	}

	@Override
	public String riceviRegalo(Attrezzo attrezzo, Partita partita) {
		if(partita.getGiocatore().getBorsa().addAttrezzo(attrezzo))
			return MESSAGGIO_GRAZIE;
		return MESSAGGIO_ERRORE;
	}
}
