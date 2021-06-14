package it.quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import it.classi.ComparatoreImpiegati;
import it.classi.Impiegato;

public class Quiz7 {
	public static void main(String[] args) {
		List<Impiegato> elenco = new LinkedList<Impiegato>();

		elenco.add(new Impiegato("Sara", "CCC"));
		elenco.add(new Impiegato("Vittorio", "AAA"));
		elenco.add(new Impiegato("Matteo", "RRR"));
		elenco.add(new Impiegato("Vittorio", "LLL"));
		Collections.sort(elenco, new ComparatoreImpiegati());

		for(Impiegato impiegato : elenco)
			System.out.print(impiegato.getNome()+" ");
	}
}

/*
Vittorio Sara Vittorio Matteo
	
Vittorio Sara Matteo
	
Matteo Sara Vittorio Vittorio
	
Matteo Sara Vittorio
	
Sara Vittorio Matteo Vittorio
*/
