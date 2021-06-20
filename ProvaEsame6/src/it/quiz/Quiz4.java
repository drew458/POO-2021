package it.quiz;

import java.util.LinkedList;
import java.util.List;

import it.classi.Auto2;

public class Quiz4 {
	public static void main(String[] argc) {
        List<Auto2> l = new LinkedList<Auto2>();

        Auto2 a = new Auto2("1600");
        l.add(a);
        a = new Auto2("2000");
        l.add(a);
        a.setCilindrata("1300");
        Auto2 b;
        b = a;
        b.setCilindrata("1000");
        l.add(b);
        for(Auto2 p : l)
            System.out.print(p.getCilindrata()+" ");
    }
}

/*
Il programma stampa: 1600 1000 1000

Il programma stampa: 1600 2000 1300 1000
	
Il programma stampa: 1600 1300 1000
	
Il programma stampa: 1600 2000 1000
	
Il programma stampa: 1600 2000 1300
*/