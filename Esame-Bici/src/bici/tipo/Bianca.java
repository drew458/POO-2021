package bici.tipo;

import static bici.gui.LettoreImmagini.leggiImmagineBici;
import static bici.sim.GeneratoreCasuale.posizioneCasuale;

import java.awt.Image;

import bici.sim.Coordinate;
import bici.sim.Zona;

public class Bianca extends Bici {
	
	private int id;
	private static int idProg = 0;	//condivisa tra bici bianche
	static final private Image IMMAGINE_BICI_BIANCA = leggiImmagineBici(java.awt.Color.WHITE);

	public Bianca(Zona zona) {
		super(zona);
		this.id = idProg++;
	}

	protected Coordinate decidiProssimaDestinazione() {
		return posizioneCasuale();
	}
	
	public Image getImmagine() {
		return IMMAGINE_BICI_BIANCA;
	}
	
	public int getId() {
		return this.id;
	}
}
