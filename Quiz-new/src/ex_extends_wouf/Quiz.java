package ex_extends_wouf;

//Cosa stampa questo programma?
public class Quiz {
	public static void main(String[] args) {
        Cane a = new Mastino();
        Cane b = new Cane();
        a.verso();
        b.verso();
    }
}

/*
WOOUF WOOUF!!!
Wouf!

Si guardano i tipi dinamici di a e di b
a.verso() <-> Mastino.verso()
b.verso() <-> Cane.verso()

------------------------------

nessuna delle altre

Wouf!
Wouf!

Wouf!
WOOUF WOOUF!!!

WOOUF WOOUF!!!
WOOUF WOOUF!!!
*/