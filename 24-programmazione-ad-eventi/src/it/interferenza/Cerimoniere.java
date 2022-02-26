package it.interferenza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Cerimoniere {
	final static int N = 100;
	static public void main(String[] args) throws Exception {
		new Cerimoniere().main();
	}

	private Random random;

	private void main() throws InterruptedException {
		this.random = new Random();
		final List<Persona> uomini = creaNpersone(N);
		final List<Persona> donne = creaNpersone(N);
		final List<Integer> indiciU = numeriCasualiDa0AdNmeno1(N);
		final List<Integer> indiciD = numeriCasualiDa0AdNmeno1(N);
		// quanti uomini ne escono sposati, quante donne?
		for(int i=0; i<15; i++) {
			System.out.println("Sposati al passo i: "
					+ "Uomini=" + contaSposati(uomini)
					+ " Donne=" + contaSposati(donne));
			Thread.sleep(1000);
		}	
		// celebrazione di massa, un thread per coppia
		for(int i=0; i<N; i++) {
			new Thread(new Runnable() {
				@Override public void run() { cerimonia(uomini,indiciU,donne,indiciD); } 
			}).start();
		}

	}

	private int contaSposati(List<Persona> persone) {
		int count = 0;
		for(Persona persona : persone) {
			if (persona.isSposata()) count++;
		}
		return count;
	}

	private List<Integer> numeriCasualiDa0AdNmeno1(int n) {
		final List<Integer> indici = new ArrayList<>(n);
		for(int i=0; i<n; i++)
			indici.add(i);
		Collections.shuffle(indici); // permuta casualmente
		return indici;
	}

	private List<Persona> creaNpersone(int n) {
		final List<Persona> persone = new ArrayList<Persona>();
		for(int i=0; i<n; i++)
			persone.add(new Persona("-"+i+"-"));
		return persone;
	}

	private void cerimonia(List<Persona> uomini, List<Integer> uomoAcaso, 
			List<Persona> donne, List<Integer> donnaAcaso) {
		try {
			final Persona sposo = uomini.get(uomoAcaso.remove(0));
			final Persona sposa = donne.get(donnaAcaso.remove(0));
			final Coppia<Persona> coppia = new Coppia<Persona>(sposo,sposa);
			Thread.sleep(this.random.nextInt(10000));
			sposo.setCoppia(coppia);
			Thread.sleep(this.random.nextInt(1000));
			sposa.setCoppia(coppia);
		} catch (InterruptedException e) { e.printStackTrace(); }
	}
}
