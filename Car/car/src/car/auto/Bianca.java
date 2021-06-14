package car.auto;

import static car.gui.LettoreImmagini.leggiImmagineVettura;
import static car.sim.GeneratoreCasuale.posizioneCasuale;

import java.awt.Image;

import car.sim.Coordinate;
import car.sim.Zona;

public class Bianca extends Auto {
	
	static final private Image IMMAGINE_VETTURA_BIANCA = leggiImmagineVettura(java.awt.Color.WHITE);

	private static int idProg=0;

	public Bianca(Zona zona) {
		super(zona, idProg++);
	}
	
	@Override
	protected Coordinate decidiProssimaDestinazione() {
		return posizioneCasuale();
	}
	
	@Override
	public Image getImmagine() {
		return IMMAGINE_VETTURA_BIANCA;
	}

}
