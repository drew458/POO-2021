package car.stats;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import car.auto.Auto;
import car.auto.Bianca;
import car.auto.Gialla;
import car.sim.Coordinate;
import car.sim.Tragitto;
import car.sim.Zona;

public class StatisticheTest {

	private Statistiche stats;
	private Zona zona;
	private Coordinate coordinatePartenzaBianca;
	private Coordinate coordinatePartenzaGialla;
	private Coordinate coordinateArrivoBianca;
	private Coordinate coordinateArrivoGialla;

	@Before
	public void setUp() {
		this.stats = new Statistiche();
		this.zona = new Zona();
		this.coordinatePartenzaBianca = new Coordinate(4, 9);
		this.coordinatePartenzaGialla = new Coordinate(9, 8);
		this.coordinateArrivoBianca = new Coordinate(7, 10);
		this.coordinateArrivoGialla = new Coordinate(5, 11);
	}
	
	@Test
	public void testTragittoPerAuto() {
		Map<Auto, List<Tragitto>> auto2tragitti = new HashMap<>();
		Tragitto tragittoBianca;
		Tragitto tragittoGialla;
		Auto bianca = new Bianca(this.zona);
		Auto gialla = new Gialla(this.zona);
		tragittoBianca = new Tragitto(bianca, this.coordinatePartenzaBianca, this.coordinateArrivoBianca);
		tragittoGialla = new Tragitto(bianca, this.coordinatePartenzaGialla, this.coordinateArrivoGialla);
		List<Tragitto> setTragittoBianca = new ArrayList<>();
		List<Tragitto> setTragittoGialla = new ArrayList<>();
		setTragittoBianca.add(tragittoBianca);
		setTragittoGialla.add(tragittoGialla);
		auto2tragitti.put(bianca, setTragittoBianca);
		auto2tragitti.put(gialla, setTragittoGialla);
		assertEquals(auto2tragitti.keySet(), this.stats.tragittoPerAuto(setTragittoBianca).keySet());
		
	}

}
