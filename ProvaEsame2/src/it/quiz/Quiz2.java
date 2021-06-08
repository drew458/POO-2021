package it.quiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Quiz2 {
	public static void main(String[] argv) {
		Map<Integer,String> codice2tipo;
		codice2tipo = new HashMap<Integer,String>();

		codice2tipo.put(20, "Scooter");
		codice2tipo.put(30 , "Cross");
		codice2tipo.put(10 , "Moto");
		codice2tipo.put(30 , "Scooter");

		List<Integer> ll = new LinkedList<Integer>(codice2tipo.keySet());
		Collections.sort(ll);
		Iterator<Integer> i = ll.iterator();
		while (i.hasNext())
			System.out.print(codice2tipo.get(i.next())+" ");
	}
}
