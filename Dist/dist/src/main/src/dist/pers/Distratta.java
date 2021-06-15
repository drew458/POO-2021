package dist.pers;

import static dist.gui.CostantiGUI.RISORSA_IMMAGINE_ROSSO;
import static dist.gui.LettoreImmagini.leggiImmagineOggetto;

import java.awt.Image;

import dist.sim.Ambiente;;

public class Distratta extends Persona {
	
	static final private Image IMMAGINE_ROSSA = leggiImmagineOggetto(RISORSA_IMMAGINE_ROSSO);
	
	private static int progId = 0;

	public Distratta(Ambiente ambiente) {
		super(ambiente, progId++);
	}

	@Override
	public Image getImmagine() {
		return Distratta.IMMAGINE_ROSSA;
	}
}
