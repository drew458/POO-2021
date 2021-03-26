
public class Sequenza {
	private int[] sequenza;

	public Sequenza(int n){
		sequenza = new int[n];
	}

	public int massimo(){
		int max=0;
		for(int indice=0; indice<sequenza.length; indice++) {
			if (sequenza[indice]>max) {
				max=sequenza[indice];
			}
			indice++;
		}
		return max;
	} 
	public void setElemento(int indice, int valore) {
		sequenza[indice] = valore;
	}
}
