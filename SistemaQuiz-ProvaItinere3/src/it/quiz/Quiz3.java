package it.quiz;

import java.util.LinkedList;
import java.util.List;

import it.classi.Persona;

public class Quiz3 {
	public static void main(String[] args) {
		List<Persona> l = new LinkedList<>();
		
		Persona a = new Persona("Paolo");
		l.add(a);
		a.setNome("Luca");
		a = new Persona("Antonio");
		l.add(a);
		Persona b;
		b = a;
		b.setNome("Elisabetta");
		l.add(b);
		for(Persona p : l) {
			System.out.println(p.toString()+" ");
		}
	}
}

/**
 * - luca elisabetta elisabetta
 * paolo luca antonio elisabetta
 * paolo elisabetta
 * paolo antonio elisabetta
 * luca antonio elisabetta 
*/
