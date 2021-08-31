package it.quiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Quiz2 {
	public static void main(String[] argv) {
        Map<Integer,String> codice2marca;
        codice2marca = new HashMap<Integer,String>();

        codice2marca.put(1, "Nissan");
        codice2marca.put(2, "Fiat");
        codice2marca.put(1, "Opel");
        codice2marca.put(3, "Renault");

        List<Integer> ll = new LinkedList<Integer>(codice2marca.keySet());
        Collections.sort(ll);
        Iterator<Integer> i = ll.iterator();
        while (i.hasNext())
            System.out.print(codice2marca.get(i.next())+" ");
    }
}

/*
Se eseguito il programma stampa: Opel Fiat Renault
	
Se eseguito il programma stampa: Fiat Opel Renault
	
Se eseguito il programma stampa: Nissan Opel Fiat Renault
	
Se eseguito il programma stampa: Fiat Nissan Opel Renault
	
Se eseguito il programma stampa: 1 2 3 1
	
Se eseguito il programma stampa: 1 2 3
*/
