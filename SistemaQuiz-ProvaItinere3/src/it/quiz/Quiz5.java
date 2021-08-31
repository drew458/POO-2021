package it.quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import it.classi.ComparatoreLibri;
import it.classi.Libro;

public class Quiz5 {
	public static void main(String[] args) {
		List<Libro> biblioteca = new LinkedList<>();
		
		biblioteca.add(new Libro("Cronosisma", 2003));
		biblioteca.add(new Libro("Zorro", 2000));
		biblioteca.add(new Libro("Zorro", 1800));
		biblioteca.add(new Libro("Mostri", 1999));
		Collections.sort(biblioteca, new ComparatoreLibri());
		
		for(Libro libro : biblioteca)
			System.out.println(libro.getTitolo()+" ");
	}
}

/**
 * - zorro mostri zorro cronosisma
 * zorro mostri cronosisma
 * cronosisma mostri zorro zorro
 * cronosisma mostri zorro
 * cronosisma zorro zorro mostri 
 * */
