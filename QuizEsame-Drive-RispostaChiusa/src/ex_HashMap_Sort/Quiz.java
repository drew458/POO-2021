package ex_HashMap_Sort;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Cosa stampa?
public class Quiz {
	
	public static void main(String[] argv) {
        Map<Integer,String> codice2nome;
        codice2nome = new HashMap<Integer,String>();

        codice2nome.put(1,"Paolo");
        codice2nome.put(2,"Luca");
        codice2nome.put(3,"Paolo");
        codice2nome.put(1,"Stefano");

        List<Integer> ll = new LinkedList<Integer>(codice2nome.keySet());
        Collections.sort(ll);
        Iterator<Integer> i = ll.iterator();
        while (i.hasNext())
            System.out.print(codice2nome.get(i.next())+" ");
    }
}

/*
Se eseguito il programma stampa: Stefano Luca Paolo

1, Paolo
2, Luca
3, Paolo
1, Stefano (al posto di Paolo)

Collections.sort(ll)
ordina per chiave, quindi
1, Stefano
2, Luca
3, Paolo

-----Risposte sbagliate-----
Se eseguito il programma stampa: Luca Paolo Stefano
Se eseguito il programma stampa: 1 2 3 1
Se eseguito il programma stampa: Paolo Luca Paolo Stefano
Se eseguito il programma stampa: Paolo Luca Paolo
Se eseguito il programma stampa: 1 2 3
*/