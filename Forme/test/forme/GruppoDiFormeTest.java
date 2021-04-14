package forme;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GruppoDiFormeTest {
	
	private GruppoDiForme vuoto;
	
	private GruppoDiForme gruppoCerchioUnitarioSingleton;
	
	private GruppoDiForme gruppoEsterno;
	private Punto origine;
	private Cerchio unitario;

	@Before
	public void setUp() {
		this.origine = new Punto(0,0);
		this.unitario = new Cerchio(origine, 1);
		this.vuoto = new GruppoDiForme();
		this.gruppoCerchioUnitarioSingleton = new GruppoDiForme();
		this.gruppoEsterno = new GruppoDiForme();
		this.gruppoCerchioUnitarioSingleton.aggiungiForma(this.unitario);
	}

	@Test
	public void testDiUnGruppoDiGruppoConSoloCerchioUnitario() {
		//Creo un gruppo, inserisco un solo cerchio unitario
		//Creo un gruppo con dentro solo il gruppo di cui sopra
		assertTrue(this.gruppoEsterno.aggiungiForma(this.gruppoCerchioUnitarioSingleton));
		
		//asserisco la posizione del centro del cerchio
		assertEquals(0, this.unitario.getCentro().getX());
		assertEquals(0, this.unitario.getCentro().getY());
		
		//traslo il gruppo esterno (che contiene il gruppo con il solo cerchio unitario)
		this.gruppoEsterno.trasla(+1, +1);
		
		//asserisco che il cerchio risulta spostato
		assertEquals(1, this.unitario.getCentro().getX());
		assertEquals(1, this.unitario.getCentro().getY());
	}
	
	@Test
	public void testAggiungiForma() {
		final GruppoDiForme nidificato = new GruppoDiForme();
		assertEquals(0, this.vuoto.getNumeroDiForme());
		this.vuoto.aggiungiForma(unitario);
		assertEquals(1, this.vuoto.getNumeroDiForme());
	}

}
