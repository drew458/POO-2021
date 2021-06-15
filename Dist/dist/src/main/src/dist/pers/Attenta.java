package dist.pers;

import static dist.gui.CostantiGUI.RISORSA_IMMAGINE_BIANCO;
import static dist.gui.LettoreImmagini.leggiImmagineOggetto;

import java.awt.Image;

import dist.sim.Ambiente;

public class Attenta extends Persona {
	
	static final private Image IMMAGINE_BIANCA = leggiImmagineOggetto(RISORSA_IMMAGINE_BIANCO);
	
	private static int progId = 0;

	public Attenta(Ambiente ambiente) {
		super(ambiente, progId++);
	}

	@Override
	public Image getImmagine() {
		return Attenta.IMMAGINE_BIANCA;
	}
}
