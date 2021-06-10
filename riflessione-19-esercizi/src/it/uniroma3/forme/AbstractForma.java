package it.uniroma3.forme;

public abstract class AbstractForma {

	public abstract void trasla(int deltaX, int deltaY);

	public abstract boolean isDegenere();
	
	public abstract Punto getPuntoDegenere();
	
	@Override
	public boolean equals(Object obj) {
		AbstractForma that = (AbstractForma) obj;
		if(this.isDegenere() && that.isDegenere()) {
			return this.getPuntoDegenere().equals(that.getPuntoDegenere());
		} else
			return false;
		
	}
}
