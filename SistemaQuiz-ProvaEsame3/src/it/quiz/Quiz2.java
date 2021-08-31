package it.quiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Quiz2 {
	public static void main(String[] argv) {
        Map<Integer,String> matricola2agente;
        matricola2agente = new HashMap<Integer,String>();

        matricola2agente.put(400, "Rossi");
        matricola2agente.put(222 , "Carli");
        matricola2agente.put(400 , "Loschi");
        matricola2agente.put(500 , "Rossi");

        List<Integer> ll = new LinkedList<Integer>(matricola2agente.keySet());
        Collections.sort(ll);
        Iterator<Integer> i = ll.iterator();
        while (i.hasNext())
            System.out.print(matricola2agente.get(i.next())+" ");
    }
}

/*
 * carli loschi rossi 
 * 
*/