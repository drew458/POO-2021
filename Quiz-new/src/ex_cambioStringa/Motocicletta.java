package ex_cambioStringa;

//Che cosa stampa?
public class Motocicletta {

	private int anno;
	private String targa;

	public Motocicletta(String targa, int anno) {
		this.targa = targa;
		this.anno = anno;
	}

	public void cambioTarga(String targa) {
		this.targa = targa;
	}

	public String toString() {
		return this.targa + " " + this.anno;
	}

	public static void main(String[] args) {
		Motocicletta m1 = new Motocicletta("1111", 1);
		Motocicletta m2 = new Motocicletta("2222", 2);
		Motocicletta m3 = m1;

		System.out.println(m1.toString());
		System.out.println(m2.toString());

		m2 = m3;
		m2.cambioTarga("3333");

		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}

/*
1111 1
2222 2
3333 1
3333 1

SPIEGAZIONE

m3 -> m1
Non influisce sulla prima stampa che è
1111 1
2222 2

m2 -> m3 quindi m2 -> m1

la targa dell'oggetto puntato da m2 (m1) diventa 3333

Seconda stampa
3333,1
3333,1

---------Altre risposte---------

1111 1
1111 1
3333 1
3333 1

1111 1
2222 2
3333 1
2222 2

1111 1
1111 1
1111 1
3333 1

2222 2
2222 2
3333 1
3333 1

1111 1
2222 2
3333 1
1111 1
*/