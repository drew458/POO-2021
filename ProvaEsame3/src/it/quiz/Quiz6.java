package it.quiz;

import it.classi.Automobile;
import it.classi.Spider;

public class Quiz6 {
	public static void main(String args[]) {
		Automobile a = new Spider();
    	        Automobile b = new Automobile();
	  	a.consumi(b);
        }
}

/* Il programma stampa: Spider.consumi(Automobile) Spider.classe()

* Il programma stampa: Automobile.consumi(Automobile) Spider.classe()

* Il programma stampa: Spider.consumi(Spider) Automobile.classe()

* Il programma stampa: Spider.consumi(Automobile) Automobile.classe()

* Il programma stampa: Automobile.consumi(Spider) Spider.classe()

* Il programma stampa: Automobile.consumi(Automobile) Automobile.classe() */