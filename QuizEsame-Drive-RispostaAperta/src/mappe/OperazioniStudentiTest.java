package mappe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class OperazioniStudentiTest {

	private static final String STUDENTE_1_MATRICOLA = "001";
	private static final String STUDENTE_2_MATRICOLA = "002";

	private OperazioniStudenti operazioni;
	private Studente studente1;
	private Studente studente2;

	@Before
	public void setUp() throws Exception {
		this.operazioni = new OperazioniStudenti();
		this.studente1 = new Studente(STUDENTE_1_MATRICOLA, 24);
		this.studente2 = new Studente(STUDENTE_2_MATRICOLA, 20);
	}

	@Test
	public void testGetStudente2votoUnoStudente() {
		Map<String, Studente> mat2stud = Collections.singletonMap(STUDENTE_1_MATRICOLA, this.studente1);
		Map<String, Integer> mat2voto = Collections.singletonMap(STUDENTE_1_MATRICOLA, 0);

		Map<Studente, Integer> stud2voto = this.operazioni.getStudente2voto(mat2stud, mat2voto);

		assertEquals(new Integer(0), stud2voto.get(this.studente1));

	}

	@Test
	public void testGetStudente2votoUnoStudente_ControllaDimensione() {
		Map<String, Studente> mat2stud = Collections.singletonMap(this.studente1.getMatricola(), this.studente1);
		Map<String, Integer> mat2voto = Collections.singletonMap(STUDENTE_1_MATRICOLA, 30);

		Map<Studente, Integer> stud2voto = this.operazioni.getStudente2voto(mat2stud, mat2voto);

		assertEquals(1, stud2voto.size());
	}

	@Test
	public void testGetStudente2votoDueStudenti() {
		Map<String, Studente> mat2stud = new HashMap<>();
		mat2stud.put(this.studente1.getMatricola(), this.studente1);
		mat2stud.put(this.studente2.getMatricola(), this.studente2);

		Map<String, Integer> mat2voto = new HashMap<>();
		mat2voto.put(STUDENTE_1_MATRICOLA, 28);
		mat2voto.put(STUDENTE_2_MATRICOLA, 31);

		Map<Studente, Integer> stud2voto = this.operazioni.getStudente2voto(mat2stud, mat2voto);

		assertEquals(new Integer(28), stud2voto.get(this.studente1));
		assertEquals(new Integer(31), stud2voto.get(this.studente2));
	}

	@Test
	public void testGetStudente2votoDueStudenti_VotoAssente() {
		Map<String, Studente> mat2stud = new HashMap<>();
		mat2stud.put(this.studente1.getMatricola(), this.studente1);
		mat2stud.put(this.studente2.getMatricola(), this.studente2);

		Map<String, Integer> mat2voto = new HashMap<>();
		mat2voto.put(STUDENTE_1_MATRICOLA, 28);

		Map<Studente, Integer> stud2voto = this.operazioni.getStudente2voto(mat2stud, mat2voto);

		assertFalse(stud2voto.containsKey(this.studente2));
	}

}
