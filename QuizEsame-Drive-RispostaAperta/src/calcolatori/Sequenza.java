package calcolatori;

/*
Scrivere il codice del metodo public int massimo() che deve restituire
il valore piu' grande presente nell'array sequenza.
Scrivere il codice del metodo public int media() che devere restituire
la media dei valori presenti nell'array sequenza.
 */

public class Sequenza {
	private int[] sequenza;

	public Sequenza(int n){
		sequenza = new int[n];
	}

	public int massimo(){
		int max;
		// scrivere il codice di questo metodo:
		// deve restituire il valore piu' grande
		// presente nell'array sequenza
		max = sequenza[0];
		for(int i=1; i<sequenza.length-1; i++) {
			if(sequenza[i]>=max)
				max = sequenza[i];
		}

		return max;
	}

	public int media(){
		int media;
		// scrivere il codice di questo metodo:
		// deve restituire la media di tutti i valori
		// presenti nell'array sequenza
		int somma=0;
		int cont=0;
		for(int i=0; i<sequenza.length; i++) {
			somma += sequenza[i];
			cont++;
		}
		return media = somma / cont;
	}

	public void setElemento(int indice, int valore) {
		sequenza[indice] = valore;
	}

	public int getElemento(int indice) {
		return sequenza[indice];
	}
}
