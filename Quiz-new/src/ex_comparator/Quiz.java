package ex_comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Quiz {
	public static void main(String[] args) {
		List<Libro> biblioteca = new LinkedList<Libro>();

		biblioteca.add(new Libro("Cronosisma", 2003));
		biblioteca.add(new Libro("Zorro", 2000));
		biblioteca.add(new Libro("Zorro", 1800));
		biblioteca.add(new Libro("Mostri", 1999));
		Collections.sort(biblioteca, new ComparatoreLibri());

		for(Libro libro : biblioteca)
			System.out.print(libro.getTitolo()+" ");
	}
}

/*
Zorro Mostri Zorro Cronosisma

SPIEGAZIONE
Il Collections.sort usa il ComparatoreLibri e quindi ordina i libri per anno.

Le LinkedList consentono duplicati, quindi anche se ci fossero equals e hashCode il risultato
sarebbe lo stesso.

----Risposte Sbagliate----
Cronosisma Zorro Zorro Mostri
Cronosisma Mostri Zorro Zorro
Cronosisma Mostri Zorro

Zorro Mostri Cronosisma 
*/