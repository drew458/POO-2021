package es4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Es4 {
	
	/**
	 * metodo add di una lista che ha come parametro (Integer valore):se la dimensione della lista è minore di DIM_MAX
	 * allora aggiungi il valore in coda. Se no aggiungi valore in coda e elimini l'elemento più piccolo presente nella lista.
	 * Se poi valore è uguale ad un elemento gia inserito allora elimini quello vecchio e inserisci quello nuovo
	 */
	
	private static final int DIM_MAX = 10;
	
	private LinkedList<Integer> lista = new LinkedList<>();
	
	public List<Integer> aggiungiRimuovi(Integer valore){
		if(lista.size()<DIM_MAX) {
			lista.addLast(valore);
		}
		else {
			lista.remove(Collections.min(lista));
			lista.addLast(valore);
		}
		
		for(Integer elem : lista) {
			if(elem == valore) {
				lista.remove(elem);
				lista.add(valore);
			}
		}
		return lista;
	}
}
