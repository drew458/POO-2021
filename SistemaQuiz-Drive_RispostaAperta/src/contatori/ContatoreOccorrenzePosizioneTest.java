package contatori;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContatoreOccorrenzePosizioneTest {
	private ContatoreOccorrenzePosizione contatore;
	
	@Before
	public void setUp() {
		this.contatore = new ContatoreOccorrenzePosizione();
	}

	@Test(timeout=500)
	public void testContaOccorrenze_NullaDaControllare() {
		String[] sequenza = {"beetlejuice", "coffee" , "best", "coffee", "a"};
		String[] daControllare = {};
		int[] atteso = {};
		
		assertArrayEquals(atteso, this.contatore.contaOccorrenze(sequenza, daControllare));
	}

	@Test(timeout=500)
	public void testContaOccorrenze_SequenzaVuota() {
		String[] sequenza = {};
		String[] daControllare = {"tea", "beetlejuice", "coffee"};
		int[] atteso = {0, 0, 0};
		
		assertArrayEquals(atteso, this.contatore.contaOccorrenze(sequenza, daControllare));
	}
	
	@Test(timeout=500)
	public void testContaOccorrenze() {
		String[] sequenza = {"beetlejuice", "coffee" , "best", "coffee", "a"};
		String[] daControllare = {"tea", "beetlejuice", "coffee"};	
		int[] atteso = {0, 1, 2};
		
		assertArrayEquals(atteso, this.contatore.contaOccorrenze(sequenza, daControllare));
	}
	

}