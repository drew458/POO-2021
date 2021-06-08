package it.classi;

import java.util.Comparator;

public class ComparatoreLibri implements Comparator<Libro> {
	public int compare(Libro l1, Libro l2) {
		return (l1.getAnno()- l2.getAnno());
	}
}
