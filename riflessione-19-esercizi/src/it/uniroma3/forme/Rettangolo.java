package it.uniroma3.forme;

public class Rettangolo extends AbstractForma {

	private int altezza, base;
	private Punto vertice;
	
	public Rettangolo(int altezza, int base, Punto vertice) {
		this.altezza = altezza;
		this.base = base;
		this.vertice = vertice;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public Punto getVertice() {
		return vertice;
	}

	public void setVertice(Punto vertice) {
		this.vertice = vertice;
	}
	
	@Override
	public void trasla(int deltaX, int deltaY) {
		this.getVertice().trasla(deltaX, deltaY);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj))
			return true;
		
		
		Rettangolo that = (Rettangolo) obj;
		return this.getBase() == that.getBase() 
				&& this.getAltezza() == that.getAltezza()
				&& this.getVertice() == that.getVertice();
	}
	
	@Override
	public boolean isDegenere() {
		return this.getBase() == 0 && this.getAltezza() == 0;
	}

	@Override
	public Punto getPuntoDegenere() {
		if(!this.isDegenere()) return null;
		return this.getVertice();
	}
}
