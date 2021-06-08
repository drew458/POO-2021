package it.classi;

import java.util.Comparator;

public class ComparatoreMoto implements Comparator<Moto2> {
	public int compare(Moto2 m1, Moto2 m2) {
		return (m1.getCilindrata()- m2.getCilindrata());
	}
}
