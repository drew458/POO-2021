package it.quiz;

import it.classi.Albero2;
import it.classi.Pero2;

public class Quiz6 {
	public static void main(String args[]) {

		Albero2 a = new Pero2();
		Albero2 b = new Albero2();

		a.innesta(b);
	}
}

/*
Il programma stampa: Pero.innesta(Albero) Pero.altezza()
	
Il programma stampa: Albero.innesta(Albero) Albero.altezza()
	
Il programma stampa: Pero.innesta(Pero) Albero.altezza()
	
Il programma stampa: Pero.innesta(Albero) Albero.altezza()
	
Il programma stampa: Pero.innesta(Pero) Pero.altezza()
	
Il programma stampa: Albero.innesta(Pero) Albero.altezza()
*/
