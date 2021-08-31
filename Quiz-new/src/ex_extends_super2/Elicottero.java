package ex_extends_super2;

//Che cosa stampa il seguente programma se eseguito? 
public class Elicottero extends Velivolo {

	public String motore() {
		return "Elicottero-motore";
	}

	public String toString() {
		return motore() + " " + super.motore() + " " + this.tipologia();
	}

	public static void main(String argv[]) {
		Velivolo v = new Elicottero();
		System.out.println(v.toString());
	}
}

/*
Elicottero-motore Velivolo-motore Velivolo-tipologia

-----Risposte sbagliate-----
Velivolo-motore Velivolo-motore Velivolo-tipologia
Elicottero-tipologia Velivolo-tipologia Velivolo-tipologia
Elicottero-motore Elicottero-motore Elicottero-tipologia
*/