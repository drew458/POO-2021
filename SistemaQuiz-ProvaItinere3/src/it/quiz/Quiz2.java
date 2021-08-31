package it.quiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Quiz2 {
	public static void main(String[] args) {
		Map<Integer, String> codice2nome;
		codice2nome = new HashMap<>();
		
		codice2nome.put(1, new String("Paolo"));
		codice2nome.put(2, new String("Luca"));
		codice2nome.put(3, new String("Paolo"));
		codice2nome.put(1, new String("Stefano"));
		
		List<Integer> ll = new LinkedList<>(codice2nome.keySet());
		Collections.sort(ll);
		Iterator<Integer> i = ll.iterator();
		while(i.hasNext())
			System.out.println(codice2nome.get(i.next()+" "));
	}
}

/*
 - Stefano Luca Paolo
Luca Paolo Stefano
Polo Luca Paolo
1 2 3 1
1 2 3
Paolo Luca Paolo Stefano 
*/