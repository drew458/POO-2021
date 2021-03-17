
public class StanzaTest2 {
	
	static Stanza bar = new Stanza("bar");
	static Stanza mensa = new Stanza("mensa");
	
	static Attrezzo tazzina = new Attrezzo("tazzina", 0);
	static Attrezzo piatto = new Attrezzo("piatto", 0);

	public static void main(String[] args) {
		bar.impostaStanzaAdiacente("nord", mensa);
		mensa.impostaStanzaAdiacente("sud", bar);
		
		bar.addAttrezzo(tazzina);
		mensa.addAttrezzo(piatto);
		
		System.out.println(bar.getStanzaAdiacente("nord").getAttrezzi());
		System.out.println(mensa.getStanzaAdiacente("sud").getAttrezzi());
	}

}
