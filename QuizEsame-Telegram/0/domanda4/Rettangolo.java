package domanda4;

class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return this.x + " - " + this.y;
	}
}

public class Rettangolo {

	private Punto coordinate;
	private int base;
	private int altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public void setCoordinate(int x, int y) {
		Punto p = new Punto(x, y);
		this.coordinate = p;
	}

	public int getAltezza() { return this.altezza; }

	public int getBase() { return this.base; }

	public Punto getCoordinate() { return this.coordinate; }

	public String toString() {
		return this.base + " - " + this.altezza;
	}

	public static void main(String[] args) {
		Rettangolo rect = new  Rettangolo(10, 20);

		System.out.println(rect.getCoordinate().toString());

	}
}

/*
 * Lancia un'eccezione perche getCoordinate() ritorna null 
 * 
 */


