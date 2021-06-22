package it.quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import it.classi.ComparatoreMoto;
import it.classi.Moto;

public class Quiz3 {
	public static void main(String[] args) {
		List<Moto> elenco = new LinkedList<Moto>();

		elenco.add(new Moto("Guzzi", 500));
		elenco.add(new Moto("Suzuki", 750));
		elenco.add(new Moto("Suzuki", 250));
		elenco.add(new Moto("Honda", 1500));
		Collections.sort(elenco, new ComparatoreMoto());

		for(Moto persona : elenco)
			System.out.print(persona.getMarca()+" ");
	}
}

/*
Suzuki Guzzi Suzuki Honda

Suzuki Guzzi Honda
	
Guzzi Honda Suzuki Suzuki
	
Guzzi Honda Suzuki
	
Guzzi Suzuki Suzuki Honda
*/