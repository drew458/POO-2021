package it.classi;

import java.util.Comparator;

public class ComparatoreAuto implements Comparator<Auto3> {
	public int compare(Auto3 a1, Auto3 a2) {
		return (a1.getCilindrata()- a2.getCilindrata());
	}
}
