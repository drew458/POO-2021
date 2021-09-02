package car.auto;

import static car.gui.LettoreImmagini.leggiImmagineVettura;
import static car.sim.GeneratoreCasuale.generaNposizioniCasuali;

import java.awt.Image;
import java.util.List;
import car.sim.Coordinate;
import car.sim.Zona;

public class Gialla extends Auto {
	
	static final private Image IMMAGINE_VETTURA_GIALLA = leggiImmagineVettura(java.awt.Color.YELLOW);
	
	private static int idProg=0;

	public Gialla(Zona zona) {
		super(zona, idProg++);
	}

	
	public Coordinate decidiProssimaDestinazione() {
		List<Coordinate> destinazioni = generaNposizioniCasuali(5);
		Coordinate coordinate = new Coordinate(destinazioni.get(0).getX(), destinazioni.get(1).getY());
		return coordinate;
	}
		
	@Override
	public Image getImmagine() {
		return IMMAGINE_VETTURA_GIALLA;
	}

}
