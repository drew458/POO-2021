package it.quiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Quiz2 {
	public static void main(String[] argv) {
        Map<Integer,String> codice2nome;
        codice2nome = new HashMap<Integer,String>();

        codice2nome.put(1, new String("Paolo"));
        codice2nome.put(2 , new String("Luca"));
        codice2nome.put(3 , new String("Paolo"));
        codice2nome.put(1 , new String("Stefano"));

        List<Integer> ll = new LinkedList<Integer>(codice2nome.keySet());
        Collections.sort(ll);
        Iterator<Integer> i = ll.iterator();
        while (i.hasNext())
            System.out.print(codice2nome.get(i.next())+" ");
    }
}

/*
Se eseguito il programma stampa: Stefano Luca Paolo
	
Se eseguito il programma stampa: Luca Paolo Stefano
	
Se eseguito il programma stampa: 1 2 3 1
	
Se eseguito il programma stampa: 1 2 3
	
Se eseguito il programma stampa: Paolo Luca Paolo Stefano
	
Se eseguito il programma stampa: Paolo Luca Paolo
*/
