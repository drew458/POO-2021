package es15;

/* Cosa stampa questo codice? */

class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return this.x + " - " + this.y;
	}
}

public class Triangolo {
	
	private Punto coordinate;
	private int base;
	private int altezza;
	
	public Triangolo(int base, int altezza ) {
		this.base = base;
		this.altezza = altezza;
	}

	public Punto getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Punto coordinate) {
		this.coordinate = coordinate;
	}

	public int getBase() {
		return base;
	}

	public int getAltezza() {
		return altezza;
	}
	
	public String toString() {
		return this.base + " - " + this.altezza;
	}
	
	public static void main(String[] args) {
		Triangolo tri = new Triangolo(10, 20);
		
		System.out.println(tri.getCoordinate().toString());
	}
}

/*
 * Compila ma lancia un'eccezione perché perché la funzione getCoordinate() ritorna null (NullPointerException)
 * 
*/