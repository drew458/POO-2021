package it.quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import it.classi.Auto3;
import it.classi.ComparatoreAuto;

public class Quiz7 {
	public static void main(String[] args) {
		List<Auto3> elenco = new LinkedList<Auto3>();

		elenco.add(new Auto3("BMW", 1800));
		elenco.add(new Auto3("Suzuki", 2000));
		elenco.add(new Auto3("Suzuki", 2000));
		elenco.add(new Auto3("Honda", 1500));
		Collections.sort(elenco, new ComparatoreAuto());

		for(Auto3 persona : elenco)
			System.out.print(persona.getMarca()+" ");
	}
}

/* - Honda BMW Suzuki Suzuki

* Suzuki Honda BMW

* BMW Honda Suzuki

* BMW Honda Suzuki Suzuki

* BMW Suzuki Suzuki Honda */