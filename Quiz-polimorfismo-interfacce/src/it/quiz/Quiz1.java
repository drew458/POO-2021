package it.quiz;

import it.classi.Animale;
import it.classi.Cane;
import it.classi.Gatto;

public class Quiz1 {
	public void scrivi(Animale r) { 
		System.out.print("Animale "); 
	}

	public void scrivi(Cane l) { 
		System.out.print("Cane "); 
	}

	public void scrivi(Gatto s) { 
		System.out.print("Gatto "); 
	}

	public static void main(String args[]) {
		Quiz1  m = new Quiz1();

		Cane c = new Cane();
		Gatto g = new Gatto();
		Animale a = new Cane();

		a = g;

		m.scrivi(a);
		m.scrivi(g);
		m.scrivi(c);
	}
}

/*
Animale Gatto Cane
Animale Animale Animale
Gatto Gatto Cane
Animale Animale Cane
Cane Gatto Cane
*/