package ex_TreeSet_size_NOcomparable;

import java.util.Set;
import java.util.TreeSet;

//Cosa stampa il seguente programma?
public class Quiz {

	public static void main(String[] args) {
        Set< Persona > persone = new TreeSet<>();
        
        Persona p1 = new Persona("Simone", 20);
        Persona p2 = new Persona("Marta", 18);
        Persona p3 = new Persona("Simone", 19);
        
        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        
        System.out.println(persone.size());
    }
}
