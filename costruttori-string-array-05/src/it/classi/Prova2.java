package it.classi;

public class Prova2 {

	static void f(long i) { System.out.println("long"); }
	static void f(double i) { System.out.println("double"); }
	public static void main(String[] args) {
		f(5); // stampa long
		f(5f); // stampa double
	}
}
