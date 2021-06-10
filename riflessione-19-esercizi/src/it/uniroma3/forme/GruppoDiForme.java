package it.uniroma3.forme;

import java.util.LinkedList;
import java.util.List;

public class GruppoDiForme implements Forma {

	private List<Forma> gruppoDiForme;
	
	public GruppoDiForme() {
		this.gruppoDiForme = new LinkedList<>();
	}
	
	public void trasla(int deltaX, int deltaY) {
		for(Forma forma : this.gruppoDiForme) 
			forma.trasla(deltaX, deltaY);
	}
	
	public void aggiungiForma(Forma forma) {
		this.gruppoDiForme.add(forma);
	}
}
