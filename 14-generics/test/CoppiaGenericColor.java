import static org.junit.Assert.assertSame;

import java.awt.Color;

import org.junit.Test;

public class CoppiaGenericColor {

	@Test
	public void testCoppiaDiColori() { 
	 CoppiaGenericColor<Color> colori;
	 Color rosso = new Color(255,0,0);
	 Color blue = new Color(0,0,255);
	 colori = new CoppiaGenericColor<Color>(rosso, blue);
	 assertSame(rosso,colori.getPrimo());
	 assertSame(blue,colori.getSecondo());
	 }


}
