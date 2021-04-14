package forme;

public class GruppoDiForme implements Forma {

	private static final int MAX_NUMERO_DI_FORME_GRUPPO = 10;
	
	private Forma[] componenti; 
	
	//Rappresentazione sparsa? Forma[i] nullo se non presente
	
	//Rappresentazione compatta: le prime "n" posizioni sono sempre occupate da un rif. 
	// non nullo se il gruppo ospita n forme 
	
	//costruttore
	public GruppoDiForme() {
		this.componenti = new Forma[MAX_NUMERO_DI_FORME_GRUPPO];
	}
	
	public void trasla(int deltaX, int deltaY) {
		/* semantica: trasla() tutte le componenti */
		for(int i=0; i<this.componenti.length; i++) {
			if(this.componenti[i] != null) {
				this.componenti[i].trasla(deltaX, deltaY);
			}
		}
	}
	
	public boolean aggiungiForma(Forma nuovaArrivata) {
		for(int i=0; i<this.componenti.length; i++) {
			if(this.componenti[i] == null) {
				this.componenti[i] = nuovaArrivata;
				return true;
			}
		}
		return false;
	}
	
	public Object getNumeroDiForme() {
		int counter=0;
		for(int i=0; i<this.componenti.length; i++) {
			if(this.componenti[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	
}
