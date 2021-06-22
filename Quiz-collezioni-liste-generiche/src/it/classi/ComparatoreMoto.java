package it.classi;

import java.util.Comparator;

public class ComparatoreMoto implements Comparator<Moto> {
	public int compare(Moto m1, Moto m2) {
		return (m1.getCilindrata()- m2.getCilindrata());
	}
}
