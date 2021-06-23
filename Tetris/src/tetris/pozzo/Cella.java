package tetris.pozzo;

import java.awt.Color;

/**
 * Rappresenta una cella contenuta nel {@link Pozzo}.
 * Possiede una {@link Posizione} ed un {@link Color}.
 *
 */
public class Cella {

	private Posizione posizione;

	private Color colore;

	public Cella(int x, int y, Color c) {
		this(new Posizione(x,y),c);
	}

	public Cella(Posizione f, Color c) {
		this.posizione = f;
		this.colore = c;
	}

	public Posizione getPosizione() {
		return this.posizione;
	}

	public Color getColore() {
		return this.colore;
	}

	/**
	 * @return una cella identica all'originale tranne per il fatto
	 *         che risulta scesa di una riga 
	 */
	public Cella scesaDiUnaRiga() {
		return new Cella(getPosizione().traslata(0, +1),this.getColore());
	}

	@Override
	public String toString() {
		return this.getPosizione().toString()+"\t"+this.getColore();
	}

	public int compareTo(Cella cellaYMinore) {
		return this.compareTo(cellaYMinore);
	}

}
