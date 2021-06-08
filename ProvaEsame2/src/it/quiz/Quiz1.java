package it.quiz;

import it.classi.Cross;
import it.classi.Moto;
import it.classi.Scooter;

public class Quiz1 {
	public void mostra(Moto a) {
		System.out.print("Moto ");
	}
	public void mostra(Scooter u) {
		System.out.print("Scooter ");
	}
	public void mostra(Cross c) {
		System.out.print("Cross ");
	}

	public static void main(String args[]) {
		Quiz1 q = new Quiz1();
		Scooter s = new Scooter();
		Cross c = new Cross();
		Moto ms = new Scooter();
		ms = c;
		q.mostra(s);
		q.mostra(ms);
		q.mostra(c);
	}
}
