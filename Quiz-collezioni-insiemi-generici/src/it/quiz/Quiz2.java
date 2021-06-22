package it.quiz;

import java.util.Set;
import java.util.TreeSet;

import it.classi.Persona2;

public class Quiz2 {
	public static void main(String[] args) {
        Set< Persona2 > persone = new TreeSet<>();
        
        Persona2 p1 = new Persona2("Simone", 20);
        Persona2 p2 = new Persona2("Marta", 18);
        Persona2 p3 = new Persona2("Simone", 19);
        
        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        
        System.out.println(persone.size());
    }
}

/*
4

Il codice non compila

2

3

1
*/

/*
La risposta giusta è 2 perche il metodo compareTo() fa l'uguaglianza solo sul nome e ci sono due persone di nome uguale "Simone"
*/