package it.quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import it.classi.ComparatoreMoto;
import it.classi.Moto2;

public class Quiz7 {
	public static void main(String[] args) {
		List<Moto2> elenco = new LinkedList<Moto2>();

		elenco.add(new Moto2("Guzzi", 500));
		elenco.add(new Moto2("Suzuki", 750));
		elenco.add(new Moto2("Suzuki", 250));
		elenco.add(new Moto2("Honda", 1500));
		Collections.sort(elenco, new ComparatoreMoto());

		for(Moto2 persona : elenco)
			System.out.print(persona.getMarca()+" ");
	}
}
