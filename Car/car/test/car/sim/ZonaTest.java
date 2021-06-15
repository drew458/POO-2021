package car.sim;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ZonaTest {
	
	Zona zona;
	
	@Before
	public void setup() {
		this.zona = new Zona();
	}

	@Test
	public void testGetPossibiliDirezioniNessunOstacolo() {
		Coordinate coordinate = new Coordinate(0, 0);
		Set<Direzione> direzioni = new HashSet<>();
		direzioni.add(Direzione.NORD);
		direzioni.add(Direzione.OVEST);
		assertEquals(direzioni, this.zona.getPossibiliDirezioni(coordinate));
	}
	
	@Test
	public void testGetPossibiliDirezioniUnOstacolo() {
		Coordinate coordinate = new Coordinate(0, 0);
		Set<Direzione> direzioni = new HashSet<>();
		direzioni.add(Direzione.NORD);
		this.zona.addOstacolo(-1, 0);
		assertEquals(direzioni, this.zona.getPossibiliDirezioni(coordinate));
	}
	
	@Test
	public void testGetPossibiliDirezioniTuttiOstacoli() {
		Coordinate coordinate = new Coordinate(0, 0);
		zona.addOstacolo(0, -1);
		zona.addOstacolo(1, 0);
		zona.addOstacolo(0, +1);
		zona.addOstacolo(-1, 0);
		assertEquals(Collections.emptySet(), this.zona.getPossibiliDirezioni(coordinate));
	}

}
