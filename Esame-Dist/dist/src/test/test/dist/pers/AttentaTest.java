package dist.pers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dist.sim.Ambiente;
import dist.sim.Coordinate;

public class AttentaTest {
	
	private Persona attenta;
	private Persona persona1;
	private Ambiente ambiente;
	private Coordinate coordinateAttenta;
	private Coordinate coordinatePersonaAdiacente;

	@Before
	public void setUp() {
		this.ambiente = new Ambiente();
		this.attenta = new Attenta(ambiente);
		this.persona1 = new Distratta(ambiente);
		this.coordinatePersonaAdiacente = new Coordinate(3, 4);
	}

	@Test
	public void testMossaDirezioneAdiacenteOccupata() {
		this.ambiente.add(persona1);
		this.attenta.setPosizione(coordinateAttenta);
		this.persona1.setPosizione(coordinatePersonaAdiacente);
		assertNotEquals(coordinatePersonaAdiacente, this.attenta.getPosizione());
	}

}
