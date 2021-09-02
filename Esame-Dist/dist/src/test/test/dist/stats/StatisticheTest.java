package dist.stats;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import dist.pers.Distratta;
import dist.pers.Persona;
import dist.sim.Ambiente;
import dist.sim.Contatto;
import dist.sim.Coordinate;

public class StatisticheTest {

	private Statistiche stats;
	private Set<Persona> coinvoltePrimoContatto;
	private Set<Persona> coinvolteSecondoContatto;
	private Ambiente ambiente;
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	private Coordinate coordinate;
	private Map<Persona, List<Contatto>> persona2contatti;

	@Before
	public void setUp() {
		this.stats = new Statistiche();
		this.coinvoltePrimoContatto = new HashSet<>();
		this.coinvolteSecondoContatto = new HashSet<>();
		this.ambiente = new Ambiente();
		this.persona1 = new Distratta(this.ambiente);
		this.persona2 = new Distratta(this.ambiente);
		this.persona3 = new Distratta(this.ambiente);
		this.persona4 = new Distratta(this.ambiente);
		this.coordinate = new Coordinate(2, 3);
		this.persona2contatti = new HashMap<>();
	}
	
	@Test
	public void testProduciStatisticaNessunContatto() {
		Set<Contatto> contatti = new HashSet<>();
		assertTrue(this.stats.produciStatistiche(contatti).isEmpty());
	}
	
	@Test
	public void testProduciStatisticaUnContatto() {
		Set<Contatto> contatti = new HashSet<>();
		this.coinvoltePrimoContatto.add(persona1);
		this.coinvoltePrimoContatto.add(persona2);
		Contatto unContatto = new Contatto(3, coinvoltePrimoContatto, coordinate);
		contatti.add(unContatto);
		List<Contatto> contattiAvuti = new ArrayList<>();
		contattiAvuti.add(unContatto);
		persona2contatti.put(persona1, contattiAvuti);
		persona2contatti.put(persona2, contattiAvuti);
		assertEquals(persona2contatti, this.stats.produciStatistiche(contatti));
	}
	
	/* @Test
	public void testProduciStatisticaDueContatto() {
		Set<Contatto> contatti = new HashSet<>();
		this.coinvoltePrimoContatto.add(persona1);
		this.coinvoltePrimoContatto.add(persona2);
		this.coinvolteSecondoContatto.add(persona3);
		this.coinvolteSecondoContatto.add(persona4);
		Contatto primoContatto = new Contatto(3, coinvoltePrimoContatto, coordinate);
		Contatto secondoContatto = new Contatto(5, coinvolteSecondoContatto, coordinate);
		contatti.add(primoContatto);
		contatti.add(secondoContatto);
		List<Contatto> contattiAvuti = new ArrayList<>();
		contattiAvuti.add(primoContatto);
		contattiAvuti.add(secondoContatto);
		persona2contatti.put(persona1, contattiAvuti);
		persona2contatti.put(persona2, contattiAvuti);
		persona2contatti.put(persona3, contattiAvuti);
		persona2contatti.put(persona4, contattiAvuti);
		assertEquals(persona2contatti, this.stats.produciStatistiche(contatti));
	} */

}
