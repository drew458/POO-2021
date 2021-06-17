package dist.stats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dist.pers.Persona;
import dist.sim.Contatto;
import dist.sim.Simulatore;

/**
 * <B>DA COMPLETARE (VEDI DOMANDA 3)</B>
 */
public class Statistiche {

	synchronized public void stampaFinale(Simulatore simulatore) {
		final Set<Contatto> contatti = simulatore.getContatti();

		System.out.println(contatti.size() + " contatti rilevati." );
		System.out.println(simulatore.getContatti());
		System.out.println();

		final Map<Persona,List<Contatto>> mappa = produciStatistiche(simulatore.getContatti());
		System.out.println("Statistica:");
		stampaStatistiche(mappa);
		System.out.println();
	}

	public Map<Persona, List<Contatto>> produciStatistiche(Set<Contatto> contatti) {
		Map<Persona, List<Contatto>> persona2contatti = new HashMap<>();
		
		for(Contatto c : contatti) {
			for(Persona p : c.getCoinvolti()) {
				if(persona2contatti.containsKey(p))
					persona2contatti.get(p).add(c);
				else {
					persona2contatti.put(p, new ArrayList<Contatto>());
					persona2contatti.get(p).add(c);
				}
			}
		}
		return persona2contatti;
	}

	/**
	 * <EM>N.B. UTILE PER STAMPARE RISULTATI DOMANDA 3</EM>
	 */
	private void stampaStatistiche(final Map<Persona, List<Contatto>> mappa) {
		for(Object key : mappa.keySet()) {
			final List<Contatto> l = mappa.get(key);
			System.out.print(key + " è stato coinvolto in :");
			for(Object c : l) 
				System.out.print(c.toString() + " ");
			System.out.println();
		}
	}
}
