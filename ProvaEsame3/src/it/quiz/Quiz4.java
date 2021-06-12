package it.quiz;

import java.util.LinkedList;
import java.util.List;

import it.classi.Auto2;

public class Quiz4 {
	public static void main(String[] argc) {
        List<Auto2> l = new LinkedList<Auto2>();

        Auto2 a = new Auto2("Honda");
        l.add(a);
        a.setMarca("Opel");
        a = new Auto2("FIAT");
        l.add(a);
        Auto2 b;
        b = a;
        b.setMarca("BMW");
        l.add(b);
        for(Auto2 p : l)
            System.out.print(p.getMarca()+" ");
    }
}

/* Il programma stampa: Opel BMW BMW

* Il programma stampa: Honda Opel FIAT BMW

* Il programma stampa: Honda BMW

* Il programma stampa: Honda FIAT BMW

* Il programma stampa: Opel FIAT BMW */