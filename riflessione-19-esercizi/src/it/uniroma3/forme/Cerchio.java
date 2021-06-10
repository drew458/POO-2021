package it.uniroma3.forme;

public class Cerchio extends AbstractForma {

	private int raggio;
	private Punto centro;
	
	public Cerchio(int raggio, Punto centro) {
		this.raggio = raggio;
		this.centro = centro;
	}
	
	public int getRaggio() {
		return this.raggio;
	}
	
	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}
	
	public Punto getCentro() {
		return this.centro;
	}
	
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	@Override
	public void trasla(int deltaX, int deltaY) {
		this.getCentro().trasla(deltaX, deltaY);
	}
	
	@Override
	public boolean equals(Object obj) {
		Cerchio that = (Cerchio) obj;
		return this.raggio == that.getRaggio() && this.getCentro().equals(that.getCentro());
	}
	
	@Override
	public boolean isDegenere() {
		return this.getRaggio() == 0;
	}

	@Override
	public Punto getPuntoDegenere() {
		if(!this.isDegenere()) return null;
		return this.getCentro();
	}
}
