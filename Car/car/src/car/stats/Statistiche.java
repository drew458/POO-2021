package car.stats;

import java.util.*;

import car.auto.Auto;
import car.sim.Coordinate;
import car.sim.Tragitto;
import car.sim.Zona;

public class Statistiche {

	synchronized public void stampaFinale(Zona zona) {
		final List<Tragitto> tragitti = zona.getTragitti();

		System.out.println(tragitti.size() + " tragitti collezionati." );
		System.out.println(zona.getTragitti());
		System.out.println();

		// (VEDI DOMANDA 3)
		System.out.println("Percorsi di ciascuna vettura:");
		final Map<Auto,Set<Tragitto>> auto2tragitti = tragittoPerAuto(tragitti);
		stampaTragittiPerAuto(auto2tragitti);
		System.out.println();

		// (VEDI DOMANDA 4)
		System.out.println("Classifica finale delle posizioni piu' battute:");
		final SortedMap<Coordinate,Integer> pos2utilizzi = utilizzi(tragitti);
		stampaUtilizzi(pos2utilizzi);
		System.out.println();
	}

	/**
	 * <B>DA COMPLETARE (VEDI DOMANDA 3)</B>
	 * @param tragitti - lista dei tragitti collezionati durante la simulazione
	 * @return una mappa che riporti per ogni auto (di qls tipo)
	 *         l'insieme dei tragitti che ha percorso
	 */
	public Map<Auto, Set<Tragitto>> tragittoPerAuto(List<Tragitto> tragitti) {
		Map<Auto, Set<Tragitto>> auto2tragitti = new HashMap<>();
		
		for(Tragitto t : tragitti) {
			if(auto2tragitti.containsKey(t.getAuto())) {
				auto2tragitti.get(t.getAuto()).add(t);
			}
			else {
				auto2tragitti.put(t.getAuto(), new HashSet<Tragitto>());
				auto2tragitti.get(t.getAuto()).add(t);
			}
		}
		return auto2tragitti;
	}

	/**
	 * <EM>N.B. UTILE PER STAMPARE RISULTATI DOMANDA 3</EM>
	 * @param auto2tragitti
	 */
	private void stampaTragittiPerAuto(final Map<Auto, Set<Tragitto>> auto2tragitti) {
		for(Auto auto : auto2tragitti.keySet()) {
			Set<Tragitto> tragitti = auto2tragitti.get(auto);
			System.out.println("L'auto "+auto+" ha fatto "+( tragitti!=null ? tragitti.size() : 0 ) +" corse");
		}
	}
	
	/**
	 * <B>DA COMPLETARE (VEDI DOMANDA 4)</B>
	 * 	@param tragitti - lista dei tragitti collezionati durante la simulazione
	 * @return una mappa ordinata decrescente in cui figurano come chiavi 
	 *         le posizioni piu'battute come origine o destinazione di un 
	 *         tragitto, come valori il numero di tali tragitti
	 */
	public SortedMap<Coordinate,Integer> utilizzi(List<Tragitto> tragitti) {
		Map<Coordinate, Integer>  posizione2tragitti = new HashMap<>();
		Integer numeroTragitti;
		
		for(Tragitto t : tragitti) {
			if(posizione2tragitti.containsKey(t.getOrigine())) {
				numeroTragitti = posizione2tragitti.get(t);
				posizione2tragitti.put(t.getOrigine(), numeroTragitti++);
			}
			if(posizione2tragitti.containsKey(t.getDestinazione())){
				numeroTragitti = posizione2tragitti.get(t);
				posizione2tragitti.put(t.getDestinazione(), numeroTragitti++);
			}
		}
	}
	
	/**
	 * <EM>N.B. UTILE PER STAMPARE RISULTATI DOMANDA 4</EM>
	 * @param classifica delle posizioni piu' usate
	 */
	private void stampaUtilizzi(SortedMap<Coordinate,Integer> classifica) {
		int i = 0;
		for(Map.Entry<Coordinate, Integer> entry : classifica.entrySet()) {
			final Coordinate posizione = entry.getKey();
			final Integer numeri = entry.getValue();
			System.out.println(i+") "+posizione+" con "+numeri+" utilizzi");
			i++;
		}
	}

}
