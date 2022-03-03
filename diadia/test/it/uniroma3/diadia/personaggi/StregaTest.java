package it.uniroma3.diadia.personaggi;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StregaTest {
	
	private static final String NOME_STREGA = "Crudelia";
	private static final String MESSAGGIO_PRESENTAZIONE = "Dal tuo saluto dipenderanno le tue sorti...";
	
	private static final String NOME_STANZA_NORD = "stanza nord";
	private static final String NOME_STANZA_SUD = "stanza sud";
	private static final String NOME_STANZA_EST = "stanza est";
	private static final String NOME_STANZA_OVEST = "stanza ovest";
	private static final String NOME_STANZA_NORDOVEST = "stanza nordovest";
	private static final String NOME_STANZA_SUDEST = "stanza sudest";
	
	
	private static final String DIREZIONE_NORD = "nord";
	private static final String DIREZIONE_SUD = "sud";
	private static final String DIREZIONE_EST = "est";
	private static final String DIREZIONE_OVEST = "ovest";
	private static final String DIREZIONE_NORDOVEST = "nordovest";
	private static final String DIREZIONE_SUDEST = "sudest";
	
	private static final String NOME_MARTELLO = "martello";
	private static final String NOME_SPADA = "spada";
	private static final String NOME_PICCONE = "piccone";
	private static final String NOME_SCIABOLA = "sciabola";
	private static final String NOME_ARCO = "arco";
	private static final String NOME_FIONDA = "fionda";
	private static final String NOME_FRECCIA = "freccia";
	private static final String NOME_CACCIAVITE = "cacciavite";
	private static final String NOME_COLTELLO = "coltello";
	private static final String NOME_PIETRA = "pietra";
	
	Stanza stanzaNord;
	Stanza stanzaSud;
	Stanza stanzaEst;
	Stanza stanzaOvest;
	Stanza stanzaNordOvest;
	Stanza stanzaSudEst;
	
	
	Labirinto labirinto;
	Partita partita;
	Strega strega;

	@Before
	public void setUp() throws Exception {
		this.labirinto = new Labirinto();
		this.partita = new Partita(labirinto);
		this.strega = new Strega(NOME_STREGA, MESSAGGIO_PRESENTAZIONE);
		impostaStanzeEAdiacenze(this.partita);
		creaAttrezzi(this.partita);
	}

	@Test
	public void testAgisciNonSalutata() {
		this.strega.agisci(this.partita);
		assertEquals(this.stanzaOvest, this.partita.getStanzaCorrente());
	}
	
	public void impostaStanzeEAdiacenze(Partita partita) {
		this.stanzaNord = new Stanza(NOME_STANZA_NORD);
		this.stanzaSud = new Stanza(NOME_STANZA_SUD);
		this.stanzaEst = new Stanza(NOME_STANZA_EST);
		this.stanzaOvest = new Stanza(NOME_STANZA_OVEST);
		this.stanzaNordOvest = new Stanza(NOME_STANZA_NORDOVEST);
		this.stanzaSudEst = new Stanza(NOME_STANZA_SUDEST);
		
		partita.getStanzaCorrente().impostaStanzaAdiacente(DIREZIONE_NORD, stanzaNord);
		partita.getStanzaCorrente().impostaStanzaAdiacente(DIREZIONE_SUD, stanzaSud);
		partita.getStanzaCorrente().impostaStanzaAdiacente(DIREZIONE_EST, stanzaEst);
		partita.getStanzaCorrente().impostaStanzaAdiacente(DIREZIONE_OVEST, stanzaOvest);
		partita.getStanzaCorrente().impostaStanzaAdiacente(DIREZIONE_NORDOVEST, stanzaNordOvest);
		partita.getStanzaCorrente().impostaStanzaAdiacente(DIREZIONE_SUDEST, stanzaSudEst);
	}
	
	public void creaAttrezzi(Partita partita) {
		Set<Attrezzo> attrezzi = new HashSet<Attrezzo>();		
		
		Attrezzo martello = new Attrezzo(NOME_MARTELLO, 1);
		Attrezzo spada = new Attrezzo(NOME_SPADA, 2);
		Attrezzo piccone = new Attrezzo(NOME_PICCONE, 3);
		Attrezzo sciabola = new Attrezzo(NOME_SCIABOLA, 4);
		Attrezzo arco = new Attrezzo(NOME_ARCO, 5);
		Attrezzo fionda = new Attrezzo(NOME_FIONDA, 6);
		Attrezzo freccia = new Attrezzo(NOME_FRECCIA, 7);
		Attrezzo cacciavite = new Attrezzo(NOME_CACCIAVITE, 8);
		Attrezzo coltello = new Attrezzo(NOME_COLTELLO, 9);
		Attrezzo pietra = new Attrezzo(NOME_PIETRA, 10);
		
		attrezzi.add(martello);
		attrezzi.add(spada);
		attrezzi.add(piccone);
		attrezzi.add(sciabola);
		attrezzi.add(arco);
		attrezzi.add(fionda);
		attrezzi.add(freccia);
		attrezzi.add(cacciavite);
		attrezzi.add(coltello);
		attrezzi.add(pietra);
		
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORD).addAttrezzo(martello);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORD).addAttrezzo(spada);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORD).addAttrezzo(piccone);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORD).addAttrezzo(sciabola);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORD).addAttrezzo(arco);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORD).addAttrezzo(fionda);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_SUD).addAttrezzo(martello);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_SUD).addAttrezzo(spada);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_SUD).addAttrezzo(piccone);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_EST).addAttrezzo(martello);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_EST).addAttrezzo(spada);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_EST).addAttrezzo(piccone);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_EST).addAttrezzo(sciabola);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_EST).addAttrezzo(arco);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_OVEST).addAttrezzo(sciabola);
		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_OVEST).addAttrezzo(arco);
//		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORDOVEST).addAttrezzo(piccone);
//		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORDOVEST).addAttrezzo(martello);
//		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORDOVEST).addAttrezzo(spada);
//		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_NORDOVEST).addAttrezzo(piccone);
//		partita.getStanzaCorrente().getStanzaAdiacente(DIREZIONE_SUDEST).addAttrezzo(fionda);
		
	}

}
