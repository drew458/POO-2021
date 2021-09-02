package calcolatori;

/*
Implementare il metodo calcolaMedia(int[] sequenza) che deve restituire la media dei valori contenuti nell'array sequenza.
Nota: l'array sequenza contiene sempre almeno un elemento.
*/

public class CalcolatoreMedia {
    
    public CalcolatoreMedia() {}
    
    public double calcolaMedia(int[] sequenza) {
        double somma=0;
        double cont=0;
    	for(int i=0; i<sequenza.length; i++) {
        	somma += sequenza[i];
        	cont++;
        }
    	double risultato = somma/cont;
        return risultato;
    }
    
}
