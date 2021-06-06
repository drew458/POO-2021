package tetris.pozzo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Color;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class PozzoTest {

	@Test
	public void testGetInsiemeOrdinateY_CellaSingola() {
		assertOrdinate(creaSetDiCelle(new Cella(0,1,Color.WHITE)), 1);
	}

	@Test
	public void testGetInsiemeOrdinateY_CelleStessaLinea() {
		assertOrdinate(creaSetDiCelle(new Cella(0,1,Color.WHITE),new Cella(1,1,Color.WHITE)), 1);
	}

	@Test
	public void testGetInsiemeOrdinateY_CelleSfalsate() {
		assertOrdinate(creaSetDiCelle(new Cella(0,1,Color.WHITE),new Cella(3,2,Color.WHITE)), 1,2);
	}

	private void assertOrdinate(Set<Cella> celle, Integer... yExpected) {
		NavigableSet<Integer> insiemeOrdinateY = new Pozzo().getInsiemeOrdinateY(celle);
		NavigableSet<Integer> expected = new TreeSet<>(Arrays.asList(yExpected));
		assertEquals(expected,insiemeOrdinateY);
	}

	private static Set<Cella> creaSetDiCelle(Cella... celle) {
		return new TreeSet<>(Arrays.asList(celle));
	}

	@Test
	public void testIsCompleta_2x2(){
		Pozzo pozzo = new Pozzo(2, 2);
		assertTrue(pozzo.isCompleta(0));
		assertTrue(pozzo.isCompleta(1));
	}

	@Test
	public void testIsCompleta_3x3(){
		Pozzo pozzo = creaPozzoAggiungiCelle(3, 3, new Cella(1,1, Color.WHITE));
		assertFalse(pozzo.isCompleta(0));
		assertTrue(pozzo.isCompleta(1));
		assertTrue(pozzo.isCompleta(2));
	}

	@Test
	public void testGetCelleDellaRigaSenzaBordo_2x2(){
		Pozzo pozzo = new Pozzo(2, 2);
		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(0));
		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(1));
	}

	@Test
	public void testGetCelleDellaRigaSenzaBordo_3x3(){
		Cella cella11 = new Cella(1,1, Color.WHITE);
		Pozzo pozzo = creaPozzoAggiungiCelle(3, 3, cella11);
		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(0));
		assertEquals(creaSetDiCelle(cella11), pozzo.getCelleDellaRigaSenzaBordo(1));
		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(2));
	}

	@Test
	public void testRimuoviRigaScendendoCelleSopra_UnaCella() {
		Pozzo pozzo = creaPozzoAggiungiCelle(3, 3,new Cella(1,1, Color.WHITE));
		pozzo.rimuoviRigaScendendoCelleSopra(1);
		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(0));
		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(1));
	}

	@Test
	public void testRimuoviRigaScendendoCelleSopra_TreCelle() {
		Pozzo pozzo = creaPozzoAggiungiCelle(5, 3 , new Cella(1, 0, Color.WHITE), 
				new Cella(2, 0, Color.WHITE),new Cella(1, 1, Color.WHITE));
		pozzo.rimuoviRigaScendendoCelleSopra(1);

		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(0));
		assertEquals(
				creaSetDiCelle(new Cella(1, 1, Color.WHITE), new Cella(2, 1, Color.WHITE))
				,
				pozzo.getCelleDellaRigaSenzaBordo(1));
	}

	@Test
	public void testGetCelleSopraRigaYdecrescente_UnaCella() {
		Pozzo pozzo = creaPozzoAggiungiCelle(3, 3, new Cella(1,1, Color.white));
		assertEquals(new TreeSet<>(), pozzo.getCelleSopraRigaYdecrescente(1));
	}

	@Test
	public void testGetCelleSopraRigaYdecrescente_4celle() {
		Pozzo pozzo = creaPozzoAggiungiCelle(5, 4, 
				new Cella(1,0, Color.WHITE), new Cella(2,0, Color.WHITE), 
				new Cella(1,1, Color.WHITE), new Cella(1,2, Color.WHITE));
		assertEquals(
				creaSetDiCelle(new Cella(1,0, Color.WHITE), new Cella(2,0, Color.WHITE), new Cella(1,1, Color.WHITE))
				,
				pozzo.getCelleSopraRigaYdecrescente(2));
	}

	@Test
	public void aggiungiCelleErimuoviRigheCompletate_2() {
		Pozzo pozzo = creaPozzoAggiungiCelle(5, 4, 
				new Cella(1,0, Color.WHITE),new Cella(1,1, Color.WHITE),new Cella(1,2, Color.WHITE),
				new Cella(2,1, Color.WHITE),new Cella(2,2, Color.WHITE));
		Set<Cella> celle = creaSetDiCelle(
				new Cella(3,0, Color.WHITE),new Cella(3,1, Color.WHITE),new Cella(3,2, Color.WHITE));
		int righeRimosse = pozzo.aggiungiCelleErimuoviRigheCompletate(celle);
		assertEquals(2, righeRimosse);
		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(0));
		assertEquals(new TreeSet<>(), pozzo.getCelleDellaRigaSenzaBordo(1));
		assertEquals(creaSetDiCelle(new Cella(1,2, Color.WHITE), new Cella(3,2, Color.WHITE)),
				pozzo.getCelleDellaRigaSenzaBordo(2));

	}

	private Pozzo creaPozzoAggiungiCelle(int l, int h, Cella... celleDaAggiungere) {
		Pozzo pozzo =  new Pozzo(l, h);
		pozzo.getCelle().addAll(creaSetDiCelle(celleDaAggiungere));
		return pozzo;
	}

}