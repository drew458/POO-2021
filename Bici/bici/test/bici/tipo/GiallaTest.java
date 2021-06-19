package bici.tipo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bici.sim.Coordinate;
import bici.sim.CostantiSimulazione;
import bici.sim.GeneratoreCasuale;
import bici.sim.Zona;

public class GiallaTest {
	
	Zona zona;
	Bici gialla;
	List<Coordinate> destinazioniAmmissibili = GeneratoreCasuale.generaNposizioniCasuali(CostantiSimulazione.N_DESTINAZIONI);

	@Before
	public void setUp() throws Exception {
		this.zona = new Zona();
		this.gialla = new Gialla(this.zona);
		
	}

	@Test
	public void testDecidiProssimaDestinazioneNonNullo() {
		assertNotNull(this.gialla.decidiProssimaDestinazione());
	}
	
	@Test
	public void testDecidiProssimaDestinazioneAmmissibile() {
		assertTrue(destinazioniAmmissibili.contains(this.gialla.decidiProssimaDestinazione()));
	}

}
