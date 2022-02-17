package contatori;

/*
Implementare il metodo contaOccorrenze(String[] sequenza, String[] daControllare),
che dato un array daControllare, conti, e inserisca in un nuovo array,
le occorrenze della parola i-esima dell'array daControllare nell'array sequenza (passato come parametro).
Le occorrenze delle parole dovranno essere posizionate seguendo gli stessi indici dell'array daControllare.
Esempio: se daControllare={"a", "b", "c"} e sequenza={"a","c","a","e"} allora il metodo dovrà restituire {2, 0, 1}.
*/

public class ContatoreOccorrenzePosizione {

    public int[] contaOccorrenze(String[] sequenza, String[] daControllare) {        
        int cont=0;
    	int[] risultato = new int[daControllare.length];
        for(int i=0; i<daControllare.length; i++) {
        	for(int j=0; j<sequenza.length; j++) {
        		if(daControllare[i].equals(sequenza[j]))
        			cont++;
        	}
        	risultato[i]=cont;
        	cont=0;
        }
        return risultato;
    }

}
