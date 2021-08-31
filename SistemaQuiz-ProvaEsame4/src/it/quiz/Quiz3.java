package it.quiz;

import java.util.ArrayList;
import java.util.List;

import it.classi.Albero;
import it.classi.Cactus;
import it.classi.Pero;
import it.classi.Vegetale2;

public class Quiz3 {
	public static void main(String args[]) {
        List<Vegetale2> vegetali = new ArrayList<Vegetale2>();

        Vegetale2 v = null;
        Albero a = new Albero();
        Vegetale2 vc = new Cactus();
        Albero ap = new Pero();
        Pero p = new Pero();

        v = a;
        vegetali.add(v);
        v = vc;
        vegetali.add(v);
        v = ap;
        vegetali.add(v);
        v = p;
        vegetali.add(v);

        for(Vegetale2 animale : vegetali)
            System.out.print(animale.cresceIn()+" ");
    }
}

/*
Il programma stampa: bosco deserto frutteto frutteto
	
Il programma stampa: ... ... ... ...
	
Il programma stampa: bosco ... bosco frutteto
	
Il programma stampa: bosco ... frutteto frutteto
	
Il programma stampa: bosco ... ... frutteto
*/