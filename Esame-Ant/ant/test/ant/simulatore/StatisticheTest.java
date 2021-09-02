package ant.simulatore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import ant.Cibo;
import ant.Coordinate;
import ant.formica.Esploratrice;
import ant.formica.Formica;
import ant.formica.Inseguitrice;

@SuppressWarnings("unused")
public class StatisticheTest {

	private Simulatore simulatore;

	private Statistiche stats;	
	
	final private Coordinate origine = new Coordinate(0, 0);
	
	private Esploratrice formica ;
	private Inseguitrice altraFormica ;
	
	@Before
	public void setUp() throws Exception {
		this.stats = new Statistiche();
		this.simulatore = new Simulatore();
		this.formica = this.simulatore.creaEsploratrice();
		this.altraFormica = this.simulatore.creaInseguitrice();
	}

	
	private Cibo creaCiboRaccoltoDaEsploratore() {
		final Cibo cibo = new Cibo(this.origine);
		cibo.setRaccoglitrice(this.simulatore.creaEsploratrice());	
		return cibo;
	}

	private Cibo creaCiboRaccoltoDaInseguitore() {
		final Cibo cibo = new Cibo(this.origine);
		cibo.setRaccoglitrice(this.simulatore.creaInseguitrice());	
		return cibo;
	}

	@Test
	public void testRaccoltoPerFormica() {
		// DA COMPLETARE ( VEDI DOMANDA 3 ) SUGG.: USARE I METODI FACTORY SOPRA
	}
	
	@Test
	public void testRaccoltoPerFormica_raccoltoVuoto() {
		assertEquals(Collections.emptyMap(), this.stats.raccoltoPerFormica(Collections.emptySet()));
	}
	
	@Test
	public void testRaccoltoPerTipoDiFormica() {
		final Set<Cibo> ciboRaccolto = new HashSet<>();
		final Cibo ciboRaccoltoDaEsploratore = creaCiboRaccoltoDaEsploratore();
		Formica esploratrice = ciboRaccoltoDaEsploratore.getRaccoglitrice();
		ciboRaccolto.add(ciboRaccoltoDaEsploratore);
		final Cibo ciboRaccoltoDaInseguitore = creaCiboRaccoltoDaInseguitore();
		Formica inseguitore = ciboRaccoltoDaInseguitore.getRaccoglitrice();
		ciboRaccolto.add(ciboRaccoltoDaInseguitore);
		assertNotNull(this.stats.raccoltoPerFormica(ciboRaccolto));
		assertEquals(2, this.stats.raccoltoPerFormica(ciboRaccolto).size());
		assertEquals(new Integer(1), this.stats.raccoltoPerFormica(ciboRaccolto).get(esploratrice));
		assertEquals(new Integer(1), this.stats.raccoltoPerFormica(ciboRaccolto).get(inseguitore));
	}
	
}
