package it.quiz;



import java.util.ArrayList;
import java.util.List;

import it.classi.Automobile;
import it.classi.Bicicletta;
import it.classi.Tandem;
import it.classi.Veicolo;

public class Quiz3 {
	public static void main(String args[]) {
		List<Veicolo> listaVeicoli = new ArrayList<Veicolo>();

		Veicolo v = null;
		Bicicletta b = new Bicicletta();
		Veicolo a = new Automobile();
		Bicicletta tb = new Tandem();
		Tandem t = new Tandem();

		v = b;
		listaVeicoli.add(v);
		v = a;
		listaVeicoli.add(v);
		v = tb;
		listaVeicoli.add(v);
		v = t;
		listaVeicoli.add(v);

		for(Veicolo veicolo : listaVeicoli)
			System.out.print(veicolo.clacson()+" ");
	}
}

/*
 * drin bip drindran drindran
 *
*/