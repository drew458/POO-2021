package it.quiz;

import it.classi.K;

public class Quiz1 {
	public static void main (String[] args) {
		K k = new K();
		int i = 1;
		k.stampa(i++);
		i++;
		float a = i++;
		k.stampa("i");
		k.stampa(a);
	}
}
