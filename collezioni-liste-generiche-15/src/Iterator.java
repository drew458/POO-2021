
public interface Iterator<E> {

	// ritorna true se e solo se esiste un altro 
	//  elemento da scandire
	boolean hasNext();
	
	// restituisce il prossimo elemento della 
	//  collezione nella scansione corrente ed avanza
	E next();
	
	void remove();
}
