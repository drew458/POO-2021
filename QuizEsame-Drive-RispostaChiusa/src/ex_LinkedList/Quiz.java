package ex_LinkedList;

import java.util.LinkedList;
import java.util.List;

//Cosa stampa?
public class Quiz {

	public static void main(String[] argc) {
        List<Persona> l = new LinkedList<Persona>();

        Persona a = new Persona("Paolo");
        l.add(a);
        a.setNome("Luca");
        a = new Persona("Antonio");
        l.add(a);
        Persona b;
        b = a;
        b.setNome("Elisabetta");
        l.add(b);
        for(Persona p : l)
            System.out.print(p.toString()+" ");
    }
}

/*
Il programma stampa: Luca Elisabetta Elisabetta

SPIEGAZIONE
1) l: Paolo
da Paolo a Luca <-> a.setNome("Luca");
2) l: Luca -> Antonio
da Antonio a Elisabetta <-> b.setNome("Elisabetta");
3) l: Luca -> Elisabetta -> Elisabetta

-----Risposte sbagliate-----

Il programma stampa: Paolo Elisabetta
Il programma stampa: Paolo Luca Antonio Elisabetta
Il programma stampa: Paolo Antonio Elisabetta
Il programma stampa: Luca Antonio Elisabetta
*/