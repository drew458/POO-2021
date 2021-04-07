package forme;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GruppoTest {
	
	private Gruppo vuoto;
	
	private Gruppo soloCerchioUnitario;
	
	private Punto origine;
	private Cerchio unitario;

	@Before
	public void setUp() {
		this.origine = new Punto(0,0);
		this.unitario = new Cerchio(origine, 1);
		this.vuoto = new Gruppo();
		this.soloCerchioUnitario = new Gruppo();
		this.soloCerchioUnitario.aggiungiForma(this.unitario);
	}

	@Test
	public void testDiUnGruppoDiGruppoConSoloCerchioUnitario() {
		//Creo un gruppo, inserisco un solo cerchio unitario
		//Creo un gruppo con dentro solo il gruppo di cui sopra
		this.gruppoEsterno.aggiungiForma(this.gruppoCerchioUnitarioSingleton);
		
		//asserisco la posizione del centro del cerchio
		assertEquals(1, this.unitario.getCentro().);
	}
	
	@Test
	public void testAggiungiForma() {
		final Gruppo nidificato = new Gruppo();
		assertEquals(0, this.vuoto.getNumeroDiForme());
	}

}
