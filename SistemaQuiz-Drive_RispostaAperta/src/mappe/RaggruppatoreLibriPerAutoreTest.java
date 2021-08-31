package mappe;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RaggruppatoreLibriPerAutoreTest
{
	private RaggruppatoreLibriPerAutore raggruppatore;

	public RaggruppatoreLibriPerAutoreTest() {}

	@Before
	public void setUp()
			throws Exception
	{
		raggruppatore = new RaggruppatoreLibriPerAutore();
	}

	@Test
	public final void testAutore2libri_vuoto() {
		Map<String, List<Libro>> autore2libri = raggruppatore.autore2libri();
		Assert.assertNotNull(autore2libri);
		Assert.assertTrue(autore2libri.isEmpty());
	}

	@Test
	public final void testAutore2libri_unSoloLibro() {
		String dante = "Dante";
		Libro commedia = new Libro("Divina Commedia", dante);
		raggruppatore.aggiungiLibro(commedia);
		Map<String, List<Libro>> autore2libri = raggruppatore.autore2libri();
		Assert.assertNotNull(autore2libri);
		Assert.assertFalse(autore2libri.isEmpty());
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(autore2libri.size()));
		Assert.assertTrue(autore2libri.containsKey(dante));
		List<Libro> libriDiDante = (List)autore2libri.get(dante);
		Assert.assertNotNull(libriDiDante);
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(libriDiDante.size()));
		Assert.assertSame(commedia, libriDiDante.get(0));
	}

	@Test
	public final void testAutore2libri_dueLibriStessoAutore() {
		String dante = "Dante";
		Libro commedia = new Libro("Divina Commedia", dante);
		Libro vitaNuova = new Libro("Vita Nuova", dante);
		raggruppatore.aggiungiLibro(commedia);
		raggruppatore.aggiungiLibro(vitaNuova);
		Map<String, List<Libro>> autore2libri = raggruppatore.autore2libri();
		Assert.assertNotNull(autore2libri);
		Assert.assertFalse(autore2libri.isEmpty());
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(autore2libri.size()));
		Assert.assertTrue(autore2libri.containsKey(dante));
		List<Libro> libriDiDante = (List)autore2libri.get(dante);
		Assert.assertNotNull(libriDiDante);
		Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(libriDiDante.size()));
		Assert.assertTrue(libriDiDante.contains(commedia));
		Assert.assertTrue(libriDiDante.contains(vitaNuova));
	}

	@Test
	public final void testAutore2libri_treLibriDueAutori() {
		String dante = "Dante";
		String boccaccio = "Boccaccio";
		Libro commedia = new Libro("Divina Commedia", dante);
		Libro vitaNuova = new Libro("Vita Nuova", dante);
		Libro decamerone = new Libro("Decamerone", boccaccio);
		raggruppatore.aggiungiLibro(commedia);
		raggruppatore.aggiungiLibro(decamerone);
		raggruppatore.aggiungiLibro(vitaNuova);
		Map<String, List<Libro>> autore2libri = raggruppatore.autore2libri();
		Assert.assertNotNull(autore2libri);
		Assert.assertFalse(autore2libri.isEmpty());
		Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(autore2libri.size()));
		Assert.assertTrue(autore2libri.containsKey(dante));
		Assert.assertTrue(autore2libri.containsKey(boccaccio));
		List<Libro> libriDiDante = (List)autore2libri.get(dante);
		List<Libro> libriDiBoccaccio = (List)autore2libri.get(boccaccio);
		Assert.assertNotNull(libriDiDante);
		Assert.assertNotNull(libriDiBoccaccio);
		Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(libriDiDante.size()));
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(libriDiBoccaccio.size()));
		Assert.assertTrue(libriDiDante.contains(commedia));
		Assert.assertTrue(libriDiDante.contains(vitaNuova));
		Assert.assertTrue(libriDiBoccaccio.contains(decamerone));
	}

	@Test
	public final void testAutore2libri_quattroLibriDueAutori() {
		String dante = "Dante";
		String boccaccio = "Boccaccio";
		Libro commedia = new Libro("Divina Commedia", dante);
		Libro vitaNuova = new Libro("Vita Nuova", dante);
		Libro decamerone = new Libro("Decamerone", boccaccio);
		Libro convivio = new Libro("Convivio", dante);
		raggruppatore.aggiungiLibro(commedia);
		raggruppatore.aggiungiLibro(decamerone);
		raggruppatore.aggiungiLibro(vitaNuova);
		raggruppatore.aggiungiLibro(convivio);
		Map<String, List<Libro>> autore2libri = raggruppatore.autore2libri();
		Assert.assertNotNull(autore2libri);
		Assert.assertFalse(autore2libri.isEmpty());
		Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(autore2libri.size()));
		Assert.assertTrue(autore2libri.containsKey(dante));
		Assert.assertTrue(autore2libri.containsKey(boccaccio));
		List<Libro> libriDiDante = (List)autore2libri.get(dante);
		List<Libro> libriDiBoccaccio = (List)autore2libri.get(boccaccio);
		Assert.assertNotNull(libriDiDante);
		Assert.assertNotNull(libriDiBoccaccio);
		Assert.assertEquals(Integer.valueOf(3), Integer.valueOf(libriDiDante.size()));
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(libriDiBoccaccio.size()));
		Assert.assertTrue(libriDiDante.contains(commedia));
		Assert.assertTrue(libriDiDante.contains(vitaNuova));
		Assert.assertTrue(libriDiDante.contains(convivio));
		Assert.assertTrue(libriDiBoccaccio.contains(decamerone));
	}

	@Test
	public final void testAutore2libri_cinqueLibriTreAutori() {
		String dante = "Dante";
		String boccaccio = "Boccaccio";
		String petrarca = "Petrarca";
		Libro commedia = new Libro("Divina Commedia", dante);
		Libro vitaNuova = new Libro("Vita Nuova", dante);
		Libro decamerone = new Libro("Decamerone", boccaccio);
		Libro convivio = new Libro("Convivio", dante);
		Libro canzoniere = new Libro("Canzoniere", petrarca);
		raggruppatore.aggiungiLibro(commedia);
		raggruppatore.aggiungiLibro(decamerone);
		raggruppatore.aggiungiLibro(vitaNuova);
		raggruppatore.aggiungiLibro(convivio);
		raggruppatore.aggiungiLibro(canzoniere);
		Map<String, List<Libro>> autore2libri = raggruppatore.autore2libri();
		Assert.assertNotNull(autore2libri);
		Assert.assertFalse(autore2libri.isEmpty());
		Assert.assertEquals(Integer.valueOf(3), Integer.valueOf(autore2libri.size()));
		Assert.assertTrue(autore2libri.containsKey(dante));
		Assert.assertTrue(autore2libri.containsKey(boccaccio));
		List<Libro> libriDiDante = (List)autore2libri.get(dante);
		List<Libro> libriDiBoccaccio = (List)autore2libri.get(boccaccio);
		List<Libro> libriDiPetrarca = (List)autore2libri.get(petrarca);
		Assert.assertNotNull(libriDiDante);
		Assert.assertNotNull(libriDiBoccaccio);
		Assert.assertEquals(Integer.valueOf(3), Integer.valueOf(libriDiDante.size()));
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(libriDiBoccaccio.size()));
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(libriDiPetrarca.size()));
		Assert.assertTrue(libriDiDante.contains(commedia));
		Assert.assertTrue(libriDiDante.contains(vitaNuova));
		Assert.assertTrue(libriDiDante.contains(convivio));
		Assert.assertTrue(libriDiBoccaccio.contains(decamerone));
		Assert.assertTrue(libriDiPetrarca.contains(canzoniere));
	}
}
