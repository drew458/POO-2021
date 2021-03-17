
public class Rettangolo {
	private int base;
	private int altezza;
	private Punto vertice;
	
	public Rettangolo (Punto vertice, int base, int altezza) {
		this.vertice=vertice;
		this.altezza=altezza;
		this.base=base;
	}
	
	public Rettangolo() {
		// TODO Auto-generated constructor stub
	}

	public int getBase() {
		return base;
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public Punto getVertice() {
		return vertice;
	}
	
	public void sposta(int deltaX, int deltaY) {
		vertice.trasla(deltaX, deltaY);
	}
	
	//Overloading
	public void scala(float fattore) {
		this.scala(fattore, fattore);
	}
	
	public void scala(float fattoreBase, float fattoreAltezza) {
		this.base *= fattoreBase;
		this.altezza *= fattoreAltezza;
	}
}
