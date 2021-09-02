package bici.tipo;

import static bici.gui.LettoreImmagini.leggiImmagineBici;

import java.awt.Image;
import java.util.List;
import java.util.Random;

import bici.sim.Coordinate;
import bici.sim.CostantiSimulazione;
import bici.sim.GeneratoreCasuale;
import bici.sim.Zona;

public class Gialla extends Bici {
	
	static final private Random random = new Random();

	private int id;
	private static int idProg = 1;
	static final private Image IMMAGINE_BICI_GIALLA = leggiImmagineBici(java.awt.Color.YELLOW);
	private static List<Coordinate> destinazioniAmmissibili = GeneratoreCasuale.generaNposizioniCasuali(CostantiSimulazione.N_DESTINAZIONI);

	public Gialla(Zona zona) {
		super(zona);
		this.id = idProg++;
	}

	@Override
	protected Coordinate decidiProssimaDestinazione() {
		int next = random.nextInt(destinazioniAmmissibili.size());
		return destinazioniAmmissibili.get(next);
	}

	@Override
	public Image getImmagine() {
		return IMMAGINE_BICI_GIALLA;
	}

	@Override
	public int getId() {
		return this.id;
	}

}
