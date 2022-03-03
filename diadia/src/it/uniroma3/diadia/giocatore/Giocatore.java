package it.uniroma3.diadia.giocatore;

public class Giocatore {
	
	static final public int CFU_INIZIALI = 20;

	Borsa borsa;
	private int cfu;
	
	public Giocatore() {
		this.cfu = CFU_INIZIALI;
		this.borsa = new Borsa();
	}
	
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}	
	
	public Borsa getBorsa() {
		return this.borsa;
	}
	
	public boolean isVivo() {
		return this.cfu>0;
	}
	
}
