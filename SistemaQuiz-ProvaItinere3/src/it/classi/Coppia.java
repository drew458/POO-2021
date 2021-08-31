package it.classi;

public class Coppia< T > {
	private T primo;
	private T secondo;

	public Coppia(T primo, T secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}
	
	public T getPrimo() { return primo; }
	
	public T getSecondo() { return secondo; }
}
