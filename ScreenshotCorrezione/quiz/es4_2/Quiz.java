package es4_2;

/* Che cosa stampa questo programma */

class Coppia<T>{
	
	private T primo;
	private T secondo;
	
	public Coppia(T primo, T secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}

	public T getPrimo() {
		return primo;
	}

	public T getSecondo() {
		return secondo;
	}	
}

class Emittente {
	public void stampa() {
		System.out.println("Emittente radiofonica");
	}
}

class Radio24 extends Emittente {
	@Override
	public void stampa() {
		System.out.println("Radio 24");
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
		Emittente r = new Radio24();
		VirginRadio v = new VirginRadio();
		Emittente e = new Emittente();
		e=v;
		stampa(new Coppia<Emittente>(r, e));
	}

	private static void stampa(Coppia<? extends Emittente> c) {
		c.getSecondo().stampa();
	}	
}

/*
 * 
 * Virgin Radio 
 * 
*/