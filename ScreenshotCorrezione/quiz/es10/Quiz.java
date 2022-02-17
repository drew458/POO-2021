package es10;

class Emittente {
	public void stampa() {
		System.out.println("Emittente radiofonico");
	}
}

class VirginRadio extends Emittente {
	@Override
	public void stampa() {
		System.out.println("Virgin Radio");
	}
}


public class Quiz {
	public static void main(String[] args) {
		Emittente v = new VirginRadio();
		Emittente e = new Emittente();
		e=v;
		stampa(e);
	}
	
	static void stampa(VirginRadio o) {
		Emittente c = (Emittente)o;
		c.stampa();
	}
}

/* 
 * Non compila perché il metodo stampa(VirginRadio o) non accetta un tipo Emittente come parametro
 */