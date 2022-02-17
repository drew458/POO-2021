package domanda5;

interface Veicolo {
	public void gira();
}

class Motocicletta implements Veicolo {
	public Motocicletta() {}
	public void gira() {}
}

class Automobile implements Veicolo {
	public Automobile() {}
	public void gira(){}
}

public class Quiz {
	public void scrivi(Veicolo a) { 
		System.out.print("Veicolo "); 
	}

	public void scrivi(Motocicletta b) { 
		System.out.print("Motocicletta "); 
	}

	public void scrivi(Automobile c) { 
		System.out.print("Automobile "); 
	}

	public static void main(String args[]) {
		Quiz m = new Quiz();

		Motocicletta g = new Motocicletta();
		Automobile c = new Automobile();
		Veicolo s = new Motocicletta();

		s = c;

 		m.scrivi(s);
		m.scrivi(c);
		m.scrivi(g);
	}
}

/*
 * Automobile Automobile Motocicletta */