package it.uniroma3.forme;

public class Punto extends AbstractForma {

	private int x,y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void trasla(int deltaX, int deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	@Override
	public boolean equals(Object obj) {
		Punto that = (Punto) obj;
		return this.getX() == that.getX() && this.getY() == that.getY();
	}
	
	@Override
	public int hashCode() {
		return this.getX() + this.getY() *31;
	}
	
	@Override
	public boolean isDegenere() {
		return true;
	}

	@Override
	public Punto getPuntoDegenere() {
		if(!this.isDegenere()) return null;
		return this;
	}
}
