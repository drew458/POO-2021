package it.classi;

import java.util.ArrayList;
import java.util.List;

public class Libro {
	private String titolo;

	public Libro(String titolo) {
		this.titolo = titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return this.titolo;
	}

	public static void main(String[] argc) {
		List< Libro > scaffale = new ArrayList< Libro >();
		Libro l1;
		 
		scaffale.add(new Libro("I Pirati della Malesia"));
		l1 = scaffale.get(0);
		scaffale.add(l1);
		l1 = new Libro("Le Due Tigri");
		scaffale.add(l1);
		l1.setTitolo("Il Corsaro Nero");
		scaffale.get(2).setTitolo("La Regina dei Caraibi");
  		for (Libro libro : scaffale)
			System.out.print(libro.getTitolo() + "; ");
        }
}

/*
I Pirati della Malesia; I Pirati della Malesia; La Regina dei Caraibi;
I Pirati della Malesia; I Pirati della Malesia; Il Corsaro Nero;
Il Corsaro Nero; Il Corsaro Nero; La Regina dei Caraibi;
Le Due Tigri; Il Corsaro Nero; La Regina dei Caraibi;
Il Corsaro Nero; La Regina dei Caraibi; Le Due Tigri;
*/