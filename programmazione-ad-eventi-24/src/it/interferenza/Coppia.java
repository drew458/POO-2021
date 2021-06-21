package it.interferenza;

public class Coppia<T> {
	private T primo;
	
	private T secondo;

	public Coppia(T primo, T secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}

	public T getPrimo() {
		return this.primo;
	}

	public T getSecondo() {
		return this.secondo;
	}

}
