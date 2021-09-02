package ex_TreeSet_size;

import java.util.Set;
import java.util.TreeSet;

//Cosa stampa il seguente programma?
public class Quiz {

	public static void main(String[] args) {
        Set<Studente> studenti = new TreeSet<>();
        Studente s1 = new Studente("Francesca", 20);
        Studente s2 = new Studente("Luigi", 18);
        Studente s3 = new Studente("Francesca", 19);
        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        System.out.println(studenti.size());
        
    }
}

/*
2

Lo studente s3 sostituisce lo studente s1 perche hanno lo stesso nome.
L'eta di Francesca passa da 20 a 19.

TreeSet<E> verifica l'esistenza di duplicati
- tramite il metodo compareTo(), ed il tipo E deve implementare l'interface Comparable<E>;
- tramite il metodo compare() dell’interfaccia Comparator una cui istanza gli e' stata fornita all’atto dell’istanziamento

-----Altre Risposte-----

0
Il codice non compila
3
1
*/