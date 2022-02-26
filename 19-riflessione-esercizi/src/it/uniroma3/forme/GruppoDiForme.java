package it.uniroma3.forme;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class GruppoDiForme extends AbstractForma {

	private List<AbstractForma> gruppoDiForme;
	
	public GruppoDiForme() {
		this.gruppoDiForme = new LinkedList<>();
	}
	
	public void trasla(int deltaX, int deltaY) {
		for(AbstractForma forma : this.gruppoDiForme) 
			forma.trasla(deltaX, deltaY);
	}
	
	public void aggiungiForma(AbstractForma forma) {
		this.gruppoDiForme.add(forma);
	}
	
	@Override
	public boolean isDegenere() {
		Set<Punto> puntiDegeneri = new HashSet<>();
		for(AbstractForma forma : this.gruppoDiForme) {
			puntiDegeneri.add(forma.getPuntoDegenere());
			if(!forma.isDegenere())
				return false;
		}
		return puntiDegeneri.size() == 1;
	}

	@Override
	public Punto getPuntoDegenere() {
		return this.gruppoDiForme.get(0).getPuntoDegenere();
	}
}
