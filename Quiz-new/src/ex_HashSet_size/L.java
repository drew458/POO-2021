package ex_HashSet_size;

import java.util.HashSet;
import java.util.Set;

//Cosa stampa?
public class L {

	public static void main(String[] argv) {
        Set set1 = new HashSet();
        Evento e = new Evento(2000);
        set1.add(e);
        e = new Evento(2000);
        set1.add(e);

        Set set2 = new HashSet();
        Catastrofe c = new Catastrofe(2000);
        set2.add(c);
        c = new Catastrofe(2000);
        set2.add(c);

        System.out.println("set1.size()=" + set1.size());
        System.out.println("set2.size()=" + set2.size());
    }
}

/*
Il programma stampa:

set1.size()=1
set2.size()=2

Catastrofe non ha equals e hashCode -> ci possono essere duplicati

Evento ha equals e hashCode -> non sono ammessi duplicati

set1 -> 2000 -> 2000(NO)
set2 -> 2000 -> 2000

----Risposte sbagliate----
Il programma stampa:

set1.size()=2
set2.size()=1



Il programma stampa:

set1.size()=1
set2.size()=1

Il programma stampa:

set1.size()=2
set2.size()=2
*/