package ex_comparable_HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//Che cosa stampa questo programma?
public class QuizSet {

	public static void main(String[] args) {
		Set<Libro> libri = new HashSet<Libro>();
		Libro l = new Libro("Karenina");
		libri.add(l);
		l = new Libro("Zorro");
		libri.add(l);
		l = new Libro("Karenina");
		libri.add(l);
		l = new Libro("Bovary");
		libri.add(l);
		libri.add(l);

		List<Libro> listaLibri = new ArrayList<Libro>(libri);
		Collections.sort(listaLibri);
		for(Libro libro : listaLibri) {
			System.out.println(libro.getTitolo());
		}
	}
}

/*
Il programma stampa: RISULTATO
Bovary
Karenina
Karenina
Zorro

SPIEGAZIONE
In Libro manca il metodo hashCode, quindi i libri con gli stessi titoli possono duplicarsi.
Bovary viene aggiunto due volte con libri.add(l) ma nelle collezioni Set non possono essere aggiunti
oggetti uguali (ATTENZIONE, OGGETTI!).
I due Karenina hanno si stesso titolo ma sono OGGETTI DISTINTI aggiunti non di seguito.
Infine Collections.sort ordina per alfabeto.

-----Risposte Sbagliate-----

Il programma stampa:
Bovary
Bovary

Il programma stampa:
Bovary

Il programma stampa:
Bovary
Bovary
Zorro
Karenina
Karenina

Il programma stampa:
Bovary
Zorro
Karenina
*/