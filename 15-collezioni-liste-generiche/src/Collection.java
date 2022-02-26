
public interface Collection<E> extends Iterable<E> {

	//Basic operations 
	
	// ritorna il numero di elementi presenti nella collezione
	int size(); 
	
	// ritorna true se la collezione è vuota
	boolean isEmpty(); 
	
	// ritorna true se la collezione contiene un elemento uguale a quello passato come 
	//  parametro (l'uguaglianza è verifcata dal metodo equals())
	boolean contains(Object element); 
	
	// aggiunge alla collezione l'elemento passato; ritorna true se la collezione è 
	//  cambiata dopo la chiamata a questo metodo
	boolean add(E element); //optional 
	
	// rimuove dalla collezione gli elementi uguali all'oggetto passato come parametro 
	//  (l'uguaglianza è verifcata dal metodo equals()). Ritorna true se la collezione è 
	//	cambiata dopo l'invocazione del metodo
	boolean remove(Object element); //optional 
	
	// restituisce un oggetto Iterator, per iterare sugli elementi della collezione
	Iterator<E> iterator(); 
	

	//Bulk operations 
	
	// ritorna true se la collezione contiene tutti gli elementi della collezione passata 
	//  come parametro
	boolean containsAll(Collection<?> c); 
	
	// aggiunge alla collezione tutti gli elementi della collezione passata come parametro; 
	//  ritorna true se la collezione è cambiata dopo l'invocazione di questo metodo
	boolean addAll(Collection<? extends E> c); //optional 
	
	// rimuove dalla collezione tutti gli elementi uguali (l'uguaglianza è verifcata dal 
	//	metodo equals()) che sono contenuti nella collezione passata come parametro; 
	//	ritorna true se la collezione è cambiata dopo l'invocazione di questo metodo
	boolean removeAll(Collection<?> c); //optional 
	
	// rimuove dalla collezione tutti gli elementi che non sono presenti nella collezione 
	//  passata come parametro; ritorna true se la collezione è cambiata dopo l'invocazione di 
	//  questo metodo
	boolean retainAll(Collection<?> c); //optional 
	
	// rimuove tutti gli elementi dalla collezione
	void clear(); //optional 
	
	
	//Array operations 
	
	Object[] toArray(); 
	<T> T[] toArray(T[] a);

}
