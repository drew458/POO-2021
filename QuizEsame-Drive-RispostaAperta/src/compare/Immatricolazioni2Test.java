package compare;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Immatricolazioni2Test
{
  private Immatricolazioni2 immatricolazioni;
  private ComparatoreStudentePerEtaMatricola comparatore;
  
  public Immatricolazioni2Test() {}
  
  @Before
  public void setUp()
    throws Exception
  {
    immatricolazioni = new Immatricolazioni2();
    comparatore = new ComparatoreStudentePerEtaMatricola();
  }
  
  @Test
  public final void testElencoOrdinatoPerEtaMatricola_vuoto() {
    List<Studente2> ordinati = immatricolazioni.elencoOrdinatoPerEtaMatricola();
    Assert.assertNotNull(ordinati);
    Assert.assertEquals(Integer.valueOf(0), Integer.valueOf(ordinati.size()));
  }
  
  @Test
  public final void testElencoOrdinatoPerEtaMatricola_dueEtaDiverse() {
    Studente2 tizio = new Studente2("1", 30);
    Studente2 caio = new Studente2("2", 20);
    immatricolazioni.aggiungiStudente(tizio);
    immatricolazioni.aggiungiStudente(caio);
    List<Studente2> ordinati = immatricolazioni.elencoOrdinatoPerEtaMatricola();
    Assert.assertNotNull(ordinati);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(ordinati.size()));
    Assert.assertSame(caio, ordinati.get(0));
    Assert.assertSame(tizio, ordinati.get(1));
  }
  
  @Test
  public final void testElencoOrdinatoPerEtaMatricola_stessaEtaDueMatricoleDiverse_posizioneCorretta() {
    Studente2 tizio = new Studente2("2", 22);
    Studente2 caio = new Studente2("1", 22);
    immatricolazioni.aggiungiStudente(caio);
    immatricolazioni.aggiungiStudente(tizio);
    List<Studente2> ordinati = immatricolazioni.elencoOrdinatoPerEtaMatricola();
    Assert.assertNotNull(ordinati);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(ordinati.size()));
    Assert.assertSame(caio, ordinati.get(0));
    Assert.assertSame(tizio, ordinati.get(1));
  }
  
  @Test
  public final void testElencoOrdinatoPerEtaMatricola_stessaEtaDueMatricoleDiverse_posizioneInversa() {
    Studente2 tizio = new Studente2("2", 22);
    Studente2 caio = new Studente2("1", 22);
    immatricolazioni.aggiungiStudente(tizio);
    immatricolazioni.aggiungiStudente(caio);
    List<Studente2> ordinati = immatricolazioni.elencoOrdinatoPerEtaMatricola();
    Assert.assertNotNull(ordinati);
    Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(ordinati.size()));
    Assert.assertSame(caio, ordinati.get(0));
    Assert.assertSame(tizio, ordinati.get(1));
  }
  
  @Test
  public final void testElencoOrdinatoPerEtaMatricola_treEtaDiverse_posizioneInversa() {
    Studente2 tizio = new Studente2("2", 23);
    Studente2 caio = new Studente2("1", 22);
    Studente2 sempronio = new Studente2("3", 21);
    immatricolazioni.aggiungiStudente(tizio);
    immatricolazioni.aggiungiStudente(caio);
    immatricolazioni.aggiungiStudente(sempronio);
    List<Studente2> ordinati = immatricolazioni.elencoOrdinatoPerEtaMatricola();
    Assert.assertNotNull(ordinati);
    Assert.assertEquals(Integer.valueOf(3), Integer.valueOf(ordinati.size()));
    Assert.assertSame(sempronio, ordinati.get(0));
    Assert.assertSame(caio, ordinati.get(1));
    Assert.assertSame(tizio, ordinati.get(2));
  }
  
  @Test
  public final void testElencoOrdinatoPerEtaMatricola_stessaEtaTreMatricoleDiverse_posizioneInversa() {
    Studente2 tizio = new Studente2("3", 20);
    Studente2 caio = new Studente2("2", 20);
    Studente2 sempronio = new Studente2("1", 20);
    immatricolazioni.aggiungiStudente(tizio);
    immatricolazioni.aggiungiStudente(caio);
    immatricolazioni.aggiungiStudente(sempronio);
    List<Studente2> ordinati = immatricolazioni.elencoOrdinatoPerEtaMatricola();
    Assert.assertNotNull(ordinati);
    Assert.assertEquals(Integer.valueOf(3), Integer.valueOf(ordinati.size()));
    Assert.assertSame(sempronio, ordinati.get(0));
    Assert.assertSame(caio, ordinati.get(1));
    Assert.assertSame(tizio, ordinati.get(2));
  }
  
  @Test
  public void test_compare_eta_matricolaInversa() {
    Assert.assertTrue(comparatore.compare(new Studente2("1", 20), new Studente2("0", 21)) < 0);
    Assert.assertTrue(comparatore.compare(new Studente2("0", 21), new Studente2("1", 20)) > 0);
    Assert.assertTrue(comparatore.compare(new Studente2("1", 20), new Studente2("1", 20)) == 0);
  }
  
  @Test
  public void test_compare_matricola_stessaEta() {
    Assert.assertTrue(comparatore.compare(new Studente2("1", 20), new Studente2("2", 20)) < 0);
    Assert.assertTrue(comparatore.compare(new Studente2("2", 20), new Studente2("1", 20)) > 0);
    Assert.assertTrue(comparatore.compare(new Studente2("1", 20), new Studente2("1", 20)) == 0);
  }
  
  @Test
  public void test_compare_eta_matricola() {
    Assert.assertTrue(comparatore.compare(new Studente2("0", 20), new Studente2("1", 21)) < 0);
    Assert.assertTrue(comparatore.compare(new Studente2("1", 21), new Studente2("0", 20)) > 0);
    Assert.assertTrue(comparatore.compare(new Studente2("0", 20), new Studente2("0", 20)) == 0);
  }
  
  @Test
  public void testClasseNonModificata()
  {
    Studente2 s1 = new Studente2("221211", 24);
    Studente2 s2 = new Studente2("253086", 24);
    Assert.assertEquals(Integer.valueOf(0), Integer.valueOf(s1.compareTo(s2)));
  }
}
