package it.quiz;

import it.classi.Scooter2;
import it.classi.Vespa;

public class Quiz6 {
	public static void main(String args[]) {
		Scooter2 a = new Vespa();
    	Scooter2 b = new Scooter2();
	  	a.tipo(b);
        }
}

/*
Il programma stampa: Vespa.tipo(Scooter) Vespa.costo()

Il programma stampa: Scooter.tipo(Scooter) Vespa.costo()
	
Il programma stampa: Vespa.tipo(Vespa) Scooter.costo()
	
Il programma stampa: Vespa.tipo(Scooter) Scooter.costo()
	
Il programma stampa: Scooter.tipo(Vespa) Vespa.costo()
	
Il programma stampa: Scooter.tipo(Scooter) Scooter.costo()
*/