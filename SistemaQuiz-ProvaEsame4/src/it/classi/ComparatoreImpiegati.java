package it.classi;

import java.util.Comparator;

public class ComparatoreImpiegati implements Comparator<Impiegato> {
	public int compare(Impiegato i1, Impiegato i2) {
		return (i1.getMatricola().compareTo(i2.getMatricola()));
	}
}
