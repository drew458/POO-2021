package calcolatori;

/*
Scrivere il codice dei metodi somma(), moltiplicazione(), modulo() della classe sottostante.
 */

public class ProvaMoltoBanale {

	private int a;
	private int b;

	public ProvaMoltoBanale(int a, int b)  {
		this.a = a;
		this.b = b;
	}

	public int somma() {
		return this.a + this.b;

	}

	public int moltiplicazione() {
		return this.a * this.b;

	}

	public int modulo() {
		if(this.a!=0 && this.b!=0)
			return this.a % this.b;
		return 0;
	}
}
