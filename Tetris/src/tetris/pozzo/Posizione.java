package tetris.pozzo;

/**
 * Rappresenta una posizione, modellata come coppia di interi 
 * ascissa (x) ed ordinata (y), all'interno del {@link Pozzo}.
 * 
 */
public class Posizione {

	private int x;

	private int y;

	public Posizione(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	/**
	 * Crea un oggetto {@link Posizione} traslato rispetto all'originale.
	 * 
	 * @param dx - delta sull'ascissa  della posizione corrente
	 * @param dy - delta sull'ordinata della posizione corrente
	 * @return il nuovo oggetto {@link Posizione} traslato
	 */
	public Posizione traslata(int dx, int dy) {
		return new Posizione(getX()+dx, getY()+dy);
	}

	@Override
	public String toString() {
		return "("+getX()+","+getY()+")";
	}

	public int compareTo(Posizione posXMinore) {
		return this.getX()-posXMinore.getX() + this.getY()-posXMinore.getY();
	}

}
