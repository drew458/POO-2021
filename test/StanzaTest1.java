import it.uniroma3.diadia.*;
import it.uniroma3.diadia.ambienti.Stanza;

public class StanzaTest1 {
	
	static Stanza bar = new Stanza("bar");
	static Stanza mensa = new Stanza("mensa");
	
	
	
	public static void main(String[] args) {
		bar.impostaStanzaAdiacente("nord", mensa);
		mensa.impostaStanzaAdiacente("sud", bar);
		//bar.getStanzaAdiacente("nord").getDescrizione();
		System.out.println(bar.getStanzaAdiacente("nord").getDescrizione());
		//mensa.getStanzaAdiacente("sud").getDescrizione();
		System.out.println(mensa.getStanzaAdiacente("sud").getDescrizione());
	}

}
