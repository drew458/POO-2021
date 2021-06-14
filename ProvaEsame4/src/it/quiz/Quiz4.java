package it.quiz;

import java.util.LinkedList;
import java.util.List;

import it.classi.Strada;

public class Quiz4 {
	public static void main(String[] argc) {
        List<Strada> l = new LinkedList<Strada>();

        Strada a = new Strada("Appia");
        l.add(a);
        a.setNome("Casilina");
        a = new Strada("Laurentina");
        l.add(a);
        Strada b;
        b = a;
        b.setNome("Cassia");
        l.add(b);
        for(Strada s : l)
            System.out.print(s.getNome()+" ");
    }
}

/*
Il programma stampa: Casilina Cassia Cassia

Il programma stampa: Appia Laurentina Cassia
	
Il programma stampa: Casilina Cassia
	
Il programma stampa: Appia Casilina Laurentina Cassia
	
Il programma stampa: Casilina Appia Cassia
*/